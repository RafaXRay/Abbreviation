package ru.Rudenko;

import java.util.*;

/**
 * DoubleProperties
 * Класс DoubleProperties содержит main. Принимает в 1 параметре строку вида: age=23.4;height=185;prop=;…
 * Распарсить строку и вывести все пары name -> value, используя split(), parseDouble() и форматированный вывод
 * Модифицировть программу, чтобы она обрабатывала строки вида, где запятая - разделитель значений массива:
 * prop1=23.4;prop2=38.8,22.3,-2;…
 * 5 баллов
 */
public class DoubleProperties {
    public static void main(String[] args) {
        String inStr = Arrays.toString(args).replace("[","").replace("]","").trim();
        String[] tempParameters;
        if (inStr.indexOf(";") > 0) {
            tempParameters = inStr.split(";");
        } else {
             tempParameters = inStr.split(",");
        }
        Map<String, Double> parameters = new HashMap<String, Double>();
        parameters = getParameters(tempParameters);

        for (Map.Entry<String, Double> x : parameters.entrySet()) {
            System.out.println(x.getKey() + "\t" + x.getValue());
        }
    }

    private static Map<String, Double> getParameters (String[] allParameters) {
        Map<String, Double> parameter = new HashMap<String, Double>();
        String[] temp;
        String k;
        double v;
        int i = 0;

        for (String p : allParameters) {
            if (p.indexOf("=") > 0) {
                temp = p.split("=");
                k = temp[0];
                v = Double.parseDouble(temp[1]);
            } else {
                i++;
                k = "param" + i;
                v = Double.parseDouble(p);
            }
            parameter.put(k, v);
        }
        return parameter;
    }
}

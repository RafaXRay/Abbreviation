package ru.Rudenko;

/**
 * Скорость.
 * Напишите функцию, на входе которой расстояние до места назначения (S, м) и время в пути (T, мин). Вычислить скорость
 * (км/ч). Напишите тесты.
 * 3 балла.
 */
public class Speed {
    public double getSpeed(int s, int t) {
        // S = V*t -> V = S/t
        double V;

        V = (double) (s / t) * 0.06;
        System.out.println(V);
        return V;
    }
}

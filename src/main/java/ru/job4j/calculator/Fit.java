package ru.job4j.calculator;

/**
 * Класс Fit предназначен для расчета идеального веса на основе роста.
 * Предоставляет методы для расчета веса для мужчин и женщин.
 */
public class Fit {
    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    /**
     * Рассчитывает идеальный вес для мужчин на основе их роста.
     * @param height Рост мужчины в сантиметрах.
     * @return Идеальный вес в килограммах.
     */
    public static double calculateManWeight(short height) {
        double result = (height - BASE_HEIGHT_MAN) * WEIGHT_COEFFICIENT;
        return result;
    }

    /**
     * Рассчитывает идеальный вес для женщин на основе их роста.
     * @param height Рост женщины в сантиметрах.
     * @return Идеальный вес в килограммах.
     */
    public static double calculateWomanWeight(short height) {
        double result = (height - BASE_HEIGHT_WOMAN) * WEIGHT_COEFFICIENT;
        return result;
    }

    /**
     * Выводит в консоль расчетные значения идеального веса для мужчин и женщин.
     * @param height Рост, для которого необходимо рассчитать вес.
     */
    public static void printWeightResults(short height) {
        double manWeight = calculateManWeight(height);
        double womanWeight = calculateWomanWeight(height);
        System.out.println("Вес мужчины с ростом " + height + " см составляет: " + manWeight + " кг");
        System.out.println("Вес женщины с ростом " + height + " см составляет: " + womanWeight + " кг");
    }

    /**
     * Главный метод для демонстрации расчета идеального веса.
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        short height = 187;
       printWeightResults(height);
    }
}
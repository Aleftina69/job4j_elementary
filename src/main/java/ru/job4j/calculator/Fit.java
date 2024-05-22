package ru.job4j.calculator;

/**
 * Класс Fit рассчитывает идеальный вес для мужчин и женщин на основе их роста.
 */
public class Fit {
    private static final double MAN_CONSTANT = 100;
    private static final double WOMAN_CONSTANT = 110;
    private static final double MULTIPLIER = 1.15;

    /**
     * Рассчитывает идеальный вес для мужчины на основе его роста.
     *
     * @param heightMan рост мужчины в сантиметрах
     * @return идеальный вес для мужчины
     */
    public static double manWeight(short heightMan) {
        if (heightMan <= 0 || heightMan >= 300) {
            throw new IllegalArgumentException("Рост должен быть в диапазоне от 1 до 299 см.");
        }
        return (heightMan - MAN_CONSTANT) * MULTIPLIER;
    }

    /**
     * Рассчитывает идеальный вес для женщины на основе ее роста.
     *
     * @param heightWoman рост женщины в сантиметрах
     * @return идеальный вес для женщины
     */
    public static double womanWeight(short heightWoman) {
        if (heightWoman <= 0 || heightWoman >= 300) {
            throw new IllegalArgumentException("Рост должен быть в диапазоне от 1 до 299 см.");
        }
        return (heightWoman - WOMAN_CONSTANT) * MULTIPLIER;
    }

    /**
     * Главный метод для тестирования методов класса Fit.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        double man = Fit.manWeight(heightMan);
        System.out.println("Идеальный вес для мужчины ростом 187 см: " + man + " кг");

        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Идеальный вес для женщины ростом 170 см: " + woman + " кг");
    }
}
package com.company;

import java.io.IOException;

public interface DataConnection {
    /**
     * Метод, определяющий колличество людей,
     * рожденыых в указанный год.
     * @param sum - общее количество людей рожденнных после 1990
     * @param year - год
     * @return - sum
     * @throws IOException
     */
    int loadData(int sum, String year) throws IOException;

    /**
     * Метод, сохраняющий информацию о рождаемости до
     * указанного года.
     * @param year - год
     * @param qq - квантиль-квантиль
     * @param lineCount - текущая строка
     * @throws IOException
     */
    void saveData(int year, double qq, int lineCount) throws IOException;
}

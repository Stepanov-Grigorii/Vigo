package com.company;

import java.io.IOException;

/**
 * @param
 */
public interface DataConnection {
    /**
     * @param sum
     * @param year
     * @return
     * @throws IOException
     */
    int loadData(int sum, String year) throws IOException;

    void saveData(int year, double qq, int lineCount) throws IOException;
}

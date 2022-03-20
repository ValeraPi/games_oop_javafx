
package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] table) {
        boolean rsl = false;
        for (int i = 0; i < table.length; i++) {
            if (table[i][i] == 1 && (monoHorizontal(table, i) || monoVertical(table, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] table, int row) {
        boolean result = true;
        for (int i = 0; i < table.length; i++) {
            if (table[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] table, int cell) {
        boolean result = true;
        for (int i = 0; i < table.length; i++) {
            if (table[i][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
package com.pierceecom.pgmtest;

/**
 * Methods to implement for programming test. Implement these in ProgramminTasksImpl
 * @author pejo
 */
public interface ProgrammingTasks {
    /**
     * Reverse a string e.g."string" => "gnirts"
     * @param s
     * @return
     */
    default String reverse(String s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Calculates fibonacci number for 'n' 0,1,1,2,3,5,8,13....
     * @param n
     * @return
     */
    default int fib(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Sums values that are numeric in a string and ignores characters that are not
     * @param numbers
     * @return
     */
    default int sumString(String numbers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Turns the order in an array
     * @param arr
     * @return
     */
    default int[] reverseArray(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Finds the larges number in an array
     * @param nums
     * @return
     */
    default int findHigh(int[] nums) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Transforms RGB numbers to a hexadecimal string starting with #
     * numbers below F (16)  starts with "0"
     * e.g. rgbToHex(0,255,0) => "#00FF00"
     * @param r
     * @param g
     * @param b
     * @return
     */
    default String rgbToHex(int r, int g, int b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}

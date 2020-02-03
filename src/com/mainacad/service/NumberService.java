package com.mainacad.service;

public class NumberService {

    public int getSumByDivision(int number) {
        int result = 0;

        return result;
    }

    public Integer getSumByTypeManipulation(int number) {
        Integer result = 0;
        String numberAsString = String.valueOf(number);

        // "12345" -> {'1','2','3','4','5'}
        char[] symbols = numberAsString.toCharArray();

        for (int i = 0; i < symbols.length; i++) {

            result += symbols[i];

        }

       /* for (char symbol : symbols) {

            result = result + symbol;
        }

        int i = 0;
        while (i < symbols.length) {
            result = result + symbols[i];
            i++;
        }

        i = 0;
        do {
            result = result + symbols[i];

            i++;
        }   while (i < symbols.length); */


            return result;
    }
}



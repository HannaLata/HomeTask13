package com.mainacad;

import com.mainacad.service.NumberService;

public class ApplicationRunner {


    public static void main(String[] args) {


        System.out.println(NumberService.getSumByDivision(12345));

        System.out.println(NumberService.getSumByTypeManipulation(12345));


    }
}

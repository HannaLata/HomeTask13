package com.mainacad.service;

import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.NumberUp;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    @Test
    void getSumByDivision() {
        int result = NumberService.getSumByDivision(23456);
        assertEquals(20, result);
    }

    @Test
    void getSumByTypeManipulation() {
        int result = NumberService.getSumByTypeManipulation(23456);
        assertEquals(20, result);
    }
}
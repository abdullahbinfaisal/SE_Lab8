package com.example.lab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    private CustomList list;
    private City calgary;
    private City edmonton;

    @BeforeEach
    public void setUp() {
        list = new CustomList();
        calgary = new City("Calgary", "AB");
        edmonton = new City("Edmonton", "AB");
    }

    @Test
    public void testHasCityReturnsTrueWhenCityExists() {
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testHasCityReturnsFalseWhenCityAbsent() {
        list.addCity(calgary);
        assertFalse(list.hasCity(edmonton));
    }
}
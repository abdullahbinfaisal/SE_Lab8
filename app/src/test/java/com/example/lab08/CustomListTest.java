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

    @Test
    public void testDeleteCityRemovesCityFromList() {
        list.addCity(calgary);
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCityDoesNotAffectOtherCities() {
        list.addCity(calgary);
        list.addCity(edmonton);
        list.deleteCity(calgary);
        assertTrue(list.hasCity(edmonton));
    }
    @Test
    public void testCountCitiesReturnsZeroOnEmptyList() {
        assertEquals(0, list.countCities());
    }

    @Test
    public void testCountCitiesReturnsCorrectCount() {
        list.addCity(calgary);
        list.addCity(edmonton);
        assertEquals(2, list.countCities());
    }

    @Test
    public void testCountCitiesDecreasesAfterDelete() {
        list.addCity(calgary);
        list.addCity(edmonton);
        list.deleteCity(calgary);
        assertEquals(1, list.countCities());
    }
}
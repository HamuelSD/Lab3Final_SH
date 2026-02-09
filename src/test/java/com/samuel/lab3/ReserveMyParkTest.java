package com.samuel.lab3;

import com.samuel.lab3.Exceptions.InvalidAgeException;
import com.samuel.lab3.Exceptions.NightReservationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class ReserveMyParkTest {

    ReserveMyPark calculator;

    @BeforeEach
    void setUp() {
        calculator = new ReserveMyPark();
    }

    // This reads the CSV file and runs my tests
    @ParameterizedTest
    @CsvFileSource(resources = "/lab3_data.csv")
    public void testStayPrice_ValidInputs(int nights, int age, boolean isRes, boolean isVet, double expected) throws Exception {

        double actual = calculator.calculateStayPrice(nights, age, isRes, isVet);

        // Assert that Expected equals Actual
        assertEquals(expected, actual, 0.01,
                "Failed on Nights: " + nights + " Age: " + age);
    }

    // Exception Tests (first three on my table)
    @Test
    void testInvalidNights_Zero() {
        assertThrows(NightReservationException.class, () -> {
            calculator.calculateStayPrice(0, 30, false, false);
        });
    }

    @Test
    void testInvalidNights_Fifteen() {
        assertThrows(NightReservationException.class, () -> {
            calculator.calculateStayPrice(15, 30, false, false);
        });
    }

    @Test
    void testInvalidAge() {
        assertThrows (InvalidAgeException.class, () -> {
            calculator.calculateStayPrice(1,-1,false,false);
        });
    }
}

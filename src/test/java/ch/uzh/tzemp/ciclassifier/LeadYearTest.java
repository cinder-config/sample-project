package ch.uzh.tzemp.ciclassifier;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LeadYearTest {

    @Test
    public void simpleTest() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeapYear(2020));
    }

    @Test
    public void anotherTest() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeapYear(2024));
    }

    @Test
    public void failingTest() {
        LeapYear leapYear = new LeapYear();
        assertFalse(leapYear.isLeapYear(2023));
    }
}

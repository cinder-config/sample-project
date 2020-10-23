package ch.uzh.tzemp.ciclassifier;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LeadYearTest {

    @Test
    public void simpleTest() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeapYear(2020));
    }
}

package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreelancerServiceTest {

    @Test
    public void testCalculateRestMonth1() {
        // Arrange
        FreelancerService service = new FreelancerService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        // Act
        int actual = service.calculate(income, expenses, threshold);

        // Assert
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateRestMonth2() {
        // Arrange
        FreelancerService service = new FreelancerService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        // Act
        int actual = service.calculate(income, expenses, threshold);

        // Assert
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}
package ru.netology.service;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0;
        int wallet = 0; // исправлено с Int на int
        for (int i = 0; i < 12; i++) {
            if (wallet >= threshold) {
                wallet /= 3; // разделение кошелька на 3
                counter++;
            } else {
                wallet += income;
                wallet -= expenses;
            }
        }
        return counter;
    }
}
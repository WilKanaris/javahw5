package ru.netology.services;

public class FreelanceChillService {
    public int calcMonth(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;

        for (int month = 1; month < 13; month++) {
            if (money >= threshold) {
                count++;
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + (money - expenses - ((money - expenses) / 3)));
                money = ((money - expenses) / 3);
            } else {
                System.out.println("Месяц " + month + ". Денег " + money + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;
            }
        }
        return count;
    }
}
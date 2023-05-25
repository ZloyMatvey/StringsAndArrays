package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж
    public int AmountOfSales(int[] salesArray) {
        int sum = 0;
        for (int i = 0; i < salesArray.length; i++) {
            sum = sum + salesArray[i];
        }
        return sum;
    }

    //Средняя сумма всех продаж
    public int AverageSalesAmount(int[] salesArray) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < salesArray.length; i++) {
            sum = sum + salesArray[i];
            count++;
        }
        int average = sum / count;
        return average;
    }

    // Номер месяца, в котором был пик продаж
    public int MonthOfMaximumSales(int[] salesArray) {
        int maxMonth = 0;
        for (int i = 0; i < salesArray.length; i++) {
            if (salesArray[i] >= salesArray[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж
    public int MonthOfMinimumSales(int[] salesArray) {
        int minMonth = 0;
        for (int i = 0; i < salesArray.length; i++) {
            if (salesArray[i] <= salesArray[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев, в которых продажи были ниже среднего
    public int MonthsBelowAverage(int[] salesArray) {
        int count = 0;
        int average = AverageSalesAmount(salesArray);

        for (int i = 0; i < salesArray.length; i++) {
            if (salesArray[i] < average) {
                count++;
            }
        }
        return count;
    }

    //Количество месяцев, в которых продажи были выше среднего
    public int MonthsAboveAverage(int[] salesArray) {
        int count = 0;
        int average = AverageSalesAmount(salesArray);

        for (int i = 0; i < salesArray.length; i++) {
            if (salesArray[i] < average) {
                count++;
            }
        }
        return count;
    }
}

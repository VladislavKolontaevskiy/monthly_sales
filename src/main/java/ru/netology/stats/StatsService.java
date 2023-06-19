package ru.netology.stats;

public class StatsService {

    //1.сумма всех продаж
    public int TotalSales(int[] sales) {
        int sum = 0;
        for (int value : sales) {
            sum += value;
        }
        return sum;
    }

    //2.средняя сумма продаж в месяц
    public double AverageSales(int[] sales) {
        return (double) TotalSales(sales) / sales.length;
    }

    //3.номер месяца, в котором был максимум продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; //+1 так как индексы массива начинаются с 0, а месяцы с 1
    }

    //4.номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i; //
            }
        }
        return minMonth + 1;
    }

    //5.количество месяцев, в которых продажи были ниже среднего
    public int salesLessAverage(int[] sales) {
        int numberOfMonth = 0;
        double averageSales = AverageSales(sales);
        for (int i = 0; i < 12; i++) {
            if (sales[i] < averageSales) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }
    //6.количество месяцев, в которых продажи были выше среднего
    public int salesMoreAverage(int[] sales) {
        int numberOfMonth = 0;
        double averageSales = AverageSales(sales);
        for (int i = 0; i < 12; i++) {
            if (sales[i] > averageSales) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }
}
package ru.netology.javaqa.SalesCalculationSrvise.SalesStatistic;

public class StatsServise {
    public long sum(long[] sales){
        long totalSale = 0;
        for ( long sale : sales) {
          totalSale += sale;
        }
        return totalSale;
    }

    public long AverageAmount(long [] sales) {
        long totalSale = 0;
        for ( long sale : sales) {
            totalSale += sale;
        }
        long averageSalesAmounte = totalSale / 12;
        return averageSalesAmounte;
    }

    public int MaximumSale (long[] sales) {
        int MaximumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaximumMonth]) {
                MaximumMonth = i;
            }
        }
        return  MaximumMonth + 1;

    }
    public int MinimumSale (long[] sales) {
        int MinimumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinimumMonth]) {
                MinimumMonth = i;
            }
        }
        return MinimumMonth + 1;
    }

    public int BelowAverageSales (long[] sales){
        int result = 0;
        for (long sale : sales) {
            if (sale < AverageAmount(sales)) {
                result++;
            }
            
        }
        return result;
    }

    public int HigherAverageSales (long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > AverageAmount(sales)) {
                result++;
            }

        }
        return result;
    }
}

package ru.netology.stats;

public class StatisticsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        long sum = calculateSum(sales);
        long length = 0;
        for (long sale : sales) {
            length += 1;
        }
        return sum / length;
    }

    public long findMax(long[] sales) {
        long currentMax = sales[0];
        long monthNumber = 0;
        long resultMonth = 0;
        for (long sale : sales) {
            monthNumber += 1;
            if (currentMax <= sale) {
                currentMax = sale;
                resultMonth = monthNumber;
            }
        }
        return resultMonth;
    }

    public long findMin(long[] sales) {
        long currentMin = sales[0];
        long monthNumber = 0;
        long resultMonth = 0;
        for (long sale : sales) {
            monthNumber += 1;
            if (currentMin >= sale) {
                currentMin = sale;
                resultMonth = monthNumber;
            }
        }
        return resultMonth;
    }

    public long calculateBelowAverage(long[] sales) {
        long resultMonths = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                resultMonths += 1;
            }
        }
        return resultMonths;
    }

    public long calculateAboveAverage(long[] sales) {
        long resultMonths = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                resultMonths += 1;
            }
        }
        return resultMonths;
    }
}
\n

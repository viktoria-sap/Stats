package ru.netology.stats;

import java.util.Arrays;

public class StatisticsService {
        public long calculateSum(long[] sales) {
        long sum = 0;
            for (long sale : sales) {
            // аналог sum = sum + purchase;
            sum += sale;
            }
        return sum;
        }

        public long calculateAverage(long[] sales) {
            long sum = 0;
            long average = 0;
            long length = 12;
            for (long sale : sales) {
                // аналог sum = sum + sale;
                sum += sale;
                average = sum / length;
            }
            return average;
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
        long sum = 0;
        long average = 0;
            for (long sale : sales) {
            sum = Arrays.stream(sales).sum();
            average = sum / 12;
                if (sale < average) {
                resultMonths += 1;
                }
            }
        return resultMonths;
        }

        public long calculateAboveAverage(long[] sales) {
        long resultMonths = 0;
        long sum = 0;
        long average = 0;
            for (long sale : sales) {
            sum = Arrays.stream(sales).sum();
            average = sum / 12;
                if (sale > average) {
                resultMonths += 1;
                }
            }
        return resultMonths;
        }

}

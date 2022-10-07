package ru.netology.SQRT;


public class SQRService {

    public int calculateSQRService(int min, int max) {
        int count = 0;
        for (int i = 1; i <= max; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}




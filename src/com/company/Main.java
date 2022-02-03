package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        double numbers [] = {-5.7, 3.5, 5.6, -7.5 , 3.9, -9.9, 9.9, 5.5, -5.6, 2.4, -2.6, -8.0, 7.7, -5.1, 7.9};
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers [i] < 0) {
                continue;
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
    public static void word () {
        int arr [] = {-4, -2, 2, 3, 6, 8};
        for (int i = 0; i < arr.length; i++) {
            int main = arr [i];
            int all = i;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[j] < main) {
                    main = arr[j];
                    all = j;
                }
                if (i != all) {
                    int tmp = arr [i];
                    arr[i] = arr [all];
                    arr [all] = tmp;
                }

            }

        }
    }
}

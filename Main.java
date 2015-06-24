package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int n = 0;
        long veryBigSum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Integer[] a = new Integer[n];

        /***** To enter the data ****/
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {

            list.add(sc.nextInt());

            //a[i] = sc.nextInt();

            a = list.toArray(new Integer[i]);
        }

        /***** To Calculate Sum ****/
        for (int i = 0; i < n; i++) {
            veryBigSum = veryBigSum + a[i];
        }
        System.out.println(veryBigSum);
    }
}

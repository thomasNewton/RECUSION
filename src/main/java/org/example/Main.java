package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(sumit(10));
        System.out.println((sum_between(5,10)));
    }





    public static int sumit(int num) {
        if (num > 1) {
            return (num + sumit(num - 1));
        } else {
             return num;
        }
    }



    public static int sum_between(int start, int end) {
        if (start == end) {
            return end;
        } else {
            return (end + sum_between(start, end - 1));

        }
    }
}
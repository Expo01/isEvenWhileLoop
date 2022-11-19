package com.company;

public class Main {

    public static void main(String[] args) {
        printLoop(4, 20);
    }

    public static void printLoop(int num, int end) {
        int evenCount = 0;
        while (num<end){
            num++;
            if (!isEven(num)){
                continue;
            }
            System.out.println(num + " is an even number");
            evenCount++;
            if (evenCount >= 5){
                break;
            }
        }
    }

    public static boolean isEven(int testNum){
        if (testNum % 2 == 0){
            return true;
        } else return false;
    }
}

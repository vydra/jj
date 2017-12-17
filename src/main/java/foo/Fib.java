package foo;

import javax.swing.*;
public class Fib {
    public static void main(String[] args) {
        String fibNumsEntered = JOptionPane.showInputDialog("How many fib nums?");

        //convert from string to int
        int fibNums = Integer.parseInt( fibNumsEntered );

        //fill array with 1 thru fibNums
        int[] numbers = new int[fibNums];
        for(int i=0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }

        //fill array of fibonacci numbers
        int[] fibonacci = new int[fibNums];
        int first = 0, second = 0;
        for(int i=0; i < fibNums; i++) {
           if(i==0) {
               first = 0;
               fibonacci[i] = first;
           } else if (i == 1) {
               second = 1;
               fibonacci[i] = first + second;
           } else {
               fibonacci[i] = first + second;
               first = second;
               second = fibonacci[i];
           }
        }

        //print with column titles
        System.out.println("Numbers\t\t" + "Fibonacci\t\t" + "Running total");
        int sum = 0;
        for(int i=0; i < numbers.length;i++) {
            sum = sum + fibonacci[i];
            System.out.println(numbers[i] + "\t\t\t\t" + fibonacci[i] + "\t\t\t\t" + sum);
        }

    }
}

package com.company;
import java.util.Scanner;

public class Main {

    static void addition(int num1,int num2){
        System.out.println("Final Answer is " +(num1+num2));
    }

    static void substraction(int num1,int num2){
        System.out.println("Final Answer is " +(num1-num2));
    }

    static void multiply(int num1,int num2){
        System.out.println(" Final Answer is " +(num1*num2));
    }

    static void divide(int num1,int num2){
        System.out.println("Final Answer is " +(num1/num2));
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do ?\n\nPress num 1 for sum\nPress num 2 for different\nPress num 3 for multiply \nPress num 4 for divide ");
        System.out.println("Enter your option :"  );

        int operator = scanner.nextInt();

        System.out.println("Enter  Num 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter  Num 2 : ");
        int num2 = scanner.nextInt();

        switch (operator) {
            case 1 -> addition(num1, num2);
            case 2 -> substraction(num1, num2);
            case 3 ->multiply(num1, num2);
            case 4 ->divide(num1, num2);
            default -> System.out.println("Invalid operator");
        }



    }
}

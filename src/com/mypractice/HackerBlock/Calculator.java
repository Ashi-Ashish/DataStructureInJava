package com.mypractice.HackerBlock;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        int result;
        int first;
        int second;

        while (ch != 'X') {

            switch (ch) {
                case '+':

                    first = s.nextInt();
                    second = s.nextInt();
                    result = first + second;
                    System.out.println(result);
                    break;

                case '-':

                    first = s.nextInt();
                    second = s.nextInt();
                    result = first - second;
                    System.out.println(result);
                    break;

                case '*':
                    first = s.nextInt();
                    second = s.nextInt();
                    result = first * second;
                    System.out.println(result);
                    break;

                case '/':
                    first = s.nextInt();
                    second = s.nextInt();
                    if (second == 0) {
                        System.out.println("Invalid operation. Try again.");
                        break;
                    } else {
                        result = first / second;
                        System.out.println(result);
                        break;
                    }
                case '%':
                    first = s.nextInt();
                    second = s.nextInt();
                    if (second == 0) {
                        System.out.println("Invalid operation. Try again.");
                        break;
                    } else {
                        result = first % second;
                        System.out.println(result);
                        break;
                    }
                case 'x':
                    return;
                /*case 'X':
                    return;*/
                default:
                    System.out.println("Invalid operation. Try again.");
                    break;
            }
            ch = s.next().charAt(0);
        }
    }
}

package com.company;
import  java.util.Scanner;

public class Convert {
    public static void  main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Input number of minutes: ");
    double min = input.nextDouble();

    double years =(int) min / 60 / 24 / 365;
    double days = (int) min / 60 / 24;

    System.out.println("Numer of years = " + years);
    System.out.println("Number of days = " + days);

    }
}

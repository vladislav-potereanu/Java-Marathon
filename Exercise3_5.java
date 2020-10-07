package com.company;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Exercise3_5 {
    public static void main (String[] args){

    Scanner input1 = new Scanner(System.in);
    System.out.println("Input first number: ");
    double x = input1.nextDouble();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Input Second number: ");
    double y = input2.nextDouble();

    System.out.println("addition = "+(x+y));
    System.out.println("substraction = "+(x - y));
    System.out.println("multiplication = "+(x*y));
    System.out.println("division = "+(x/y));
    System.out.println("average = "+((x+y)/2));
    System.out.println("remainder = "+(x%y));

    }
}

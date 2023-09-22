package com.company;
import java.util.Scanner;
public class CWH_06_Exercise01 {
    public static void main(String[]args) {
        System.out.println("Percentage of a Student in CBSE Exam");
        Scanner sc = new Scanner(System.in);

        System.out.println("Marks in Subject 1 is :");
        float a = sc.nextFloat();

        System.out.println("Marks in Subject 2 is :");
        float b = sc.nextFloat();

        System.out.println("Marks in Subject 3 is :");
        float c = sc.nextFloat();

        System.out.println("Marks in Subject 4 is :");
        float d = sc.nextFloat();

        System.out.println("Marks in Subject 5 is :");
        float e = sc.nextFloat();

        float percentage = (a + b + c + d + e)/5;
        System.out.println("Percentage of Student is :");
        System.out.println(percentage);


        ////Logic which i used before, which is lengthy
 //       float sum = a + b + c + d + e;
 //       System.out.println("Total Marks Obtained :");
 //       System.out.println(sum);

 //       System.out.println("Percentage of Student is :");
 //       System.out.println(sum/500*100);
    }
}

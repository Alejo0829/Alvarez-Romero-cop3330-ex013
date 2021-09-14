package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solutions
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "What is the principal amount? " );
        double pamount = sc.nextDouble();
        System.out.println( "What is the rate? " );
        double rate = sc.nextDouble();
        System.out.println( "What is the number of years? " );
        double years = sc.nextDouble();
        System.out.println( "What is the number of times the interest is compound per year? " );
        double compoundt = sc.nextDouble();

       double investment = (pamount * Math.pow((1 + ((rate/100)/compoundt)),(compoundt*years)));
        System.out.println(pamount + " invested at "+ rate+"% for "+ years+ " compounded "+ compoundt+" times per year is "+ investment);
    }
}

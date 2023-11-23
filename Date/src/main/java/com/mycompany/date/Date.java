/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.date;

import java.util.Scanner;

/**
 *
 * @author hassan
 */
public class Date {

    public static void main(String[] args) {
          
          Scanner input = new Scanner(System.in);
          int choice;
          do{
          System.out.println("Choose Your Choice : ");
          System.out.println("1. Add Two Dates  ");
          System.out.println("2. Subtract Two Dates  ");
        choice = input.nextInt();
       switch (choice){
           case 1 : 
               AddDates();
               break;
           case 2 : 
               SubDates();
               break;
    }
    }while(choice!=3);
          }
    static void AddDates(){
        Scanner input = new Scanner(System.in);
        int day1,month1 , year1;
        int day2, month2 , year2;
        System.out.println("Year-Month-Day");
        year1 = input.nextInt();
        month1 = input.nextInt();
        day1 = input.nextInt();
        year2 = input.nextInt();
        month2 = input.nextInt();
        day2 = input.nextInt();
       
        
        int carryMonth = 0; 
        int carryYear = 0; 
        int sumDays ;
        sumDays = day1 + day2 ;
        if ( sumDays >= 30 ){
            sumDays = sumDays - 30 ;
            carryMonth++;  
        }
         int sumMonth ;
        sumMonth = month1 + month2 + carryMonth  ; 
        if ( sumMonth >= 12 ){
            sumMonth = sumMonth - 12 ;
            carryYear++;
        }
        int  sumYear ;
        sumYear = year1 + year2 + carryYear ; 
        System.out.println(sumYear+"/"+sumMonth+"/"+sumDays);
    }
    static void SubDates(){
         Scanner input = new Scanner(System.in);
        int day1,month1 , year1;
        int day2, month2 , year2;
        System.out.println("Year-Month-Day");
       year1 = input.nextInt();
        month1 = input.nextInt();
        day1 = input.nextInt();
        year2 = input.nextInt();
        month2 = input.nextInt();
        day2 = input.nextInt();
       
        int carryMonth = 0; 
        int subDays = 0 ;
        if ( day1 < day2 ){
            carryMonth++;
            day1 = day1 + 30 ;
            subDays = day1 - day2;
        }
         int subMonth = 0 ;
        if ( month1 < month2 ){
           month1 =  month1 - carryMonth + 12;
           subMonth = month1 - month2;
        }
        int  subYear ;
        subYear = (year1-1) - year2  ; 
        System.out.println(subYear+"/"+subMonth+"/"+subDays);
    }
}

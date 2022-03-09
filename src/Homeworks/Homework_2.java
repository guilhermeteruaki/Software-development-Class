/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homeworks;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author guilh
 * This is HOMEWORK 2 from week 2
 */
public class Homework_2 {
    public void homework2(){
        Scanner scanInput = new Scanner(System.in); //initiates the scanner
        boolean endLoop = false; //manages the loop
        double userGrade;
        do { //a loop to run the question again if the input is invalid
            System.out.println("Please provide your grade, use values 0 - 100"); //ask the question
            try{ //try/catch for scanner 
                userGrade = scanInput.nextDouble(); //gets the next double number inputed
                if(userGrade<0 || userGrade>100){ //checks if the grade is a valid number between 0-100
                    System.out.println("That is not a valid grade");
                    homework2(); /*This reruns the program in case a invalid grade is used,
                    is it better to call the main metod again or to use do/whiles ?*/
                } else{
                    double proportionalGrade = (userGrade/100)*25; //manipulates the variable as needed
                    System.out.printf("Your grade was %.1f%% that is equivalent to "
                                     + "%.2f%% of your total grade.\n", userGrade, proportionalGrade);
                }
                endLoop = true; //set the loop to end since inputs were valid.
                      
            }catch (InputMismatchException e) {
                System.out.println("that´s not a number, try again"); //catches any input that it's  not a number
                scanInput.nextLine(); // without it the loob will bug and enter a infinite loop
                        }
        } while(endLoop==false); //condition to finish the while loop.
    }
}

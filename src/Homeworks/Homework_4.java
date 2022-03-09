/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homeworks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * Create a program that will ask the user to enter a valid credit card
 * number. 
 * - If they enter invalid data, you should output a clear error message
 * and ask them again
 * - If they enter a valid number, say “Processing payment
 * now…”
 * - The validation rules are as follows: 
 *      - Credit cards must be numeric (numbers only) and contain exactly 16
 *      digits 
 *      - Assume that the first 2 digits must be 50, 51 or 52 only 
 *      - You need to allow the user enter a spaces in their credit card
 *      number. No other character should be allowed.
 */
public class Homework_4 {   
    
    /**
     * main method, used to answer question 2 from homework 4
     */
    public void homework4Question2(){ //Main method that process the paymet
        String cardNumber = readCardNumber(); //aking the user to provide a card number
        if(validateCardNumber(cardNumber)==true){ // if its a valid card number, process the payment
            System.out.println("Processing Payment now... (5)");
            System.out.println("Processing Payment now... (4)");
            System.out.println("Processing Payment now... (3)");
            System.out.println("Processing Payment now... (2)");
            System.out.println("Processing Payment now... (1)");
            System.out.println("Payment complete: \n"
                              + "Availabe funds:"
                              + " 1.000.000.000 \u20ac");
        }
        else{ //if it´s not a valid number it runs again.
            homework4Question2();
        }        
    }
    
    /**
     * method to asks the user to provide the card number and read that number
     * @return the card number without spaces (if any)
     */
    private String readCardNumber(){ 
        String userInputedCardNumber="";
        try {
            System.out.println("Please input your card number");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = bufferedReader.readLine();
            userInputedCardNumber = userInput.replaceAll(" ",""); //removes spaces used by the user
                       
            
        } catch (Exception e) {//error handeling for the buffered reader. 
            System.out.println("Sorry something unexpected happened =/"); 
        }
        return userInputedCardNumber; //return the card number as a string with no spaces
    }
    

    /**
     * Validade that given number is a possible card number
     * @param cardToValidate - number of the card to be validated 
     * @return if card is valid or not
     */  
    private boolean validateCardNumber(String cardToValidate){ //method used to validate the provided number
        // If the provided number is valid, returns true and the main method continues to process
        if (cardToValidate.matches("[0-9]+") && // verify that all the characters are numbers only
            cardToValidate.length()==16 && // checks that the number is exacly 16 characters long
           (cardToValidate.startsWith("50")||//check that the number start with 50 OR 51 OR 52
                cardToValidate.startsWith("51")||
                cardToValidate.startsWith("52"))) {
            return true;   
        }
        //if the iput is not valid, give a message on what is wrong with the information.
        else{
            String feedback = "The given informantion: ";
            if (cardToValidate.matches("[0-9]+")== false) { //information contains letters
                feedback = feedback.concat(" Is not a number."); //append the conrrect information to the string feedback
                
            }
            if (cardToValidate.length()!=16){// information is not 16 chars long
                feedback = feedback.concat(" Not the right size for a card number."); 
            }
            if ((cardToValidate.startsWith("50")|| // Does not start with the right numbers
                    cardToValidate.startsWith("51")||
                    cardToValidate.startsWith("50")) == false){
                feedback = feedback.concat(" Does not start with 50, 51 or 52.");
            }
                
            
           System.out.println(feedback); //print the feedback to the user
            
        }
        return false; // return false to the main method
    }
}

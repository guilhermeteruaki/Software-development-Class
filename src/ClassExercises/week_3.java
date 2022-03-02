/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class week_3 {
    public String factorial(){
        Integer numberToFactorial=1;
        String answer = "";
        Integer results = 1;
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Whats the number to factorial");
        numberToFactorial=sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("That is not a number");
            factorial();
        }
        for (int i=numberToFactorial; i>0; i--){
            results = results*numberToFactorial;
            answer =(results.toString());
        }
        
        
    return answer;
    } 
}

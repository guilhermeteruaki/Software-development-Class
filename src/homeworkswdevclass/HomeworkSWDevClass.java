/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkswdevclass;


import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author guilherme teruaki CCT No 2022047
 */
public class HomeworkSWDevClass {


    public static void main(String[] args) {
       
        Scanner scanInput = new Scanner(System.in);
        
        boolean endLoop = false;
        double userGrade;
        do {
            System.out.println("Please provide your grade, use values 0 - 100");
            try{
                userGrade = scanInput.nextDouble();
                System.out.println(userGrade);
                endLoop = true;
                      
            }catch (InputMismatchException e) {
                System.out.println("that´s not a number, try again");
                
            }
        } while(endLoop==false);
    
     
//        System.out.println("Please tell me your age");
//        try{
//           int age=scanInput.nextInt();
//           if (age<=18){
//               System.out.println("GO BACK TO SCHOOL");
//           }
//           else if (age>=19 && age<=66){
//               System.out.println("work for money");
//           }
//           else{
//               System.out.println("Retire");
//           }
//        }catch (InputMismatchException e) {
//            System.out.println("that's not a number");
//        }
       
    }    

}

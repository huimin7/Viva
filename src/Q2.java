/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chuimin
 */
import java.util.Scanner;
public class Q2 {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     
     int num;
     
     System.out.print("Enter an integer: ");
     num = sc.nextInt();
     
     int remainder;
     int reverse =0;
             
     while(num !=0){
         remainder = num%10;
         reverse = reverse*10 + remainder;
         num = num/10;
         
     }
     System.out.print("Reversed interger: "+ reverse);
    }
}

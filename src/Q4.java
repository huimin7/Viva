/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chuimin
 */
import java.util.Scanner;
public class Q4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String password;
        
        System.out.print("Please enter your password: ");
        password = sc.nextLine();
        
        char [] x=new char[password.length()];
        
        for(int i =0; i<password.length();i++){
            x[i] = password.charAt(i);
        }
        
         
        String strength = "null";
        int upper =0;
        int lower=0;
        int special=0;
        int digit=0;
        
        
                
        for(int i=0;i<password.length();i++){
            if(password.length()<8){
                strength = "Weak";
                break;}
            if(Character.isUpperCase(x[i]))
                upper = upper+1;
            else if(Character.isLowerCase(x[i]))
                lower =lower+1;
            else if(x[i]=='!'||x[i]=='@'||x[i]=='#'||x[i]=='$'||x[i]=='%'||x[i]=='^'||x[i]=='&'||x[i]=='*'||x[i]=='('||x[i]==')'||x[i]=='+'||x[i]=='-')
                special++;
            else if(Character.isDigit(x[i]))
                digit++;
        }    
                
        if(password.length()>8 && upper>0 && lower>0 && special>0 && digit>0)
                strength ="Strong";
        else if(password.length()>6 && upper>0 && lower>0 && special>0)
                strength = "Moderate";
        else
                strength = "Weak";
        
        System.out.print("Strength of password: " + strength);

    }
    
}

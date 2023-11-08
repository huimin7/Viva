
import java.util.Scanner;
public class Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter number: ");
        num = sc.nextInt();
        
        int numUserEnter=num;
        int remainder;
        int total =0;
        
        while(num != 0){
            remainder = num%10;
            int factorial =1;
            for(int i=1;i<remainder+1;i++){
                factorial = factorial *i;
            }
            total = total + factorial;
            num= num/10;
        }
        
        System.out.printf("Factorial of %d is %d",numUserEnter,total);
        if(total == numUserEnter)
            System.out.printf("\n%d is a strong number",numUserEnter);
        else
            System.out.printf("\n%d is not a strong number",numUserEnter);
        
    }
}

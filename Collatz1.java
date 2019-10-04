//Challenge:
//
//Write a program that inputs a number from the user, and then displays the Collatz Sequence starting from that number. Stop when you reach 1:
//
//	•	Ask for any positive integer n
//	•	If n is even, divide it by 2 to get n / 2
//	•	If n is odd, multiply it by 3 and add 1 to get 3n + 1
//	•	Repeat the process indefinitely (Until you hit n == 1)
//
//

package collatz1;
import java.util.Scanner;

public class Collatz1 {

    
    public static void main(String[] args) {
        System.out.println("Pick a whole number greater then 0:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        // creating a counter so we create a new line at a certain point for visulization effect
        int sum = 0;
        
        while (num >1){
            sum ++;
            System.out.print(num + "\t");
            
            if ((num % 2 == 0) && (sum % 10 == 0)){
                num = num / 2;
                    // used to move to new line
                    System.out.println("");
                    // trying to medeno only once
                    
            }else if (num % 2 ==0){
                num = num / 2;
        }else if ((num % 2 != 0) && (sum %10 ==0)){ 
                num =  ((num * 3) + 1) ;
                // used to move out put to a new line
                System.out.println("");
                
        }else{
            num = ((num * 3) + 1);
        }
}
        System.out.println(num);
}
}
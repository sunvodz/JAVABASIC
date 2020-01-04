import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       int num;
       System.out.print("Enter a number : ");
       num = input.nextInt();

       reversed(num);

       if(palindrome(num)==num){
        System.out.println(num+" is palindrome");
       }
       else {
        System.out.println(num+" is not palindrome");
       }

    } 
    public static void reversed (int num){
        System.out.print("Reversed ");  
        while(num>0){
           System.out.print(num%10);
           num = num/10;  
           if(num>=1)
           System.out.print(" and ");           
       }
       System.out.println();       
    }
      public static int palindrome(int num){
        int reversed = 0;
        while(num>0){     
            reversed = reversed*10 + num%10;       
            num /= 10;
        }
        return reversed;
    }
}
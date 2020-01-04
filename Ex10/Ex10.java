import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class Ex10{
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int num;
            int i = 0;
            int [] number = new int [5];
            System.out.print("Enter 5 number : ");
            num = input.nextInt();

            while(num > 0){
                  number[i] = num % 10;
                  i++;
                  num = num / 10;
            }

            Arrays.sort(number);
            int max = number[number.length-1]; 
            int min = number[0]; 
            
            // System.out.println("Max : " + max(number));
            // System.out.println("Min : " + min(number));

            System.out.println("Max : " + max);
            System.out.println("Min : " + min);
            System.out.println("Average : " + ave(number));
            
      }
      public static int max(int[] num){
            int i ;
            int max = num [0];
            for( i = 0 ; i < num.length ; i++){
                if(num[i] > max){
                  max = num[i];
                }
            }
            return max;
      }

      public static int min(int[] num){
        int i ;
        int min = num [0];
        for( i = 0 ; i < num.length ; i++){
            if(num[i] < min){
              min = num[i];
            }
        }
        return min;
      }
      public static float ave(int[] num){
            int i;
            int sum = 0;
            float ave = 0f;
            for( i = 0 ; i < num.length ; i++){
                  sum =+ num[i];
            }
            ave = sum / 2;
            return ave;
      }
    
}
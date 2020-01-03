import java.util.Scanner;
class Ex4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number A :");
        int num_a = input.nextInt();  //nextInt() change to type
        System.out.print("Enter Number B :");
        int num_b = input.nextInt();  //nextInt() change to type

        // + , - , * , / , % , ++ , --

        // () , * , / , % , + , - 
        // ++,-- if it's front do it now.
        int result = num_a + num_b;
        System.out.println("Result : "+result);
    }
}
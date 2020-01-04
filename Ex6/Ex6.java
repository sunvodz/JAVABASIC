import java.util.Scanner;
class Ex6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = input.nextInt();

        for(int i=1 ; i<=12 ; i++){
            System.out.println(number + " X " + i + " = "+ number*i);
        }
    }
}
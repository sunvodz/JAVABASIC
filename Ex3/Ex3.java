import java.util.Scanner;
class Ex3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter :");
        String in = input.nextLine(); // String 
        //String in = input.next(); // String
        //char in = input.next().charAt(0); // char 
        //int in = input.nextInt(); // int
        //long in = input.nextLong(); // long
        //float in = input.nextFloat(); // float
        System.out.println("Result :"+in);
    }
}
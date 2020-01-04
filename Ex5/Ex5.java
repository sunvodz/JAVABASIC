import java.util.Scanner;
class Ex5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A : ");
        int num_a = input.nextInt();
        

        System.out.print("Enter B : ");
        int num_b = input.nextInt();
        System.out.println(num_a + " And " + num_b);

        // == , != , < , > , <= , >=
        //&& (T&&T = T), || (F||F=F), ^ (T^F=T) (F^T=T) , ! (T = F , F = T)

        boolean result = (num_a != num_b) && (num_a < num_b);
        
        System.out.println("Result : " +result);

    }
}
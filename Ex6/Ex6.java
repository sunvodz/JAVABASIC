import java.util.Scanner;
class Ex6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter Number : ");
        number = input.nextInt();

        for(int i=1 ; i<=12 ; i++){
            System.out.println(number + " X " + i + " = "+ number*i);
        }

        // int i = 1; 
        // do{
        //     System.out.println(number + " X " + i + " = "+ number*i);
        //     i++;
        // }while(i <= 12 );

        // do{
        //     System.out.print("Enter a number (5-10) :");
        //     number = input.nextInt();  
        // }while(number<5||number>10);


        System.out.print("complete !");
        
    }
}
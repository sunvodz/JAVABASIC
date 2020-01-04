import java.util.Scanner;
class Ex8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] number = new int [5]; 
        int sum = 0;
        for(int i=1 ; i <= number.length ; i++){
            System.out.print("Enter number : ");
            int num = input.nextInt();
            sum = sum + num;
        }
        System.out.print("Result : "+ sum);

        // int [][] number = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // for(int i = 0 ; i < number.length ; i++){
        //     for(int j = 0 ; j < number[i].length ; j++){
        //         System.out.print(number[i][j]+" ");
        //     }
        //     System.out.println();
        // }

    }
}
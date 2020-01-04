import java.util.Scanner;
class Ex7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your point : ");
        int point = input.nextInt();
        String grade = "";
        if(point >= 80){
            if(point >= 100){
                System.out.println("Over Limit point is 100");
                grade = "Error";
            }else{
                grade = "A";
            }
        } else if (point >= 75){
            grade = "B+";
        } else if (point >= 70){
            grade = "B";
        }else if (point >= 65){
            grade = "C+";
        }else if (point >= 60){
            grade = "C";
        }else if (point >= 55){
            grade = "D+";
        }else if (point >= 50){
            grade = "D";
        }else{
            if(point < 0){
                System.out.println("Please Enter number more 0");
                grade = "Error";
            }else{
                grade = "F";
            }
        }
        System.out.println("Grade : " + grade);

        // switch (point/10){
        //     case 10:
        //     case 9:
        //     case 8:
        //         System.out.println("Grade : A");
        //         break;
        //     case 7:
        //         System.out.println("Grade : B");
        //         break;
        //     case 6:
        //         System.out.println("Grade : C");
        //         break;
        //     case 5:
        //         System.out.println("Grade : D");
        //         break;
        //     default:
        //         System.out.println("Grade : F");
        //         break;
        // }
    }
}
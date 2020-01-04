import java.util.Scanner;                       

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] num = new int[10];
        for(int i=0;i<10;++i)
              num[i] = in.nextInt();           
        min(num);
        max(num);                       
  }
       public static void min(int a[]) {             
             int min = a[0];                            
             for(int i=0;i<10;++i) {
                   if(min>a[i])                      
                         min=a[i];                     
              }
             System.out.println("Min : "+min);
        }

       public static void max(int b[]) {
             int max = b[0];                  
             for(int i=0;i<10;++i) {
                   if(max<b[i])                
                   max=b[i];
              }
              System.out.println("Max : "+max);
        }
}
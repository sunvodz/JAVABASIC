import java.util.Scanner;
public class Ex13 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      String name;
      String name_sunvo = "sunvodz";
       System.out.print("Enter your name : ");
       name = input.next();

      for(int i=0;i<name.length();i++){
          char ch = name.charAt(i);
          System.out.print(ch + " ");
          
      }
      System.out.println();
      System.out.println("Equal : " + (name.equals(name_sunvo)?"equal":"not equal"));
      System.out.println("Length : "+name.length()); 
      System.out.println("First : "+name.charAt(1)); 
      System.out.println("Last : "+name.charAt(name.length()-1));

      System.out.print("English vowel : ");
      for(int i=name.length()-1;i>=0;i--){
        char ch = name.charAt(i);
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u')
        System.out.print(ch + " ");
      }
      
  }
  
}
public class Ex12 {
  public static void main(String[] args) {
      String color = "RED=1:YELLOW=2:GREEN=3:BLACK=4";
      String[] str = color.split(":");
      int sum = 0;
      for(int i = 0;i<str.length;i++){
          String[] a = str[i].split("=");
          System.out.println(a[0].toLowerCase()+" "+a[1]);
          int qty = Integer.valueOf(a[1]);
          sum += qty;
      }
      System.out.println("Sum = "+sum);
  }
}
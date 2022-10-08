import java.util.Scanner;
 
class Finding_small{
 
  static int add(int a,int b, int c)
  {
      if(a<b && a<c)
      return a;
    
      else if (b<a && b<c)
      return b;
    
      else 
      return c;
  }
  
  
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

    System.out.print("Enter three Numbers : ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    System.out.println("The smallest number is : "+ add(a,b,c));
    }
}

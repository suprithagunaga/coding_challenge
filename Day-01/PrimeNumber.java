import java.util.*;
public class PrimeNumber{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    boolean prime=true;
    if(n<=1){
      prime=false;
    }
      else{
        for(int i=2;i<=n/2;i++){
          if(n%i==0){
            prime=false;
          break;
          }
        }
      }
    if(prime==true){
      System.out.println("prime number");
    }
    else{
      System.out.println("Not prime number");
    }
}
}

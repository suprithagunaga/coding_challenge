import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int digit;
        int sum=0;
        while(n!=0){
            digit=n%10;
            sum=sum+digit*digit*digit;
            n=n/10;
        }
        if(original==sum){
            System.out.print("armstrong");
        }
        else{
            System.out.print("Not armstrong");
        }
    }
}

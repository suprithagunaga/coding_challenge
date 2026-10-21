import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int power=String.valueOf(n).length();
        int digit;
        int sum=0;
        while(n!=0){
            digit=n%10;
            sum=sum+(int)Math.pow(digit,power);
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

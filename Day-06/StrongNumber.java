import java.util.*;
class Main{
public static int factorial(int n){
int fact = 1;
for(int i = 1; i <= n; i++)
fact *= i;
return fact;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int temp = n, sum = 0;
while(n != 0){
int digit = n % 10;
sum += factorial(digit);
n /= 10;
}
System.out.println(temp == sum ? "Strong" : "Not Strong");
}
}

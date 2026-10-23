import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt(), b = sc.nextInt();
int x = a, y = b;
while(y != 0){
int temp = y;
y = x % y;
x = temp;
}
int gcd = x;
int lcm = (a * b) / gcd;
System.out.println(lcm);
}
}

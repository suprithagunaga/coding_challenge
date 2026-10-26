import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String sub=sc.nextLine();
if(str.contains(sub))
System.out.println("Substring Present");
else
System.out.println("Substring Not Present");
}
}

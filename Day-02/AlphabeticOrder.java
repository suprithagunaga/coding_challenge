import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        System.out.println(new String(ch));    
}
}

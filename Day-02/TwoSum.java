import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]+num[j]==target){
                    System.out.println("Found at index of "+i+" "+j);
                    return;
                }
            }          
        }
        System.out.println("not found");      
}
}

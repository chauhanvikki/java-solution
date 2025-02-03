import java.util.*;
public class pallindromeInt {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int temp=n,remainder;
    int sum=0;
    while(temp!=0){
        remainder=temp%10;
        sum=(sum*10)+ remainder;
        temp=temp/10;
    }
    if(sum==n){
        System.out.println("It is pallindrome");
    }
    else{
        System.out.println("It is not pallindrome");
    }
}
}
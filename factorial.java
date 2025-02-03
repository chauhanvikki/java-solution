import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =1;
        while(a<=n){
            // a=a+1;
            for(int i =1;i<=n;i++){
                a=a*i;
            }
            System.out.println(a);
        }
    }
} 
    


// import java.util.Scanner;
// public class pallindrome {

//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         String reverse = "";
//         String a = in.nextLine();
//         System.out.println(a);

//         int lambayi = a.length();
//         for(int i = lambayi-1; i>=0; i--){
//             reverse = reverse + a.charAt(i);
//         }
//         if(a.equals(reverse)){
//             System.out.println("PAllindrome");
//         }
//         else{
//             System.out.println("NO pallindrome");
//         }

//     }
// }

// ========================================================================================================
import java.util.Scanner;
public class pallindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a=in.nextLine();
        int lambayi=a.length();
        String reverse="";
        for(int i=lambayi-1;i>=0;i--){
            reverse=reverse + a.charAt(i);
        }
        System.out.println(reverse);
        if(a.equals(reverse)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("No pallindrome");
        }
    }
}
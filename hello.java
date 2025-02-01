// import java.util.*;
// public class hello{
//     public static void main(String args[]){
//         System.out.println("Hello world"+"akash"+"', vikki");
//     }
// } 
// =========================================================================================
// import java.util.*;
// public class hello{
//     static int result=1;
//     public static int fact(int n){
//         // int result=1;
//         if(n==0||n==1){
//             return result;
//         }
//         result*=n;
//         return fact(n-1);

//     }
//     public static void main(String args[]){
//         System.out.println(fact(5));
//     }
// }
// =========================================================================================================
// SUm of digits
// import java.util.*;
// public class hello{
//     // static int r;
//     static int sum=0;
//     public static int sumOf(int n){
//         if(n==0){
//             return 0;
//         }
//         // r=n%10;
//         // sum=sum+r;
//         // n=n/10;
//         // return sumOf(n);
//         return n%10 + sumOf(n/10);
//     }
//     public static void main(String args[]){
//         System.out.println(sumOf(131));
//     }
// }

// ===============================================================================================================

// sum of number 
// import java.util.*;
// public class hello{
//     public static int sum(int n){
//         if(n==0){
//             return n;
//         }
//         // int r=0;
//         // r=r+n;
//         return n+sum(n-1);
//     }
//     public static void main(String ags[]){
//         int s=sum(5);
//         System.out.println(s);
//     }
// }

// ====================================================================================================

// sum of digits
// import java.util.*;
// public class hello{
//     static int sum=0;
//     // static int remainder=n%10;
//     public static void proDigits(int n){
//         // int r=n%10;
//         if(n==0){
//             return ;
//         }
//         // int sum=0;
//         int remainder=n%10;
//         sum=sum*10+remainder;
//         // int r=10*(n%10);
//         proDigits(n/10);
//     }
//     public static void main(String args[]){
//         proDigits(456897);
//         System.out.println(sum);
//     }
// }
// ===========================================================================================================
// import java.util.*;
// class hello{
//     public static void main(String args[]){
//         ArrayList<Integer> list=new ArrayList<Integer>();
//         list.add(89);
//         list.add(23);
//         list.add(56);
//         list.add(43);
//         System.out.println(list);
//         Collections.sort(list);
//         System.out.println(list);
//     }
// }
// =========================================================================================================
// import java.util.Arrays;
// public class hello{
//     public static void main(String args[]){
//         String[] str={"flower","flight","flow"};
//         common(str);
//     }
//     public static void common(String[] str){
//         Arrays.sort(str);
//         String str1=str[0];
//         String str2=str[str.length-1];
//         int idx=0;
//         while(idx<str1.length() && idx<str2.length()){
//         if(str1.charAt(idx)==str2.charAt(idx)){
//             idx++;
//         }
//         else{
//             break;
//         }
//         }
//         System.out.println(str1.substring(0,idx));
//     }
// }
// ======================================================================================================

// import java.util.*;
// public class hello{
//     public static void main(String args[]){
//         int arr[]={23,34,45,56,57,12,13};
//         System.out.println(RotatedBinary(arr,0,arr.length-1,57));
//     }
//     public static int RotatedBinary(int arr[],int s,int e,int target){
//         // int m=s+(e-s)/2;
//         if(s>e){
//             return -1;
//         }
//         int m=s+(e-s)/2;
//         if(arr[m]==target){
//             return m;
//         }
//         if(arr[s]<=arr[m]){
//             if(target>=arr[s]&&arr[m]>target){
//                 return RotatedBinary(arr,s,m-1,target);
//             }
//             else{
//                 return RotatedBinary(arr, m+1, e, target);
//             }
//         }
//         if(target>arr[m]&&target<=arr[e]){
//             return RotatedBinary(arr, m+1, e, target);
//         }
//         return RotatedBinary(arr, s, m-1, target);
//     }
// }
// ======================================================================================================


// // count factor of a number 
// import java.util.*;
// public class hello{
//     public static void main(String args[]){
//         Scanner in = new Scanner(System.in);
//         int n=in.nextInt();
//         int arr[]={3,4,2,7,5,6};
//         countFact(n,arr);
//     }   
//     public static void countFact(int a,int arr[]){
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             if(a%arr[i]==0){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
// ==================================================================================================
import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        countFact(a);
    }
    public static void countFact(int n){
        int count=0;
        for(int i=1;i<=n/i;i++){
            if(n%i==0){
                if(n/i==i){
                    count+=1;
                }
                else{
                    count+=2;
                }
            }
            // System.out.println(count);
        }
        System.out.println(count);
    }
}
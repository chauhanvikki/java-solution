// public class countZeroes{
//     public static int count(int n){
//         if(n==0){
//             return 0;
//         }
//         return zeroes(n);
//     }
//     public static int zeroes(int n){
//         if(n==0){
//             return 0;
//         }
//         if(n%10==0){
//             return 1+zeroes(n/10);
//         }
//         else{
//             return zeroes(n/10);
//         }
//     }
//     public static void main(String args[]){
//         System.out.println(count(12030040));
//     }
// }
public class countZeroes{
    public static int count(int n){
        if(n==n%10){
            return 0;
        }
        return helper(n,0);
    }
    public static int helper(int n,int num){
        if(n==0){
            return num;
        }
        if(n%10==0){
            num++;
        }
        return helper(n/10,num);
    }
    public static void main(String args[]){
        System.out.println(count(120120));
    }
}

// public class paalindrome {
//     public static int reverse(int n){
//         int digits=(int)(Math.log10(n))+1;
//         return helper(n,digits);
//     }   
//     private static int helper(int n,int digits){
//     if(n%10==n){
//         return n;
//     }
//     int remainder=n%10;
//     return remainder*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
//     } 
//     public static void main(String args[]){
//         System.out.println(pal(45054));
//     }
//     static boolean pal(int n){
//         return reverse(n)==n;
//     }
// }

// =================================================================================================
// Longest pallindrome length-----------------------------
class paalindrome{
    public static void main(String args[]){
        String s="abacab";
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int odd=len(s,i,i);
            // int even=len(s,i,i+1);
            if(ans<odd){
                ans=odd;
            }
            int even =len(s,i,i+1);
            if(ans<even){
                ans=even;
            }
        }
        System.out.println(ans);
        }
    static int len(String s,int l,int r){
            while(l>=0 && r<s.length() && l<=r && s.charAt(l)==s.charAt(r)){
                if(s.charAt(l)==s.charAt(r)){
                    r++;
                    l--;
                }
            }
        return r-l-1;
    }
}
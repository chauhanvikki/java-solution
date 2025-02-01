// ------------find smallest Nearest Element from left-------------------
// import java.util.Stack;
// import java.util.Arrays;
// public class stack {
//     public static void main(String args[]){
//     int a[]={4,5,2,10,3,12};
//     int ans[]=new int[a.length];
//     Stack<Integer> st = new Stack<>();
//     for(int i=0;i<a.length;i++){
//         while(!st.isEmpty() && a[i]<st.peek()){
//             st.pop();
//         }
//         if(st.isEmpty()){
//             ans[i]=-1;
//         }
//         else{
//             ans[i]=st.peek();
//         }
//         st.push(a[i]);
//     }
//     System.out.println(Arrays.toString(ans));
// }
// }

// ====================================================================================
import java.util.Stack;
import java.util.Arrays;
public class stack {
    public static void main(String args[]){
        int a[]={2,4,3,4,5,1};
        int leftside[]=leftSmallestIndex(a);
        int rightside[]=rightSmallestIndex(a);
    }
    static int[] leftSmallestIndex(int[] a){
        int ans[]=new int[a.length];
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<a.length;i++){
        while(!st.isEmpty() && a[i]<a[st.peek()]){
            st.pop();
        }
        if(st.isEmpty()){
            ans[i]=-1;
        }
        else{
            ans[i]=st.peek();
        }
        st.push(i);
    }
    return ans;
}
static int[] rightSmallestIndex(int[] a){
    int ans[]=new int[a.length];
    Stack<Integer> st = new Stack<>();
    for(int i=a.length-1;i>=0;i--){
        while(!st.isEmpty() && a[i]<a[st.peek()]){
            st.pop();
        }
        if(st.isEmpty()){
            ans[i]=a.length;
        }
        else{
            ans[i]=st.peek();
        }
        st.push(i);
    }
    return ans;
}
}

    
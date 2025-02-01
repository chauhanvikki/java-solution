// // -----bubbleSort---------
import java.util.*;
public class sortingRecursion {
    public static void main(String args[]){
        int arr[]={23,34,32,45,3,1,2};
        bubbleSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[],int s,int e){
        if(e==0){
            return;
        }
        if(e>s){
            if(arr[s]>arr[s+1]){
                int temp=arr[s];
                arr[s]=arr[s+1];
                arr[s+1]=temp;
            }
            bubbleSort(arr,s+1,e);
        }
        else{
            bubbleSort(arr,0,e-1);
        }
    }
}
// =================================================================================================

// ----Selection sort----
import java.util.*;
public class sortingRecursion{
    public static void main(String args[]){
        int arr[]={34,56,32,12,1,2};
        selectionSort(arr, 0, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int arr[],int s,int e,int max){
        if(e==0){
            return;
        }
        if(s<=e){
            if(arr[s]>arr[max]){
                selectionSort(arr, s+1, e, s);
            }
            else{
                selectionSort(arr,s+1,e,max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[e];
            arr[e]=temp;
            selectionSort(arr, 0, e-1, 0);
        }
    }
}

// =================================================================================================

// bubble Sorting
import java.util.*;
public class sortingRecursion{
    public static void main(String args[]){
        int arr[]={34,7,12,1,5};
        bubble(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr,int s,int e){
        if(e==0){
            return;
        }
        if(s<e){
            if(arr[s]>arr[s+1]){
                int temp=arr[s];
                arr[s]=arr[s+1];
                arr[s+1]=temp;
        }
        bubble(arr, s+1, e);
        }
        else{
            bubble(arr, 0, e-1);
        }
    }
}
// ==============================================================================================================

// quick sort-------
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        int arr[]={23,3,45,12,2,15};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
        int partition=pIndex(arr,low,arr.length-1);
        quickSort(arr,low,partition);
        quickSort(arr,partition+1,high);
        }
    }
    public static int pIndex(int arr[],int low,int high){
        int pivot=arr[low];
        int s=low+1;
        int e=high;
        while(s<=e){
            while(s<=e && pivot>arr[s]){
                s++;
            }
            while(s<=e && pivot<arr[e]){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[e];
        arr[e]=temp;
        return e;
    }
}
// ================================================================================
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
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
// ----------------------------------------------------------------------------------------------------
class Main{
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

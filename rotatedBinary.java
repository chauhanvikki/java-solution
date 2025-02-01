import java.util.*;
public class rotatedBinary{
    public static void main(String args[]){
        int arr[]={23,34,45,56,57,12,13};
        System.out.println(RotatedBinary(arr,0,arr.length-1,57));
    }
    public static int RotatedBinary(int arr[],int s,int e,int target){
        // int m=s+(e-s)/2;
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s]&&arr[m]>target){
                return RotatedBinary(arr,s,m-1,target);
            }
            else{
                return RotatedBinary(arr, m+1, e, target);
            }
        }
        if(target>arr[m]&&target<=arr[e]){
            return RotatedBinary(arr, m+1, e, target);
        }
        return RotatedBinary(arr, s, m-1, target);
    }
}
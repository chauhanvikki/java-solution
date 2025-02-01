import java.util.Arrays;
public class quicksorting{
    public static void main(String args[]){
        int arr[]={45,3,23,33,2,1,55};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int partition=pIndex(arr,low,high);
            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        } 
    }
    public static int pIndex(int arr[],int low,int high){
        int i=low+1;
        int j=high;
        int pivot=arr[low];
        while(i<=j){
            while(i<=j && arr[i]<=pivot){
                i++;
            }
            while(i<=j && arr[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[low]=arr[j];
        arr[j]=pivot;
        return j;
    }
}

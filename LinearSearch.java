public class LinearSearch{
    private static int search(int arr[],int idx,int target){
        // int target=1;
        if(idx>=arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return search(arr,++idx,target);
    }
    public static void main(String args[]){
        int arr[]={3,2,1,18,9};
        // int target=18;
        System.out.println(search(arr,0,1));
    }
}
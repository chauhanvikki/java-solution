import java.util.ArrayList;
public class returnArrayList{
    public static int printLast(int arr[],int target,int index,ArrayList<Integer> list){
        if(arr[index]==target){
            list.add(index);
            return index;
        }
        if(index==-1){
            return -1;
        }
        return printLast(arr,target,index-1,list);
    }
    public static void main(String args[]){
        int arr[]={23,34,54,34,34,45};
        ArrayList<Integer> list=new ArrayList<>();
        int index=arr.length-1;
        System.out.println(printFirst(arr,34,0,list));
        System.out.println(printLast(arr,34,arr.length-1,list));
        System.out.println(list);
    }
    public static int printFirst(int arr[],int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return index;
        }
        if(arr[index]==target){
            list.add(index);
            return index;
        }
        return printFirst(arr,target,index+1,list);
    }
}
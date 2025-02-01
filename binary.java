// public class binary{
//     public static int binary(int arr[],int target){
//         int start=0;
//         int end=arr.length-1;
//         // int mid=start-(start+end)/2;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]==target){
//                 // System.out.print(mid);
//                 return mid;
//             }
//             if(arr[mid]<target){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[]={1,23,34,54,65,76,677};
//         int target=65;
//         int result=binary(arr,target);
//         if(result!=-1){
//             System.out.println("Element found at index : "+result);
//         }
//         else{
//             System.out.println("Index not found: Error!!!");
//         }
//     }
// }
// ==========================================================================================================

// when array in decsending or ascending order(Code for Order-agnostic Binary Search)
// public class binary{
//     public static int binary(int arr[],int target){
//         int start=0;
//         int end=arr.length-1;
//         boolean asc=arr[start]<arr[end];
//         // int mid=start-(start+end)/2;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]==target){
//                 // System.out.print(mid);
//                 return mid;
//             }
//             if(asc){
//                 if(arr[mid]<target){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//             }
//             else{
//                 if(arr[mid]>target){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[]={233,33,12,2,1};
//         int target=2;
//         int result=binary(arr,target);
//         if(result!=-1){
//             System.out.println("Element found at index : "+result);
//         }
//         else{
//             System.out.println("Index not found: Error!!!");
//         }
//     }
// }
// =============================================================================================================
// binary search with recursion
public class binary{
    public static int binary(int arr[],int target,int s,int e){
        if(e<s){
            return -1;
        }
        boolean asc=arr[s]<arr[e];
        // while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }
            if(asc){
                if(arr[m]<target){
                    return binary(arr,target,m+1,e);
                }
                else{
                    return binary(arr,target,s,m-1);
                }
            }
            else{
                if(arr[m]>target){
                    return binary(arr,target,m+1,e);
                }
                else{
                    return binary(arr,target,s,m-1);
                }
            }
            
        // }
        // return -1;
    }
    public static void main(String args[]){
        int arr[]={23,34,45,54,65,777};
        int target=65;
        int result=binary(arr,target,0,arr.length-1);
        if(result!=-1){
            System.out.println("Element found at "+result);
        }
        else{
            System.out.println("Error element not found: "+result);
        }
    }
}
// ====================================================================================================================
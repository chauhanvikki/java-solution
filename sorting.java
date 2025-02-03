
// public class sorting {
//     public static void main(String args[]){
//     int[] a={7,8,3,1,2};
//     for(int i=0;i<a.length-1;i++){
//         for(int j=0;j<a.length-i-1;j++){
//             if(a[j]>a[j+1]){
//                 int temp=a[j];
//                 a[j]=a[j+1];
//                 a[j+1]=temp;
//             }
//         }
        

//         }
    
//     for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//     }
    
// }
// }
// ================================================================================================
// public class sorting{
//     public static void main(String args[]){
//         int a[]={43,23,34,67,12};
//         for(int i=0;i<a.length-1;i++){
//             for(int j=0;j<a.length-1-i;j++){
//                 if(a[j]>a[j+1]){
//                     int temp=a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//                 }
//             }
//         }
//         for(int i =0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }
// ====================================================================================================
// import java.util.Scanner;
// public class sorting{
//     public static void main(String[] args){
//         // int a[]={23,43,21,6,9};
//         System.out.println("Enter the size: ");
//         Scanner in = new Scanner(System.in);
//         int n=in.nextInt();
//         int a[]=new int[n];
//         System.out.println("Array no. u input: ");
//         for(int i=0;i<n;i++){
//             a[i]=in.nextInt();
            
//         }
//         System.out.println("Arranging array in ascending order: ");
//         for(int i=0;i<a.length-1;i++){
//             for(int j=0;j<a.length-1-i;j++){
//                 if(a[j]>a[j+1]){
//                     int temp=a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<a.length;i++){
//             System.out.println(a[i]);
//         }
//     }
// }
// =================================================================================================================
// selection sorting
// import java.util.Scanner;
// public class sorting{
//     public static void main(String args[]){
//         // int a[]={7,8,3,1,2};
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int a[]= new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=in.nextInt();
//         }
//         for(int i=0; i<n;i++){
//             int smallest=i;
//             for(int j=i+1; j<a.length;j++){
//                 if(a[smallest]>a[j]){
//                     smallest=j;
//                 }
//             }int temp=a[smallest];
//             a[smallest]=a[i];
//             a[i]=temp;
//         }
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i] +" ");
//         }
//     }
// }
// ===========================================================================================================
// inseration sorting
// import java.util.Scanner;
// public class sorting{
//     public static void main(String args[]){
//         int a[]={7,8,3,1,2};
//         for(int i=1;i<a.length;i++){
//             int current=a[i];
//             int j=i-1;
//             while(j>=0 && current<a[j]){
//                 a[j+1]=a[j];
//                 j--;
//             }a[j+1]=current;
//         }
//         for(int i=0;i<a.length;i++){
//             System.out.println(a[i]+" ");
//         }
//     }
// }
// =================================================================================================
// public class sorting{
//     public static void main(String args[]){
//         int a[]={45,23,32,4,7,1};
//         for(int i=1;i<a.length;i++){
//             int current = a[i];
//             int j=i-1;
//             while(j>=0 && current<a[j]){
//                 a[j+1]=a[j];
//                 j--;
//             }a[j+1]=current;
//         }for(int i=0;i<a.length;i++){
//             System.out.println(a[i]+" ");
//         }
//     }
// }
// ==========================================================================================================
// import java.util.*;
// public class sorting{
//     public static void main(String args[]){
//         int a[]={7,8,3,1,2};
//         for(int i=0;i<a.length-1;i++){
//             for(int j=0;j<a.length-1-i;j++){
//                 if(a[j]>a[j+1]){
//                     int temp=a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//                 }
//             }
//             // System.out.println(a[i]);
//         }
//         for(int i=0;i<a.length;i++){
//             System.out.println(a[i]);
//         }
//     }
// }
// ============================================================================================
// import java.util.*;
// public class sorting{
//     public static void main(String args[]){
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=in.nextInt();
//         }
//         System.out.println("Array you input: ");
//         for(int i =0;i<n;i++){
            
//             System.out.print(a[i]+" ");
//         }
//         System.out.println(" ");
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(a[j]>a[j+1]){
//                     int temp=a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//                 }
//             }
//         }
//         System.out.println("array after sorting: ");
//         for(int i=0;i<n;i++){
//             // System.out.println("array after sorting: ");
//             System.out.print(a[i] +" ");
//         }
//     }
// }
// ==================================================================================================================
import java.util.*;
public class sorting{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(a[smallest]>a[j]){
                    smallest=j;
                }
            }
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp; 
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
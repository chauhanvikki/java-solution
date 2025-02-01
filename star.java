//  to make pyramid-------------------------------------
class star {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=0;j<rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// -------------------------------------------------------------------------------------

// to make diamond-------------------
public class star{
    public static void main(String args[]){
    int rows=5;
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows-i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=rows;i>0;i--){
        // int gap=1;
        for(int j=0;j<=rows-i;j++){
            System.out.print(" ");
            // gap++;
        }
        for(int k=0;k<2*i-3;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
// =================================================================================================

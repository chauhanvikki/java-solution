public class noOfStepsToReduceANumberToZero{
    public static int steps(int n){
        return helper(n,0);
    }
    public static int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2,++c);
        }
        return helper(n-1,++c);
    }
    public static void main(String args[]){
        System.out.println(steps(41 ));
    }
}
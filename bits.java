class bits{
    public static void main(String args[]){
        System.out.println(bit(13));
    }
    static String bit(int n){
        String result="";
        if(n==1){
            return "1";
        }
        while(n!=1){
            if(n%2==0){
                result=result+"0";
            }
            else{
                result=result+"1";
            }
            n=n/2;
        }
        return rev(result+n);
    }
    static String rev(String result){
        StringBuilder rev=new StringBuilder(result);
        return rev.reverse().toString();
    }
}
// skip a character 'a'-----------------------------
// public class skipAchar{
//     public static void main(String args[]){
//         String up="sdfhhdd";
//         System.out.println(skip(up));
//     }
//     public static String skip(String up){
//         if(up.isEmpty()){
//             return "";
//         }
//         char c=up.charAt(0);
//         if(c=='d'){
//             return skip(up.substring(1));
//         }
//         else{
//             return c+skip(up.substring(1));
//         }
//     }
// } 
// ===========================================================================================
// skip string "apple"------------
public class skipAchar{
    public static void main(String args[]){
        System.out.println(skipApple("wowkyaapplehai"));
    }
    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char c=up.charAt(0);
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return c+skipApple(up.substring(1));
        }
    }
}
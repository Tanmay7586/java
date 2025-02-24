package BasicCoding;

public class RevrseAString {
    public static void main(String[] args){
        String str = "Tanmay";
        System.out.print(revStr(str));
    }
    public static String revStr(String str){
        String revStr = "";
        for(int i = str.length()-1; i>=0; i--){
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }
}

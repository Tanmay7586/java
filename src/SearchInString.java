public class SearchInString {
    public static void main(String[] args) {
        String name = "tanmay";
        char target = 'u';

        System.out.println(search(name, target));
    }

    static boolean search(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for (int i = 0; i <name.length(); i++) {
            if(name.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
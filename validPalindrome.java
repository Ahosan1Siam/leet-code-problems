public class validPalindrome {
    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() -1;
        if(s.isEmpty()) return true;
        while (start <= end){
            char currentFirst = s.charAt(start);
            char currentEnd = s.charAt(end);
            if(!Character.isLetterOrDigit(currentFirst)){
                start ++;
            }else if(!Character.isLetterOrDigit(currentEnd)){
                end --;
            }else {
                if(Character.toLowerCase(currentFirst)!= Character.toLowerCase(currentEnd)){
                    return false;
                }
                start++;
                end --;
            }
        }
        return true;

    }
}

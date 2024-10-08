import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hashMapS = new HashMap<>();
        HashMap<Character,Integer> hashMapT = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hashMapS.containsKey(s.charAt(i))) {
                hashMapS.put(s.charAt(i),1);
            }else {
                hashMapS.put(s.charAt(i),hashMapS.get(s.charAt(i))+1);
            }
        }
        for(int j=0;j<t.length();j++){
            if(!hashMapT.containsKey(t.charAt(j))) {
                hashMapT.put(t.charAt(j),1);
            }else {
                hashMapT.put(t.charAt(j),hashMapT.get(t.charAt(j))+1);
            }
        }
        if(hashMapS.size() >= hashMapT.size()){
            for (char k : hashMapS.keySet()){
                if(!hashMapS.get(k).equals(hashMapT.get(k))){
                    return false;
                }
            }
        }else {
            for (char k : hashMapT.keySet()){
                if(!hashMapT.get(k).equals(hashMapS.get(k))){
                    return false;
                }
            }
        }
        return false;
    }


    public boolean isAnagramT(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}

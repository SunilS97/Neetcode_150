package ArraysAndHashing;
import java.util.*;


public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> sMap = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(sMap.containsKey(ch)){
                sMap.put(ch, sMap.get(ch)+1);
            }else{
                sMap.put(ch,1);
            }
        }
        for(char ch: t.toCharArray()){
            if(!sMap.containsKey(ch) || sMap.get(ch)==0){
                return false;
            }else{
                sMap.put(ch,sMap.get(ch)-1);
            }
        }

        return true;
    }
}

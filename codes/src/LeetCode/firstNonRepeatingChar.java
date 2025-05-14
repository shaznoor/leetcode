package LeetCode;

import java.util.HashMap;
public class firstNonRepeatingChar {

    public static char firstNonRepeatingCharacter(String input){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(map.containsKey(c) && map.get(c)==1){
                return c;
            }
        }
        return input.charAt(0);
    }
    public static void main(String[] args) {
        String input = "racecars";
        System.out.println(firstNonRepeatingCharacter(input));
    }
}

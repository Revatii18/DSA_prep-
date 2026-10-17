import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);

        HashMap<Character, Integer> have = new HashMap<>();
        for (int i = 0; i < text.length(); i++) 
        {
            char ch = text.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        int answer = Integer.MAX_VALUE;
        for (char key : need.keySet()) {
       int canMake = have.getOrDefault(key, 0) / need.get(key);     // have-count of key / need-count of key
    answer = Math.min(answer, canMake );    // compare with canMake
}
        return answer;
    }
}
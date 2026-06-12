import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<String, Integer> map_s = new HashHashMap<>();
        HashMap<String, Integer> map_t = new HashHashMap<>();

        if (s.length() != t.length()) {
            return False;
        }

        for (int i; i < s.length(); i++) {
            map_s.merge(s[i], 1, Integer::sum);
            map_t.merge(t[i], 1, Integer::sum);
        }

        if (map_s.equals(map_t)) {
            return True;
        } else {
            return False;
        }


    }
}

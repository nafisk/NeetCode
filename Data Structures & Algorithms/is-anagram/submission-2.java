
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            map_s.merge(s.charAt(i), 1, Integer::sum);
            map_t.merge(t.charAt(i), 1, Integer::sum);
        }

        if (map_s.equals(map_t)) {
            return true;
        } else {
            return false;
        }


    }
}

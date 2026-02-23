import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        result.add("");   

        for (char digit : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();

            for (String s : result) {
                for (char c : map[digit - '0'].toCharArray()) {
                    temp.add(s + c);
                }
            }
            result = temp;
        }

        return result;
    }
}
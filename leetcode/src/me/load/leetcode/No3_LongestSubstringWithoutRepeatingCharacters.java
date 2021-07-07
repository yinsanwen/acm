package me.load.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No3_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int windowL = 0;
        int windowR = 0;
        Map<Character, Integer> charSet = new HashMap<>();
        int maxLength = 1;
        charSet.put(s.charAt(0), 0);

        for (int i = 1; i < s.length(); i++) {
            if (charSet.containsKey(s.charAt(i))) {
                // 窗口缩减，从左到右依次弹出散列表中的值，直到弹出重复元素
                int nextLeft = charSet.get(s.charAt(i)) + 1;
                for (int j = windowL; j < nextLeft; j++) {
                    charSet.remove(s.charAt(j));
                }
                windowL = nextLeft;
            }
            windowR = i;
            charSet.put(s.charAt(i), i);

            if (charSet.size() > maxLength) {
                maxLength = charSet.size();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        No3_LongestSubstringWithoutRepeatingCharacters test = new
                No3_LongestSubstringWithoutRepeatingCharacters();
        String example = "";
        System.out.println(test.lengthOfLongestSubstring(example));
    }
}


package com.target11.algorithm;

// Check whole number Anagram
public class Anagram {

    private static boolean checkAnagram(String first, String second) {

        boolean isAnagram = true;
        char[] f = first.toCharArray();
        char[] s = second.toCharArray();
        int[] h = new int[25];
        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < f.length; i++) {
            h[f[i] - 97] += 1;
        }

        for (int j = 0; j < s.length; j++) {
            h[s[j] - 97] -= 1;
        }

        for (int k = 0; k < h.length; k++) {
            if (h[k] == -1) {
                isAnagram = false;
            }
        }
        return isAnagram;
    }


    public static void main(String[] args) {

        String input1 = "finding";
        String input2 = "finding";
        boolean isAnagram = checkAnagram(input1, input2);
        System.out.println(" isAnagram " + isAnagram);

    }


}

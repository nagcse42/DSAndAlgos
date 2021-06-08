package com.practice.algos;

/***
 * It will compress the string
 *  Input= aabbbbbcccccdddde
 *  Output: a2b5c5d3e
 *
 *  Input: a
 *  Output: 1
 *
 *  Input: abbbbbbbbbbbbb
 *  Output: ab13
 */
public class StringCompression {
    public static void main(String[] args) {
        getCompressedString("aabbbbbbbbcccc".toCharArray());
    }

    private static int getCompressedString(char[] string) {
        if(string.length == 1) {
            return 1;
        } else {
            int index=0, i=0;
            char[] compressedChar = new char[string.length];
            while (i<string.length) {
                int j = i;
                while (j < string.length && string[j] == string[i]) {
                    j++;
                }

                compressedChar[index++] = string[i];
                if(j-i > 1) {
                    String count = j-i+"";
                    for (char c : count.toCharArray()) {
                        compressedChar[index++] = c;
                    }
                }

                 i =j;
            }

            System.out.println(compressedChar);
            System.out.println("Compressed string length: "+index);
            return index;
        }
    }
}

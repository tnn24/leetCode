package com.tnn.problems;

public class P67 {
    public static String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int carry = 0;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            char aDigit = aChars[a.length() - 1 - i];
            char bDigit = bChars[b.length() - 1 - i];

            if (aDigit == bDigit) {
                // 0 + 0 + carry = 0 + carry
                // carry == 0 -> result = 0, new carry is 0
                // carry == 1 -> result = 1, new carry is 0
                // 1 + 1 + carry = 10 + carry
                // carry = 0 -> result = 0, new carry is 1
                // carry = 1 -> result = 1, new carry is 1
                // result same as carry, carry changed, same as digit
                result.append(carry);
                carry = aDigit == '0' ? 0 : 1;
            } else {
                // 1 + 0 + carry = 1 + carry
                // carry == 0 -> result = 1, carry = 0
                // carry == 1 -> result = 0, carry 1
                // result opposite carry, carry unchanged
                result.append(carry == 0 ? 1 : 0);
            }
        }

        if (aChars.length != bChars.length) {
            char[] longerBin = aChars.length > bChars.length ? aChars : bChars;
            for (int i = longerBin.length - Math.min(aChars.length, bChars.length) - 1; i >= 0; i--) {
                char digit = longerBin[i];

                if (digit == '0') {
                    // 0 + carry
                    // carry == 0 -> result = 0, new carry is 0
                    // carry == 1 -> result = 1, new carry is 0
                    result.append(carry);
                    carry = 0;
                } else {
                    // 1 + carry
                    // carry == 0 -> result = 1, carry = 0
                    // carry == 1 -> result = 0, carry 1
                    // result opposite carry, carry unchanged
                    result.append(carry == 0 ? 1 : 0);
                }
            }
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
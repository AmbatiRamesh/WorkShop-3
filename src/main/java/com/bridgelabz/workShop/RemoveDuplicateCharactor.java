package com.bridgelabz.workShop;

public class RemoveDuplicateCharactor {
    static Object removeDuplicates(String string) {
        String duplicate = "BridgelabzCodingClub";
        char str[] = duplicate.toCharArray();
        int len = str.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            boolean s = true;
            int a;
            for (a = 0; a < i; a++) {
                if (str[i] == str[a]) {
                    break;
                }
            }
            if (a == i) {
                str[index++] = str[i];
            }

        }
        return true;
    }
}

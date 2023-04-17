package com.bridgelabz.workShop;

import java.util.Arrays;

public class RemoveDuplicate {
    static void  removeDuplicate(char str[], int length) {
        int index = 0;
        for (int i = 0; i < length; i++) {
            int a;
            for ( a = 0; a < i; a++) {
                if (str[i] == str[a]) {
                    break;
                }
            }
            if (a == i) {
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str,index)));
    }
    public static void main(String[] arg){
        String duplicate = "BridgelabzCodingClub";
        char str[] = duplicate.toCharArray();
        int len = str.length;
        removeDuplicate(str,len);
    }
}


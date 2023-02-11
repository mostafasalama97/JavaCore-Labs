/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5_1;

import java.lang.String;

/**
 *
 * @author gt
 */
public class StringUtils {

    public static String betterString(String s1, String s2, Bipredicate<String, String> b) {
        if (b.test(s1, s2)) {
            return s1;
        } else {
            return s2;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("welcome");

        String longer = StringUtils.betterString(str1, str2, (s1, s2) -> str1.length() > str2.length());
        System.out.println(longer);
        String first = StringUtils.betterString(str1, str2, (s1, s2) -> true);
        System.out.println(first);
    }
}

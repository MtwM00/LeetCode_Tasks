package Leetcode;

public class Task_1071 {

    /**
     For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
     Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

     Constraints:
     1 <= str1.length, str2.length <= 1000
     str1 and str2 consist of English uppercase letters.

     */


    public static void main(String[] args) {

        String str1 = "ABCABC";
        String str2 = "ABC";
        Task_1071 task_1071 = new Task_1071();
        System.out.println(task_1071.gcdOfStrings(str1, str2));




    }

    public String gcdOfStrings(String str1, String str2) {

        String output = "";
        int i = 2;
        char[] str2a = str2.toCharArray();
        String div = "";
        div += str2a[0];
        div += str2a[1];


        while (i <= str2.length()) {
            if (str1.contains(div) && str1.contains(div+div)) {
                output = div;
            }
            if (i < str2a.length) {
                div += str2a[i];
            }
            i++;
        }

        return output;
    }

}

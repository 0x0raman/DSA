package gptsheet.easy.day3;

public class _3implementstStr {
    private static int strStr(String haystack, String needle){
        if(haystack.length() < needle.length()) return -1;
        for(int i=0; i<=haystack.length()-needle.length(); i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String h = "abcd";
        String n = "cd";
        System.out.println(strStr(h, n));
    }
}
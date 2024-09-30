package gptsheet.easy.day4;

public class _2lenoflastword {
    public static void main(String[] args) {
        String s = "hghg hg kkkn ";
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        // int len = 0;
        int i = s.length() - 1;
        // while(i>=0 && Character.isWhitespace(s.charAt(i))) i--;
        while (i >= 0 && s.charAt(i) == ' ')
            i--;
        int j = i;
        while (j >= 0 && s.charAt(j) != ' ') {
            // while(i>=0 && Character.isLetter(s.charAt(i))){
            // len++;
            // i--;
            j--;
        }
        // return len;
        return i - j;
    }
}
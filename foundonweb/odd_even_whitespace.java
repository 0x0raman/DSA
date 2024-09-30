package foundonweb;

/**
 * odd_even_whitespace
 */
public class odd_even_whitespace {

    private static String odd_even_whitespace2(String str1, String str2){
        int count = 0;
        for(int i = 0; i<str1.length(); i++){
            if(Character.isWhitespace(str1.charAt(i))){
                count++;
            }
        }
        for(int i=0; i<str2.length(); i++){
            if(Character.isWhitespace(str2.charAt(i))){
                count++;
            }
        }
        return (count%2==0) ? "Even"+count : "Odd"+count;
    }

    public static void main(String[] args) {
        System.out.println(odd_even_whitespace2("a b cd", "basdash a sdsd"));
    }
}
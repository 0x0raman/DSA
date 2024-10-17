package experiments;

public class test {
    private static String expansion(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i+=2){
            char c = s.charAt(i);
            int count = Character.getNumericValue(s.charAt(i+1));
            while(count>0){
                sb.append(c);
                count--;
            }
        }
        return sb.toString();
    }
    private static String compression(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            if(i+1<s.length() && s.charAt(i) == s.charAt(i+1)) count++;
            else{
                sb.append(s.charAt(i));
                sb.append(count);
                count=1;
            }   
        }
        return sb.toString();
    }
    private static int compression2(char[] s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i<s.length; i++){
            if(i+1<s.length && s[i] == s[i+1]) count++;
            else{
                sb.append(s[i]);
                if(count>1) sb.append(count);
            }
            count = 1;
        }
        char[] c_arr = sb.toString().toCharArray();
        for(int i = 0; i < c_arr.length; i++) s[i] = c_arr[i];
        return c_arr.length;
    }

    public static void main(String[] args) {
        String a = "a3b2c7";
        System.out.println(expansion(a)); 
        String b = "aaabbb";
        System.out.println(compression(b));
        char[] c = {'a','a','a','b','b','b'};
        System.out.println(compression2(c));
    }
}

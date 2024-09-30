package experiments;

public class lastcharextract {
    public static void main(String[] args) {
        String val = "A very good morning";
        extract(val);
    }

    static void extract(String val) {
        StringBuilder sb = new StringBuilder();
        for (int i = val.length() - 1; i >= 0; i--) {
            if (Character.isLetter(val.charAt(i))) {
                sb.append(val.charAt(i));
            }
            if (Character.isWhitespace(val.charAt(i))) {
                break;
            }
        }
        System.out.println("result: " + sb.reverse());
    }
}

        // String[] words = val.split(" ");
        // String last = words[words.length-1];
        // System.out.println(last);

        //--------------–––––––––––––––––––––––––––––------------------------------

        // StringBuilder sb = new StringBuilder();

        // // Loop from the end of the string towards the start
        // for(int i = val.length() - 1;i>=0;i--)
        // {
        //     char ch = val.charAt(i);

        //     // Check if the character is a letter (A-Z or a-z)
        //     if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
        //         sb.append(ch);
        //     }

        //     // Check if the character is a whitespace (space)
        //     if (ch == ' ') {
        //         break;
        //     }
        // }
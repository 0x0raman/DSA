package ib;

import java.util.ArrayList;
import java.util.List;

public class _3genParantheses {
    public static List<String> genPar(int n, char a[], int c, int o, int i) {
        List<String> l = new ArrayList<>();
        if (i == a.length) {
            l.add(new String(a));
            return l;
        }
        if (o < n) {
            a[i] = '(';
            genPar(n, a, c, o + 1, i + 1);
        }
        if (c < o) {
            a[i] = ')';
            genPar(n, a, c + 1, o, i + 1);
        }
        return l;
    }
    public static List<String> generateParenthesis(int n) {
        char a[] = new char[2 * n];
        int c = 0, o = 0, i = 0;
        return genPar(n, a, c, o, i);
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }
}

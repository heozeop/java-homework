package ImplementString;

public class CaseSplitter {
    public static void printByCase(StringImpl charSeq) {
        output(charSeq.filterCase(true));
        output(charSeq.filterCase(false));
    }

    public static void output(CharSequence charSeq) {
        for (int i = 0; i < charSeq.length(); i++) {
            System.out.print(charSeq.charAt(i));
        }
        System.out.print("\n");
    }
}

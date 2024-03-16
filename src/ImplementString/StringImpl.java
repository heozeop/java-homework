package ImplementString;

import static java.util.Arrays.copyOfRange;

import java.util.Objects;

public class StringImpl implements CharSequence {

    private char[] string;

    public StringImpl(char[] string) {
        this.string = string;
    }

    public StringImpl(CharSequence charSeq) {
        string = new char[charSeq.length()];
        for (int i = 0; i < charSeq.length(); i++) {
            string[i] = charSeq.charAt(i);
        }
    }

    @Override
    public int length() {
        return string.length;
    }

    @Override
    public char charAt(int index) {
        return string[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new StringImpl(copyOfRange(string, start, end));
    }

    public CharSequence filterCase(boolean isUpperCase) {
        final char[] filtered = new char[string.length];
        int filteredIndex = 0;

        for (char c : string) {
            if(Character.isWhitespace(c) || isUpperCase != Character.isUpperCase(c)) {
                continue;
            }

            filtered[filteredIndex++] = c;
        }

        return new StringImpl(copyOfRange(filtered, 0, filteredIndex));
    }

    @Override
    public String toString() {
        return new String(string);
    }
}

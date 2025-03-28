package rano.String_1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
    String firstHalf = out.substring(0,2);
    String secondHalf = out.substring(2);
    return firstHalf + word + secondHalf;
    }
}

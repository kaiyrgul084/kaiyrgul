package rano.String_1;

public class WithoutEnd {
    public String withoutEnd(String str) {
        if (str.length() >= 2) {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }
}
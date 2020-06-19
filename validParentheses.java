class Solution {
    public boolean isValid(String s) {
        int l;
        do {
            l = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while (l != s.length());
        return s.isBlank();
    }
}
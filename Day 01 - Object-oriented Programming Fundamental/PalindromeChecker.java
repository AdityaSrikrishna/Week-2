class PalindromeChecker{
    private String text;
    public PalindromeChecker(String text){
        this.text = text;
    }
    public boolean isPalindrome(){
        String ch = text.toLowerCase();
        int start = 0;
        int end = ch.length() - 1;
        while(start<end){
            if(ch.charAt(start) != ch.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeChecker pal = new PalindromeChecker("girafarig");
        boolean a = pal.isPalindrome();
        System.out.println(a);
    }
}
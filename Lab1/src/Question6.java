public class Question6 {

    private String myself;
    private String myself2;
    
    public Question6(String myself, String myself2){
        this.myself = myself; 
        this.myself2 = myself2; 
    }

    public int FindLength(){
        int length = myself.length();
        return length;
    }

    public int FindWords(){
        int words = 1;   
        if (myself.length()==0) {
            return 0;
        } else {
            for (int i = 0; i < myself.length(); i++) {
                if (myself.charAt(i) == ' ') {
                    words++;
                }
            }
            return words;
        }
    }

    public String Concatenate(){
        String compelete = myself + myself2;
        return compelete;
    }

    public boolean PalindromeString(){
        int i = 0;
        int j = myself.length()-1;
        if (myself.length()==myself2.length()) {
            while (j>0) {
                if (myself.charAt(i)==myself2.charAt(j)) {
                    i++;
                    j--;
                } else {
                    return false;
                }

            }
        } else {
            return false;
        }
        return true;
    }
}

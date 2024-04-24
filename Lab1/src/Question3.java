public class Question3 {
    private int number;

    public Question3(int number) {
        this.number = number;
    }
    
    public void HailstoneSequence(){
        int temp;
        while (number!=1) {
                temp = number;            
            if (number%2==0) {
                number/=2;
                System.out.println(temp + " is even, so we take n/2: " + number);
            } else {
                number = number*3+1;
                System.out.println(temp + " is odd, so we take n*3+1: " + number);
            }
        }
    }
}

public class Question2 {
    private int number1;
    private int number2;
    private int number3;

    public Question2(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
    
    public int FindMin(){
        int temp;
        if (number1>number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        } else { if (number2>number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
            } else if (number1>number3) {
            temp = number1;
            number1 = number3;
            number3 = temp;
            }
        }
        return number1;
    }
}

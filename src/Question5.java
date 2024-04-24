import java.util.ArrayList;

public class Question5 {
    private int number;
    private ArrayList<Integer> al = new ArrayList<>();

    public Question5() {
    }
    
    public Question5(int number,ArrayList<Integer> al){
        this.number = number;
        this.al = al;
    }
    
    public boolean Delete(){
        boolean flag = al.contains(number);
        if (flag) {
        al.remove(number);
        return true;
        } else {
        return false;
        }
    }
}

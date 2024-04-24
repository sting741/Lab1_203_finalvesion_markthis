import java.util.ArrayList;

public class Question5b {
    
    private ArrayList<Integer> al; 


    public Question5b() {
    }
    
    public Question5b(ArrayList<Integer> al) {
        this.al = al;
        
    }
    
    public ArrayList<Integer> Insert(int index, int number) {
        al.add(index, number);
        al.remove(al.size() - 1);
        return al;
    }
}

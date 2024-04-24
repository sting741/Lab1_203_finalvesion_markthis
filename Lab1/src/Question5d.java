import java.util.ArrayList;

public class Question5d {
    private ArrayList<Integer> al = new ArrayList<>();
    private ArrayList<Integer> dp = new ArrayList<>();

    public Question5d() {

    }

    public Question5d(ArrayList<Integer> al) {
        this.al = al;
    }

    public ArrayList<Integer> DuplicateRemove() {
        for (int i = 0; i < al.size(); i++) {
            if (dp.contains(al.get(i))) {
                
            } else {
                dp.add(al.get(i));
            }
        }
        return dp;
    }
}

import java.util.ArrayList;

public class Question5c {
    private ArrayList<Integer> al = new ArrayList<>();
    private ArrayList<Integer> dp = new ArrayList<>();

    public Question5c() {

    }

    public Question5c(ArrayList<Integer> al) {
        this.al = al;
    }

    public ArrayList<Integer> Duplicate() {
        for (int i = 1; i < al.size(); i++) {
            if (i == (al.size() - 1)) {
                if ((al.get(i) == al.get(i - 1)) && !dp.contains(al.get(i))) {
                    dp.add(al.get(i));
                }
                break;
            }
            if (al.get(i) == al.get(i + 1) || (al.get(i) == al.get(i - 1))) {
                if (!dp.contains(al.get(i))) {
                    dp.add(al.get(i));
                }
            }
        }
        return dp;
    }
}

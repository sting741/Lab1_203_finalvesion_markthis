import java.util.*;

public class Lab1 {
    public static void main(String[] args) throws Exception {
        // Question1 q1 = new Question1(123450);
        // System.out.println(q1.SumFirstAndLastDigit());

        // Question2 q2 = new Question2(42, 25, 69);
        // System.out.println(q2.FindMin());

        // Question3 q3 = new Question3(15);
        // q3.HailstoneSequence();

        // int[]arr={4, 1, 6, 8 ,2};
        // Question4 q4 = new Question4(5, arr);
        // System.out.println(q4.SumEvenArray());

        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(48);
        al.add(13);
        al.add(6);
        al.add(4);
        al.add(6);
        // Question5 q5a = new Question5(22, al);
        // System.out.println(q5a.Delete());

        // Question5b q5b = new Question5b(al);
        // ArrayList<Integer> ans = q5b.Insert(2, 5);

        // Question5c q5c = new Question5c(al);
        // Collections.sort(al);
        // ArrayList<Integer> ans = q5c.Duplicate();

        // Question5d q5d = new Question5d(al);
        // ArrayList<Integer> ans = q5d.DuplicateRemove();

        // for (int i = 0; i < ans.size(); i++) {
        //     System.out.println(ans.get(i));
        // }
        
        // String myself = truongdaihoc;

        Question6 q6 = new Question6("yagami", "imagay");
        System.out.println(q6.FindLength());
        System.out.println(q6.FindWords());
        System.out.println(q6.Concatenate());
        System.out.println(q6.PalindromeString());
    }
}

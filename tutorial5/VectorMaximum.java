import java.util.Vector;
public class VectorMaximum {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);
        int max = numbers.get(0);
        for(int n : numbers) {
            if(n > max)
                max = n;
        }
        System.out.println("Maximum = " + max);
    }
}
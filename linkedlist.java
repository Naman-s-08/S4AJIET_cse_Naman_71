import java.util.Collections;
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {
        LinkedList<Integer> cse=new LinkedList<>();
        cse.add(10);
        cse.add(20);
        cse.add(5);
        
        Collections.sort(cse);
        Collections.sort(cse,Collections.reverseOrder());
        System.out.println(cse);
    }
}

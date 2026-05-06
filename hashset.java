import java.util.HashSet;
class Main {
    public static void main(String[] args) {
       HashSet<Integer> cse=new HashSet<>();
       cse.add(10);
       cse.add(20);
       cse.add(30);
       cse.add(20);
       System.out.println(cse);
       System.out.println(cse.contains(100));
       cse.remove(10);
       System.out.println(cse);
    }
}

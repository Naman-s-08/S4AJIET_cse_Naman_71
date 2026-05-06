import java.util.HashMap;
class Main {
    public static void main(String[] args) {
       HashMap<Integer,String> cse=new HashMap<>();
       cse.put(101,"alice");
       cse.put(102,"bob");
       System.out.println(cse);
       System.out.println(cse.get(102));
       System.out.println(cse.size());
    }
}

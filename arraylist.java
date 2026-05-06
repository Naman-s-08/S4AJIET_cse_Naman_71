mport java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("java");
        list.add(1,"likith");
        list.set(0,"ada");
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(0));
    }
}

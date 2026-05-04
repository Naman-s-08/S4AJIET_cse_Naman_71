//program to swap two numbers without using 3rd variable
class Main {
    public static void main(String args[]){
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}

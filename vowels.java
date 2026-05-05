import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String sentence=sc.next().toLowerCase();
        int vowels=0;
        int consonents=0;
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonents++;
            }
            
        }
        System.out.println(vowels);
            System.out.println(consonents);
    
    }
}

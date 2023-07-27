import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.println("Enter Sentence: ");
        String s = sc.nextLine();
        System.out.println(s);
        
        
        
    }
}

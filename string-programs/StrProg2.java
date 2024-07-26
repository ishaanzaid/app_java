import java.util.Scanner;

public class StrProg2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        // System.out.println("Enter the String");
        // String s=scan.next();
        // System.out.println(s);

        // System.out.println("Enter the String s1");
        // String s1=scan.nextLine();  // for spaces
        // System.out.println(s1);

        // System.out.println("Enter the String");
        // String s=scan.nextLine();
        // System.out.println(s);
        // System.err.println(s);  //print in red color

        System.out.println("Enter the integer value");
        int i=scan.nextInt();

        scan.nextLine(); //dummy line to skip /n from buffer

        System.out.println("Enter the String: ");
        String s=scan.nextLine();

        System.out.println("String: " +s);
        System.err.println("Integer: " + i);  //print in red color
        
    }

}

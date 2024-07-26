import java.util.Scanner;
// reverse the string 
public class StrProg3 {
    public static void main(String[] args) {


        // String s="TAP";
        // int len=s.length();
        // int j;
        // if (len;len=1;len--){
        //     System.out.println(s.charAt(len));
        // }
        // System.out.println(len);

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the String");
        String s=scan.next();
        StringBuffer sb= new StringBuffer(s); //converting from immutable to mutable
        System.out.println(sb.reverse());

        StringBuffer sb1=new StringBuffer("RajaRam");
        String s1=new String(sb1); // converting form mutable to immutable 
        // or
        String s2=sb1.toString();
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());






        
    }

}

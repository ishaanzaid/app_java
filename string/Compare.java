public class Compare {
    public static void main(String[] args) {

        String s1="SACHIN";
        String s2="SAURAV";

        int n = s1.compareTo(s2);
        System.out.println(n);

        if (n > 0)
        {
            System.out.println("s1>s2");
        }
        else if (n<0) {
            System.out.println("s1<s2");
        }
        else
        {
            System.out.println("s1=s2");
        }

        ////////////////////
        String s3="SACHIN";
        String s4="SACHIN";

        int n1 = s3.compareTo(s4);
        System.out.println(n1);

        ////////////////////
        String s5="JAVA";
        String s6="JAVAC";

        int n2 = s5.compareTo(s6);
        System.out.println(n2);

        ////////////////////
        String s7="SAURAV";
        String s8="SACHIN";

        int n3 = s7.compareTo(s8);
        System.out.println(n3);

        ////////////////////
        String s9="JAVAJVM";
        String s10="JAVA";

        int n4 = s9.compareTo(s10);
        System.out.println(n4);
        
    }
}
public class Concat {
    public static void main(String[] args) {

        String s1="JAVA";
        String s2="PYTHON";
        String s3="JAVA"+"PYTHON";
        String s4="JAVA"+"PYTHON";

        if( s3==s4) 
        {
            System.out.println("values are equal");
        }
        else
        {
            System.out.println("values are unequl");
        }

        String s5=s1+s2;//whwenever we concatinating 2 strings using referefnces the new object will create in heap 
        String s6=s1+s2;

        if( s5==s6) 
        {
            System.out.println("values are equal");
        }
        else
        {
            System.out.println("values are unequl");
        }


        if( s4==s5) 
        {
            System.out.println("values are equal");
        }
        else
        {
            System.out.println("values are unequl");
        }

        String s7="JAVA"+s2;
        if( s6==s7) 
        {
            System.out.println("values are equal");
        }
        else
        {
            System.out.println("values are unequl");
        }
        

        String s8=s1.concat(s2);
        String s9=s1.concat(s2);

        if( s8==s9) 
        {
            System.out.println("values are equal");
        }
        else
        {
            System.out.println("values are unequl");
        }

        String s10="JAVA".concat(s2);
        String s11="JAVA".concat(s2);

        if( s10==s11) 
        {
            System.out.println("values are equal");
        }
        else
        {
            System.out.println("values are unequl");
        }

        String s12="JAVA".concat("PYTHON");
        String s13="JAVA".concat("PYTHON");

        if( s12==s13) 
        {
            System.out.println("values are equal");
        }
        else
        {
            System.out.println("values are unequl");
        }
    }
}
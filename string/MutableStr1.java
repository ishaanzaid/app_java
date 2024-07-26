public class MutableStr1 {
    public static void main(String[] args) {

        StringBuilder st = new StringBuilder();
        st.append("JAVA ");
        st.append("JAVASCRIPT ");
        st.append("JAMESGOSLING");
        st.delete(2, 10);
        System.out.println(st);

    }
}
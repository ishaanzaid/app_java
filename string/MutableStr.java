public class MutableStr {
    public static void main(String[] args) {
        StringBuffer st = new StringBuffer();
        System.out.println(st.capacity());
        st.append("JAVA ");
        System.out.println(st);

        st.append("JAVASCRIPT ");
        System.out.println(st);

        st.append("JAMES GOSLING");
        System.out.println(st);
        System.out.println(st.capacity());

        st.delete(1, 10);
        System.out.println(st);
    }
}
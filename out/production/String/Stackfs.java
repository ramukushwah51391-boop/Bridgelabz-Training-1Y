import java.util.*; 
public class Stackfs {
 
public static void main(String[] args) {
    Stack<String> st = new Stack<>();
    st.push("home");
    st.push("city");

    System.out.println(st);

    System.out.println("Top value" +st.peek());
    System.out.println("remove value" +st.pop());
    System.out.println(st);
    

}


}

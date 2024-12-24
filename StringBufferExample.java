public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("vaibhav");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("ram");

        System.out.println(sb);
    }
    
}

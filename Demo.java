public class Demo{
    public static void main(String[] args) {
        String str = "Hello World", str2="";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isWhitespace(chars[i])) {
                str2 = str2 + chars[i];
            }
        }
        System.out.println(str2);
    }
}
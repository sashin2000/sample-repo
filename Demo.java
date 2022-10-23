public class Demo{
    public static void main(String[] args) {
        String str = "Hello Java!";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
		System.out.println(chars[i]);
        }
    }
}
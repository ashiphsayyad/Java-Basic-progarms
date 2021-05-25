public class PracticeString {
    public static void main(String[] args) {
        String name = "Mahin";
        System.out.println(name.length());   //gives length of string
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('M','A'));
        System.out.println(name.replace("a","Ha"));
        System.out.println(name.startsWith("m"));
        System.out.println(name.endsWith("in"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("n",3));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.equals("Mahin"));
        System.out.println(name.equalsIgnoreCase("mahin"));



    }
}

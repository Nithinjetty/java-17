public class Main {
    public static final boolean String = false;

    public static void main(String[] args) {
        Object obj="ugv";
        switch (obj) {
            // Pattern matching with switch preview feature for java17
            case String s && s.length() > 0 -> System.out.println(s.toUpperCase());
            case Integer i -> System.out.println("Not a string");
            default -> System.out.println("Unknown type");
        }
}

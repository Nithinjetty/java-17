package main;

public class Main {
    public static void main(String[] args) {
        
        Object obj = "Hi";

        if (obj instanceof String s&& s.length() > 0) {
            System.out.println(s.toUpperCase());
        } else if (obj instanceof Integer i) {
            System.out.println("Not a string");
        }

    }
    
}

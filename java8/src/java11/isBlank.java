package java11;

import java.util.*;

public class isBlank {
    public static void main(String[] args) throws Exception {
        System.out.println(" ".isBlank()); //true
        String s = "Anupam";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true
    }
}

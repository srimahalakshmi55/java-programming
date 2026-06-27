package basic;
import java.util.HashMap;
import java.util.Scanner;
public class anagram {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the first string");
         String s=sc.next();
         System.out.println("enter the second string");
         String t=sc.next();
        if (s.length() != t.length()) {
            System.out.println("Not Anagram");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
          
            char ch = t.charAt(i);

            if (!map.containsKey(ch)) {
                System.out.println("Not Anagram");
                return;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        if (map.isEmpty()) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}

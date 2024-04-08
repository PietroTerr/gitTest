import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INSERIRE STRINGA: ");
        String s = scanner.next();
        if (s.equals("")) System.out.println("STRINGA NON VALIDA, RIPROVARE: ");
        System.out.println("INSERIRE NUMERO DI COMBINAZIONI DESIDERATE: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("NUMERO NON VALIDO, RIPROVARE: ");
        }
        ;
        mix(s, n);
    }

    public static void mix(String str, int num) {
        Random random = new Random();
        int length = str.length();
        boolean[] charSelected = new boolean[length];
        for (int i = 0; i < num; i++) {
            char[] mixedChars = new char[length];
            for (int j = 0; j < length; j++) {
                int r;
                do {
                    r = random.nextInt(length);
                } while (charSelected[r]);
                charSelected[r] = true;
                mixedChars[j] = str.charAt(r);
                char capital = mixedChars[0];
                mixedChars[0] = Character.toUpperCase(capital);

            }
            for (int k = 0; k < length; k++) {
                charSelected[k] = false;
            }
            System.out.println(new String(mixedChars));
        }

    }
    public static void allAnagrams(String str){
        int i,fact=1;
        int number=str.length();// our number to do the necessary calculations in class Factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        mix(str, fact);
    }

}


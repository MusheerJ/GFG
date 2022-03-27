import java.util.Scanner;

public class NumberEncryption {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String num = s.next();
        String op = s.next();
        System.out.println(encryptNumber(num, op));

    }

    static String en(String num, String op) {
        StringBuilder result = new StringBuilder(num);

        int currentIndex = 0;
        for (int i = 0; i < op.length(); i++) {
            if (op.charAt(i) == 'R') {
                currentIndex++;
            } else if (op.charAt(i) == 'L') {
                currentIndex--;
            } else if (op.charAt(i) == 'T') {
                int a = Character.getNumericValue(result.charAt(currentIndex));
                if (a != 9) {
                    a++;
                    String n = String.valueOf(a);
                    result.setCharAt(currentIndex, n.charAt(0));
                }
            }
        }


        return result.toString();
    }

    static String encryptNumber(String num, String op) {

        StringBuilder b = new StringBuilder(num);
        int currentIndex = 0;
        for (int i = 0; i < op.length(); i++) {
            if (op.charAt(i) == 'R') {
                currentIndex++;
            } else if (op.charAt(i) == 'L') {
                currentIndex--;
            } else if (op.charAt(i) == 'T') {
                int a = Character.getNumericValue(b.charAt(currentIndex));
                if (a != 9) {
                    a++;
                    String n = String.valueOf(a);
                    b.setCharAt(currentIndex, n.charAt(0));
                }
            } else if (op.charAt(i) == 'D') {
                int a = Character.getNumericValue(b.charAt(currentIndex));
                if (a != 0) {
                    a = a - 1;
                    String n = String.valueOf(a);
                    b.setCharAt(currentIndex, n.charAt(0));
                }
            } else if (op.charAt(i) == 'S') {
                int index = 0;
                i++;
                while (!(op.charAt(i) == 'R' || op.charAt(i) == 'L' || op.charAt(i) == 'D' || op.charAt(i) == 'T' || op.charAt(i) == 'S')) {

                    if (i == op.length() - 1) {
                        index = index * 10 + Integer.parseInt(String.valueOf(op.charAt(i)));
                        break;
                    }
                    index = index * 10 + Integer.parseInt(String.valueOf(op.charAt(i)));
                    i++;
                }
                i--;
                char temp = b.charAt(currentIndex);
                char swap = b.charAt(index - 1);
                b.setCharAt(currentIndex, swap);
                b.setCharAt(index - 1, temp);

            }


        }
        return b.toString();
    }
}


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] charArray = scanner.nextLine().toCharArray();
        boolean output = true;

        for (int i = 0; i < charArray.length ; i++) {
            if (i != charArray.length - 1) {
                if (charArray[i + 1] - charArray[i] != 1) {
                    output = false;
                }
            } else if (charArray.length == 1) {
                break;
            } else {
                if (charArray[i - 1] - charArray[i] != -1) {
                    output = false;
                }
            }
        }
        System.out.print(output);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strSplit = str.split(" ");

        int currentHighInt = 0;
        String currentHighStr = "";

        for (int i = 0; i <= strSplit.length - 1; i++) {
            int currentLength = strSplit[i].length();
            if (currentLength > currentHighInt) {
                currentHighInt = currentLength;
                currentHighStr = strSplit[i];
            }
        }
        System.out.print(currentHighStr);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String rvrsStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rvrsStr += str.charAt(i);
        }

        if (str.equals(rvrsStr)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
            
        
    }
}

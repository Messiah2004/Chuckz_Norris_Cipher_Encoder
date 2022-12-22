import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer ticketNum = scanner.nextInt();
        String ticketStr = ticketNum.toString();
        int firstBox = 0;
        int secBox = 0;

        if (ticketStr.charAt(0) + ticketStr.charAt(1) + ticketStr.charAt(2) == ticketStr.charAt(3) + ticketStr.charAt(4) + ticketStr.charAt(5) ) {
            System.out.print("Lucky");
        } else {
            System.out.print("Regular");
        }
    }
}
        
 

package chucknorris;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i != 2;){
            System.out.println ("Please input operation (encode/decode/exit):");
            String operation = scanner.nextLine();
            switch (operation) {
                case "encode":
                    encode();
                    System.out.println();
                    System.out.println();
                    break;
                case "decode":
                    decode();
                    System.out.println();
                    break;
                case "exit":
                    System.out.println("Bye!");
                    System.out.println();
                    i = 2;
                    break;
                default:
                    System.out.println("There is no '" + operation + "' operation");
                    System.out.println();
            }
        }
    }

    public static void encode(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");

        String myString = scanner.nextLine();

        System.out.println("Encoded string:");

        for (int i = 0; i < myString.length(); i++) {
            Character myChar = myString.charAt(i);


            String binaryChar = String.format("%7s", Integer.toBinaryString(myChar)).replace(" ", "0");


            String binaryChar2 = "Random dummy text";

            String binaryChar3 = "Random dummy text";



            if (i != (myString.length() - 1)) {
                Character myChar2 = myString.charAt(i + 1);
                binaryChar2 = String.format("%7s", Integer.toBinaryString(myChar2)).replace(" ", "0");
            }

            if (i != 0) {
                Character myChar3 = myString.charAt(i - 1);
                binaryChar3 = String.format("%7s", Integer.toBinaryString(myChar3)).replace(" ", "0");
            }


            for (int j = 0; j < binaryChar.length(); j++) {
                char myBinaryBit = binaryChar.charAt(j);

                char nextChar;
                if (j != binaryChar.length() - 1) {
                  nextChar = binaryChar.charAt(j + 1);
                } else {
                    nextChar = 'G';
                }

                char priorChar;
                if (j > 0) {
                    priorChar = binaryChar.charAt(j - 1);
                } else {
                    priorChar = 'F';
                }

                char priorStringChar = binaryChar3.charAt(binaryChar3.length() - 1);




                boolean noSpace = false;

                if (j == (binaryChar.length() - 1) && binaryChar.charAt(binaryChar.length() - 1) == binaryChar2.charAt(0)) {
                    noSpace = true;
                }


                if (myBinaryBit == priorChar || j == 0 && myBinaryBit == priorStringChar) {
                    if (myBinaryBit == nextChar || noSpace) {
                        System.out.print("0");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    switch (myBinaryBit) {
                        case '0':
                            if (myBinaryBit == nextChar || noSpace) {
                                System.out.print("00 0");
                            } else {
                                System.out.print("00 0 ");
                            }
                            break;
                        case '1':
                            if (myBinaryBit == nextChar || noSpace) {
                                System.out.print("0 0");
                            } else { 
                                System.out.print("0 0 ");
                            }
                            break;
                    }
                }

            }
        }
        
    }

    public static void decode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input encoded string:");
        String[] str = scanner.nextLine().split(" ");
        int spaceNum = 0;
        int num = -1;
        String decodedBinary = "";
        String decodedChars = "";

        if (str.length % 2 != 0) {
            System.out.println("Encoded string is not valid.");
            return;
        }

       /* for (int i = 0; i < str.length; i++){
            if (str[i].equals("0")) {
                System.out.println("Encoded string is not valid.");
                return;
            } 
        } */

        for (int i = 0; i < str.length; i++) {
            if (i == 0 || spaceNum == 2) {
                spaceNum = 0;
                spaceNum += 1;
                if (str[i].equals("0")) {
                    num = 1; 
                } else if (str[i].equals("00")) {
                    num = 0;
                } else {
                    System.out.println("Encoded string is not valid.");
                    return;
                }
            } else {
                spaceNum += 1;
                if (num == 1) {
                    for (int j = 0; j < str[i].split("").length; j++) {
                        decodedBinary += "1";
                    }
                } else if (num == 0) {
                     for (int j = 0; j < str[i].split("").length; j++) {
                        decodedBinary += "0";
                    }
                }
            } 
        }
        if (decodedBinary.length() % 7 == 0 ) {
            for (int i = 0; i < decodedBinary.length() / 7; i++) {
                int k = Integer.parseInt(decodedBinary.substring(i * 7, i * 7 + 7), 2);
                decodedChars += String.valueOf(Character.toChars(k));
            }
        } else {
            System.out.println("Encoded string is not valid.");
            return;
        }
        
        System.out.println("Decoded string:");
        System.out.println(decodedChars);
    }
    
}


import java.util.*;

class Main {
    public static void main(String[] args) {
        lib.clearConsole();
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        double num = 0;
        double sum = 0;
        
        while (attempts < 2) {
            input = new Scanner(System.in);
            try {
                System.out.print("Enter a number: ");
                num = input.nextDouble();
                lib.clearConsole();
                sum+=num;
            }
            catch (InputMismatchException e) {
                if (attempts == 0) {
                    System.out.println("Input is not a number.\nTry again or enter wrong input again to exit loop.");
                    attempts++;
                    lib.sleep(3000);
                    lib.clearConsole();
                }
                else {
                    attempts++;
                }
            }
            catch (Exception e) {
                if (attempts == 0) {
                    System.out.println("Unknown error occurred.\nTry again or enter wrong input again to exit loop.");
                    attempts++;
                    lib.sleep(3000);
                    lib.clearConsole();
                }
            }
            finally {
               if (attempts == 2) {
                System.out.println("Total sum: " + sum);
               }
               else {
                continue;
               }
            }
        }
        
    }
}
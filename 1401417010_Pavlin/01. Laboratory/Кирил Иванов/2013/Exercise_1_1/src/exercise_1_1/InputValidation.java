package exercise_1_1;

import java.util.Scanner;

public class InputValidation {
    
    protected static String inputValidation() {
        
        String figurePosition;
        
        Scanner input = new Scanner(System.in, "windows-1251");
        
        while (true) {
            
            System.out.print("\nВъведете позицията на черния офицер: ");

            String validInput = input.next();

            if(validInput.length() == 2 && validInput.substring(0, 1).matches("[a-h]") && validInput.substring(1, 2).matches("[1-8]") ) {

                figurePosition = validInput;

                System.out.println("\nПозицията " + figurePosition + " е валидна.\n");
                break;
            }

            else {

                System.out.println("\nГрешна позиция.");
            }
        }
        
        return figurePosition;
    }
}
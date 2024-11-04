package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntergersFittingInTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTests = scanner.nextInt();        scanner.nextLine();

        for (int i = 0; i < nTests; i++) {
            String inputString = scanner.nextLine();

            String msg = inputString + " can't be fitted anywhere.";

            List<String> fittingTypes = new ArrayList<>();
            fittingTypes.add("* byte");
            fittingTypes.add("* short");
            fittingTypes.add("* int");
            fittingTypes.add("* long");

            try {
                Long inputLong = Long.parseLong(inputString);
                if (inputLong.toString().equals(inputString)) {
                    msg = inputString + " can be fitted in:";
                } else fittingTypes.remove("* long");

                if (inputLong != inputLong.byteValue()) fittingTypes.remove("* byte");
                if (inputLong != inputLong.shortValue()) fittingTypes.remove("* short");
                if (inputLong != inputLong.intValue()) fittingTypes.remove("* int");
                System.out.println(msg);

                if (!fittingTypes.isEmpty()) fittingTypes.stream().forEach(System.out::println);
            } catch (NumberFormatException nfe) {
                System.out.println(msg);
            } //closure of try block and placement of catch block affects the output significantly.
        }
        scanner.close();
    }
}


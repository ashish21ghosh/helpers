import java.util.*;
import java.io.*;

public class InputOutput {
    public static void main(String[] args) { 
        // Input
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // Reads a line of input from STDIN
        String dataStr = scanner.nextLine(); 
        // Reads a boolean value from STDIN
        Boolean dataBool = scanner.nextBoolean(); 
        // Reads a byte value from STDIN
        Byte dataByte = scanner.nextByte(); 
        // Reads a double value from STDIN
        Double dataDouble = scanner.nextDouble(); 
        // Reads a float value from STDIN
        Float dataFloat = scanner.nextFloat(); 
        // Reads a int value from STDIN
        Integer dataInt = scanner.nextInt();
        // Reads a long value from STDIN
        Long dataLong = scanner.nextLong();
        // Reads a short value from STDIN
        Long dataShort = scanner.nextShort();

        // Output
        // outputs data to STDOUT
        // with a newline character at the end
        System.out.println(outputData);
        // without a newline character
        System.out.print(outputData);

        // Buffered input
        // create a buffered input reader object
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // read a line from STDIN
        String dataStr = bufferedReader.readLine();
        }
}

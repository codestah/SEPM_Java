import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
public class FileManager {
    Scanner scan;
    String sourceFileName;

    public FileManager(String fileName) {
        scan = new Scanner(System.in);
        sourceFileName = fileName;
    }


    // Function to return everything in the csv file
    // Parse the csv file
    public List<String[]> parseCSV()
            throws FileNotFoundException {
        //Scanner class to read through file from beginning to end
       // Scanner scanner;
        //scanner = new Scanner(new File(sourceFileName));
        List<String[]> csv = new ArrayList<String[]>();
        try{
            FileReader filereader = new FileReader(sourceFileName);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String line="";

            while((line = bufferedReader.readLine()) != null) {
                String[] tokens=line.split(",");
                csv.add(tokens);

            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + sourceFileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + sourceFileName + "'");
        }

        // Nested Arraylist called csv for each row
        // Contains all data from the csv file
/*
        int i = 0;

        // While loop using scanner to fill up the csv arraylist
        // The while loop assigns scanner nodes in 6's to the nested array list
        // So we get csv file column structure
        while (scanner.hasNext())
        {
            if (i / 6 == i / 6.0)
                csv.add(new ArrayList<String>());
            csv.get(i / 6).add(scanner.next());
            i++;
        }
        // At the end of the loop, the nested array list has 1 arraylist
        // for every row which contains 6 entries, 1 for each column
        scanner.close();*/
        return csv;
    }
}
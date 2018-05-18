import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
public class FileManager {
    Scanner scan;
    String sourceFileName,destFileName;

    public FileManager(String fileName) {
        scan = new Scanner(System.in);
        sourceFileName = fileName;
    }


    // Function to return everything in the csv file
    // Parse the csv file
    public List<String[]> parseCSV()
            throws FileNotFoundException {

        // Contains all data from the csv file
        // Nested Arraylist called csv for each row
        List<String[]> csv = new ArrayList<String[]>();
        try{
            FileReader filereader = new FileReader(sourceFileName);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String line="";

            // While loop using scanner to fill up the csv arraylist
            // So we get csv file column structure

            while((line = bufferedReader.readLine()) != null) {
                String[] tokens=line.split(",");
                csv.add(tokens);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file" + sourceFileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file" + sourceFileName + "'");
        }
        return csv;
    }

    public void writeFile(String fileName,Booking booking)
    {
        destFileName=fileName;
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(destFileName,true);
            final String COMMA_DELIMITER = ",";
            final String NEW_LINE_SEPARATOR = "\n";

            fileWriter.append(booking.getRefNo());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(booking.getMovieName());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(booking.getMovieLocation());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(booking.getMovieDate());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(booking.getMovieTime());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(booking.getEmail());
            fileWriter.append(NEW_LINE_SEPARATOR);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();            }

        }
    }

    public void updateSeatAvailability(String fileName,Booking booking)
    {
        destFileName=fileName;
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(destFileName,true);
            final String COMMA_DELIMITER = ",";
            final String NEW_LINE_SEPARATOR = "\n";

            fileWriter.append(booking.getRefNo());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(booking.getMovieName());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(booking.getMovieLocation());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(booking.getMovieDate());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(booking.getMovieTime());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(booking.getEmail());
            fileWriter.append(NEW_LINE_SEPARATOR);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();            }

        }
    }


}
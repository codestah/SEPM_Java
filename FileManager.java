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

    List<String[]> csv;
    // Function to return everything in the csv file
    // Parse the csv file
    public List<String[]> parseCSV()
            throws FileNotFoundException {

        // Contains all data from the csv file
        // Nested Arraylist called csv for each row
        csv = new ArrayList<String[]>();
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

    public void updateSeatAvailability(String fileName,Booking booking,int operation) {
        destFileName = fileName;
        FileWriter fileWriter = null;
        try {
            csv = parseCSV();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(destFileName));
            BufferedWriter bw = new BufferedWriter(new FileWriter("A_" + destFileName));
            String line = "";
            int seats = 0;
            for (int i = 0; i < csv.size(); i++)

            {
                if (csv.get(i)[0].equals(booking.getMovieName()) && csv.get(i)[1].equals(booking.getMovieLocation()) && csv.get(i)[2].equals(booking.getMovieDate())
                        && csv.get(i)[3].equals(booking.getMovieTime1()[0]) && csv.get(i)[4].equals(booking.getMovieTime1()[1])) {
                    seats = Integer.parseInt(csv.get(i)[5]);
                    if (seats <= 0) System.out.println("No seats available. Please select another session");
                    else {
                        if (operation == 1)
                            seats--;
                        else if (operation == 2)
                            seats++;
                        int c = 0;
                        while ((line = br.readLine()) != null) {
                            if (c == i) {
                                line = line.replace("," + csv.get(i)[5], "," + Integer.toString(seats));
                            }
                            bw.write(line);
                            bw.newLine();
                            c++;
                        }
                    }
                }

            }
            if (br != null) br.close();
            if (bw != null)
                bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            File oldFile = new File(destFileName);
            oldFile.delete();

            // And rename tmp file's name to old file name
            File newFile = new File("A_" + destFileName);
            newFile.renameTo(oldFile);

        }

    }
}
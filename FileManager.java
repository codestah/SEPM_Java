import java.util.Scanner;

public class FileManager
{
  Scanner scan;
  
  public FileManager()
  {
    scan = new Scanner(System.in);
  }
  
  // Parse the csv file
  public List<ArrayList<String>> parseCSV(int index)
    throws FileNotFoundException {
    //Scanner class to read through file from beginning to end
    Scanner scan;
    scanner = new Scanner(new File("SessionList.csv"));
  }
  // New line, separated by pipe, comma separated columns
  scanner.useDelimiter("\n|,");
  
  // Nested Arraylist called csv for each row
  // Contains all data from the csv file
  List<ArrayList<String>> csv = new ArrayList<ArrayList<String>>();
  int i = 0;
  
  // Use while loop using scanner to fill up the csv arraylist
  // The while loop assigns scanner nodes in 6's to the nested array list
  // So we get csv file column structure
  while (scanner.hasNext()) {
    if (i / 6 == i / 6.0)
      csv.add(new ArrayList<String>());
    csv.get(i / 6).add(scanner.next());
    i++;
  } 
  // At the end of the loop, the nested array list has 1 arraylist 
  // for every row which contains 6 entries, 1 for each column
  scanner.close();
  return csv;
}
import java.io.*;
import java.util.Scanner; 

class Test {

static String cpy = "";

    public static void main(String [] args) {

    


           read();

           write();
          
            
          
            
        

    }

    public static void write ()
    {

        String fileName = "temp.txt";
        String text = cpy;

      //  System.out.println("enter the text into the file....");
      //  Scanner sc = new Scanner(System.in);
       // text = sc.nextLine();


        try {
          
            FileWriter fileWriter =
                new FileWriter(fileName);

          
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);



            System.out.println(cpy);
            bufferedWriter.write(text);

           
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
           
        }
    }

     public static void read()
    {
             // The name of the file to open.
        String fileName = "temp2.txt";

        // This will reference one line at a time
        String line = null;

        System.out.println("Reading the file ....");

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
               
                System.out.println(line);
                cpy = line;
                System.out.println(cpy);
                
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    } 
}


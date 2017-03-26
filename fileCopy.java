import java.io.*;

class Main {
   public static void main(String[] args) throws Exception {

      InputStream in = new FileInputStream(new File("file1.txt"));
      OutputStream out = new FileOutputStream(new File("file2.txt"));
      byte[] buf = new byte[1024];
      int len;
      
      while ((len = in.read(buf)) > 0) {
         out.write(buf, 0, len);
      }

         System.out.println("File ccopied successfully from file1 to file2");

      in.close();
      out.close();

   }
}
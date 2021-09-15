import java.io.*;

public class TryWithResources {

    private static final String src = "src/main/resources/File.txt";
    private static final String dest = "src/main/resources/NewFile.txt";

    public static void main(String[] args) throws IOException {
        int i;
        try (FileInputStream input = new FileInputStream(src);
             FileOutputStream output = new FileOutputStream(dest)) {
            do {
                i = input.read();
                if (i != 1) output.write(i);
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
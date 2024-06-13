import java.io.File; 
import java.util.Scanner;


public class primary{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String directoryInput = console.nextLine();

        File directory = new File(directoryInput); // replace with your directory
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println(directory + " does not exist or is not a directory");
        }
    }
}
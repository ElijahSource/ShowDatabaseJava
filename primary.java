import java.io.File; 
import java.util.Scanner;


public class primary{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String directoryInput = console.nextLine();

        File directory = new File(directoryInput); // replace with your directory
        File[] Shows = directory.listFiles();
        int i=0;
        int y=0;
        int z=0;

        if (Shows != null) {
            for (File file : Shows) {
                
                if (file.isDirectory()) {
                    i++;
                    System.out.println(i+" "+file.getName());
                }
            }
        } 
        else {
            System.out.println(directory + " does not exist or is not a directory");
        }

        int ShowNum = console.nextInt();

        File[] Seasons = Shows[ShowNum].listFiles();
        
        if (Seasons != null) {
            for (File file : Seasons) {
                
                if (file.isDirectory()) {
                    y++;
                    System.out.println(y+" "+file.getName());
                }
            }
        } 
        else {
            System.out.println(directory + " does not exist or is not a directory");
        }

        int SeasonNum = console.nextInt();
        File[] Episodes = Seasons[SeasonNum].listFiles();
        
        if (Episodes != null) {
            for (File file : Episodes) {
                
                if (file=true) {
                    z++;
                    System.out.println(z+" "+file.getName());
                }
            }
        } 
        else {
            System.out.println(directory + " does not exist or is not a directory");
        }





    }
}
import java.io.File;
import java.util.Scanner;


public class primary{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your tv program directory, this program assumes your tv directory contains show directories, your show directories contain season directories, and your season directories contain episodes.");
        String directoryInput = console.nextLine();

        printChildFiles(getChildFiles(directoryInput));

        /* 
        if (Shows != null) {//if there are shows
            for (File file : Shows) {//for every file in shows
                File[] Seasons = Shows[i].listFiles();//array seasons = shows[i]
                if (file.isDirectory()) {//if the file is a directory
                    i++;//increment i
                    if (Seasons != null) {//if there are seasons
                        for (File file2 : Seasons) {//for every file in seasons
                            int y=0;
                            int count;
                            if (file2.isDirectory()) {//if file is directory
                                y++;//increment by 1
                                File[] Episodes = Seasons[y].listFiles();
                                System.out.println(String.valueOf(Seasons)+String.valueOf(Episodes.length));
                            }
                            
                        }
                    } 
                }
            }
        } 
        else {
            System.out.println(directory + " does not exist or is not a directory");
        }

        System.out.println("Select which show, by number");
        */
  
        
/*
        else {
            System.out.println(directory + " does not exist or is not a directory");
        }

        System.out.println("Select which season, by number");

        
        if (Episodes != null){
            int count = Episodes.length;
            System.out.println(count);

        }
 
        if (Episodes != null) {
            for (File file : Episodes) {
                z++;
                System.out.println(z+" "+file.getName());
            }
        } 
        else {
            System.out.println(directory + " does not exist or is not a directory");
        }*/
        //These repeated functions can definitely be resolved to one function 
    }

    static File[] getChildFiles(String directory) {
        File directoryInput = new File(directory); 
        File[] Files = directoryInput.listFiles();
        return Files;
    }

    static File[] getMultipleChildFiles(File[] Files){
        
        return Files;
    }

    static int printChildFiles(File[] Files){
        if (Files != null) {
            for (File file : Files) {
                if (file.isDirectory()) {
                    System.out.println(file.getName());
                    File[] subFiles = file.listFiles();
                    if (subFiles != null) {
                        for (File subFile : subFiles) {
                            if (subFile.isDirectory()) {
                                System.out.println("  Subdirectory: " + subFile.getName());
                            }
                        }
                    }
                }
            }
        } 
        return 0;
    }
}
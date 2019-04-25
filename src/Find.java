import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Find {

    public ArrayList<File> pathToFile = new ArrayList<>();


    public List<File> search(File currentDirectory, String fileName, boolean subDirectory) {

        if (currentDirectory.isDirectory()) {
            File[] directories = currentDirectory.listFiles();
            for (File item : directories) {
                if (subDirectory && item.isDirectory())
                    search(item, fileName, subDirectory);
                else {
                    if (item.getName().equals(fileName)) {
                        pathToFile.add(item);
                    }
                }
            }
        }
        return pathToFile;
    }
}




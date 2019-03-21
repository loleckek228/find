import java.io.File;
import java.util.ArrayList;

public class Find {

    ArrayList<String> pathToFile = new ArrayList<>();

    public Find() {
    }

    public File search(File currentDirectory, String fileName, boolean subDirectory) {
        if (currentDirectory.isDirectory()) {
            File[] directories = currentDirectory.listFiles();
            for (File item : directories) {
                if (subDirectory && item.isDirectory())
                    search(item, fileName, subDirectory);
                else {
                    if (item.getName().equals(fileName)) {
                        pathToFile.add(item.getPath());
                    }
                }
            }
        }
        return new File(pathToFile.toString());
    }


}




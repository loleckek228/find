import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Find {

    private File directory;
    private boolean subDirectory;

    public Find(File directory, boolean subDirectory) {
        this.directory = directory;
        this.subDirectory = subDirectory;
    }

    private static void search(File currentDirectory, String fileName, boolean subDirectory, ArrayList<File> arrayList) {

        if (currentDirectory.isDirectory()) {
            for (File item : currentDirectory.listFiles()) {
                if (subDirectory && item.isDirectory())
                    search(item, fileName, subDirectory, arrayList);
                else {
                    if (item.getName().equals(fileName)) {
                        arrayList.add(item);
                    }
                }
            }
        }
    }

    public List<File> find(String fileName) {

        ArrayList<File> result = new ArrayList<>();

        search(directory, fileName, subDirectory, result);

        return result;
    }
}




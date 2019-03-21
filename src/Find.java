import java.io.File;

public class Find {

    public Find() {
    }

    public File search(String currentDirectory, String fileName, boolean subDirectory) {

        String pathToFile = currentDirectory + "/" + fileName;
        File file = new File(currentDirectory);
        if (file.isDirectory()) {
            String [] directories = file.list();
            for (String item : directories) {
                if (subDirectory) {
                    if (item.equals(fileName)) {
                        pathToFile = currentDirectory;
                    }
                    else {
                        pathToFile = currentDirectory + "/" + item;
                    }
                    if (new File(pathToFile + "/" + fileName).isFile()) {
                        return new File(pathToFile + "/" + fileName);
                    }
                    pathToFile = search(pathToFile, fileName, subDirectory).toString();
                } else {
                    if (new File(pathToFile).isFile()) {
                        return new File(pathToFile);
                    }
                }
            }
        }
        return new File(pathToFile);
    }
}



import java.io.File;

public class Find {
    private String directory;
    private boolean subDirectory;

    public Find(String fileName, Boolean subDirectory) {
        this.directory = fileName;
        this.subDirectory = subDirectory;
    }

    private File search(String currentDirectory, String fileName) {
        String path = currentDirectory + "/" + fileName;
        File file = new File(currentDirectory);
        if (subDirectory) {
            String[] directories = file.list();
            if (directories != null) {
                for (int i = 0; i < directories.length; i++) {
                    if (directories[i].equals(fileName))
                        path = directory;
                    else
                        path = directory + "/" + directories[i];
                    if (new File(path + "/" + fileName).isFile())
                        return new File(path + "/" + fileName);
                    if (new File(path, fileName) != null) {
                        path = search(path, fileName).toString();
                        if (new File(path).isFile())
                            return new File(path);
                    }
                }
            }
        }
        else {
            if (new File(path).isFile())
                return new File(path);
        }
        return null;
    }

    public File find(String fileName) {
        File result = search(directory, fileName);
        return result;
    }
}

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class testFiles {



    @Test
    public void test() {
        Find file = new Find();
        ArrayList<File> files = new ArrayList<>();
        files.add(new File("test/file.txt"));
        assertEquals(files,
                file.search(new File("test"), "file.txt", false));
    }
    @Test
    public void test1() {
        Find file = new Find();
        ArrayList<File> files = new ArrayList<>();
        files.add(new File("test/file.txt"));
        files.add(new File( "test/directory1/directory2/file.txt"));
        assertEquals(files,
                file.search(new File("test"), "file.txt", true));
    }

    @Test
    public void test2() {
        Find file = new Find();
        ArrayList<File> files = new ArrayList<>();
        files.add(new File("test/directory1/directory2/file2.txt"));
        assertEquals(files,
                file.search(new File("test"), "file2.txt", true));
    }

    @Test
    public void test3() {
        Find file = new Find();
        ArrayList<File> files = new ArrayList<>();
        files.add(new File("test/directory1/file1.txt"));
        assertEquals(files,
                file.search(new File("test"), "file1.txt", true));
    }

}

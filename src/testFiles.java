import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class testFiles {


    @Test
    public void test() {
        Find file = new Find(new File("test"), false);
        ArrayList<File> files = new ArrayList<>();
        files.add(new File("test/file.txt"));
        assertEquals(files,
                file.find( "file.txt"));
    }

    @Test
    public void test1() {
        Find file = new Find(new File("test"), true);
        ArrayList<File> files = new ArrayList<>();
        files.add(new File("test/file.txt"));
        files.add(new File("test/directory1/directory2/file.txt"));
        assertEquals(files,
                file.find( "file.txt"));
    }

    @Test
    public void test2() {
        Find file = new Find(new File("test"), true);
        ArrayList<File> files = new ArrayList<>();
        files.add(new File("test/directory1/directory2/file2.txt"));

        assertEquals(files,
                file.find("file2.txt"));
    }

    @Test
    public void test3() {
        Find file = new Find(new File("test"), true);
        ArrayList<File> files = new ArrayList<>();
        files.add(new File("test/directory1/file1.txt"));
        assertEquals(files,
                file.find( "file1.txt"));
    }

    @Test
    public void test4() {
        Find file = new Find(new File("test"), true);

        ArrayList<File> files = new ArrayList<>();
        files.add(new File("test/directory1/file1.txt"));

        ArrayList<File> files1 = new ArrayList<>();
        files1.add(new File("test/directory1/directory2/file2.txt"));

        assertEquals(files,
                file.find("file1.txt"));
        assertEquals(files1,
                file.find("file2.txt"));
    }
    @Test
    public void test5() {
        Find file = new Find(new File("test"), true);
        Find file2 = new Find(new File("test"), true);

        ArrayList<File> files = new ArrayList<>();
        files.add(new File("test/directory1/file1.txt"));

        ArrayList<File> files1 = new ArrayList<>();
        files1.add(new File("test/directory1/directory2/file2.txt"));

        assertEquals(files,
                file.find("file1.txt"));
        assertEquals(files1,
                file2.find("file2.txt"));
    }

}

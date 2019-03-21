import org.junit.Test;

import java.io.File;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class testFiles {



    @Test
    public void test() {
        Find file = new Find();
        assertEquals(new File(Arrays.asList("test/file.txt").toString()),
                file.search(new File("test"), "file.txt", false));
    }
    @Test
    public void test1() {
        Find file = new Find();
        assertEquals(new File(Arrays.asList("test/file.txt, test/directory1/directory2/file.txt").toString()),
                file.search(new File("test"), "file.txt", true));
    }

    @Test
    public void test2() {
        Find file = new Find();
        assertEquals(new File(Arrays.asList("test/directory1/directory2/file2.txt").toString()),
                file.search(new File("test"), "file2.txt", true));
    }

    @Test
    public void test3() {
        Find file = new Find();
        assertEquals(new File(Arrays.asList("test/directory1/file1.txt").toString()),
                file.search(new File("test"), "file1.txt", true));
    }

}

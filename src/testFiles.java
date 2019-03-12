import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class testFiles {

    @Test
    public void test() {
        Find file = new Find("test/directory1", false);
        assertEquals(new File("test/directory1/file1.txt"), file.find("file1.txt"));
    }

    @Test
    public void test1() {
        Find file = new Find("test", true);
        assertEquals(new File("test/directory1/file1.txt"), file.find("file1.txt"));

    }
}

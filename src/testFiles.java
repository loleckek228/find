import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class testFiles {



    @Test
    public void test1() {
        Find file = new Find();
        assertEquals(new File("test/file.txt"),
                file.search("test", "file.txt", false));
        assertEquals(new File("test/directory1/directory2/file2.txt"),
                file.search("test/directory1/directory2", "file2.txt", false));
        assertEquals(new File("test/directory1/file1.txt"),
                file.search("test", "file1.txt", true));
        assertEquals(new File("test/directory1/directory2/file2.txt"),
                file.search("test", "file2.txt", true));

    }
}

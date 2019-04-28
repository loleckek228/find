import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.File;

public class FindLauncher {

    @Option(name = "-r", metaVar = "SubDirect", usage = "Find Subdirectory")
    private boolean subDirectory;

    @Option(name = "-d", metaVar = "Directory", usage = "Path to the File")
    private String directory;

    @Argument(metaVar = "fileName", usage = "Input file name", required = true)
    private String fileName;

    public static void main(String[] args) {
        new FindLauncher().launch(args);
    }

    private void launch(String[] args) {
        CmdLineParser parser = new CmdLineParser(this);
        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            System.err.println("Expected argument: [-r] [-d directory] filename.txt");
            parser.printUsage(System.err);
            return;
        }

        if (args.length <= 2 || args.length > 4) {
            System.out.println("Command Line: [-r] [-d directory] filename.txt");
        } else {
            Find file = new Find(new File(directory), subDirectory);
            file.find(fileName).forEach(System.out::println);
        }
    }
}

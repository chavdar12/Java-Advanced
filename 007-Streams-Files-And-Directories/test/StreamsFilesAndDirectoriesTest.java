import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static support.Console.normalise;
import static support.Console.run;

class StreamsFilesAndDirectoriesTest {
    private static final String TEXT = """
            On January 1 , 1533 ,
            Michael Angelo,
            then fifty-seven years old,
            writes
            from Florence to
            Tommaso de' Cavalieri,
            a youth of noble Roman family,
            """;

    @TempDir
    Path dir;

    private String input(String content) throws Exception {
        return Files.writeString(dir.resolve("input.txt"), content).toString();
    }

    private String output() {
        return dir.resolve("output.txt").toString();
    }

    private String written() throws Exception {
        return normalise(Files.readString(dir.resolve("output.txt")));
    }

    @Test
    void readFilePrintsEveryByteInBinary() throws Exception {
        String in = input("On");
        assertEquals("1001111 1101110", run(() -> ReadFile.main(new String[]{in}), ""));
    }

    @Test
    void writeToFileSkipsPunctuation() throws Exception {
        WriteToFile.main(new String[]{input("Two households, both alike in dignity.\nIn fair Verona!?"), output()});
        assertEquals("Two households both alike in dignity\nIn fair Verona", written());
    }

    @Test
    void copyBytesWritesAsciiCodesAndKeepsWhitespace() throws Exception {
        CopyBytes.main(new String[]{input("On January 1 ,\nthen"), output()});
        assertEquals("79110 749711011797114121 49 44\n116104101110", written());
    }

    @Test
    void extractIntegersSkipsNumbersInsideWords() throws Exception {
        ExtractIntegers.main(new String[]{input(TEXT + "abc123 42\n"), output()});
        assertEquals("1\n1533\n42", written());
    }

    @Test
    void writeEveryThirdLine() throws Exception {
        WriteEveryThirdLine.main(new String[]{input(TEXT), output()});
        assertEquals("then fifty-seven years old,\nTommaso de' Cavalieri,", written());
    }

    @Test
    void sortLines() throws Exception {
        SortLines.main(new String[]{input("C\nA\nB\nD\n"), output()});
        assertEquals("A\nB\nC\nD", written());
    }

    @Test
    void listFilesShowsOnlyDirectFiles() throws Exception {
        Files.writeString(dir.resolve("input.txt"), "12345");
        Files.writeString(dir.resolve("output.txt"), "");
        Files.createDirectories(dir.resolve("nested")).resolve("ignored.txt").toFile().createNewFile();
        assertEquals("input.txt: [5]\noutput.txt: [0]", run(() -> ListFiles.main(new String[]{dir.toString()}), ""));
    }

    @Test
    void nestedFoldersCountsTheRootToo() throws Exception {
        Path root = Files.createDirectories(dir.resolve("Files-and-Streams"));
        Files.createDirectories(root.resolve("Serialization"));
        Files.createDirectories(root.resolve("Streams-and-Files/Inner"));
        assertEquals("Files-and-Streams\nSerialization\nStreams-and-Files\nInner\n4 folders",
                run(() -> NestedFolders.main(new String[]{root.toString()}), ""));
    }

    @Test
    void serializeCustomObjectRoundTrips() throws Exception {
        String file = dir.resolve("cube.ser").toString();
        assertEquals("Cube[color=green, width=15.3, height=12.4, depth=3.0]",
                run(() -> SerializeCustomObject.main(new String[]{file}), ""));
    }
}

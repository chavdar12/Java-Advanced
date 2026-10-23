import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static support.Console.check;
import static support.Console.normalise;

class FilesTest {
    private static final String TEXT = "On January 1 , 1533 ,\nMichael Angelo,\nI am, the bird?\n";

    @TempDir
    Path dir;

    private String write(String name, String content) throws Exception {
        return Files.writeString(dir.resolve(name), content).toString();
    }

    private String read(String name) throws Exception {
        return normalise(Files.readString(dir.resolve(name)));
    }

    private String out() {
        return dir.resolve("output.txt").toString();
    }

    @Test
    void allCapitals() throws Exception {
        AllCapitals.main(new String[]{write("input.txt", TEXT), out()});
        assertEquals("ON JANUARY 1 , 1533 ,\nMICHAEL ANGELO,\nI AM, THE BIRD?", read("output.txt"));
    }

    @Test
    void copyAPictureCopiesBytesExactly() throws Exception {
        byte[] picture = new byte[10_000];
        for (int i = 0; i < picture.length; i++) {
            picture[i] = (byte) (i * 31);
        }
        Path source = Files.write(dir.resolve("picture.jpg"), picture);
        Path copy = dir.resolve("picture-copy.jpg");
        CopyAPicture.main(new String[]{source.toString(), copy.toString()});
        assertArrayEquals(picture, Files.readAllBytes(copy));
    }

    @Test
    void countCharacterTypes() throws Exception {
        String input = write("input.txt", "Hello, world!\nIs it ok?\n");
        // only lowercase a e i o u are vowels, so the capital I counts as a consonant
        check("Vowels: 5\nConsonants: 11\nPunctuation: 3", () -> CountCharacterTypes.main(new String[]{input}), "");
    }

    @Test
    void getFolderSizeIncludesSubfolders() throws Exception {
        write("a.txt", "12345");
        Files.createDirectory(dir.resolve("sub"));
        write("sub/b.txt", "123");
        check("Folder size: 8", () -> GetFolderSize.main(new String[]{dir.toString()}), "");
    }

    @Test
    void lineNumbers() throws Exception {
        LineNumbers.main(new String[]{write("input.txt", "first\nsecond\n"), out()});
        assertEquals("1. first\n2. second", read("output.txt"));
    }

    @Test
    void mergeTwoFiles() throws Exception {
        MergeTwoFiles.main(new String[]{write("one.txt", "1\n2\n"), write("two.txt", "3\n4\n"), out()});
        assertEquals("1\n2\n3\n4", read("output.txt"));
    }

    @Test
    void sumBytesCountsEverythingButLineBreaks() throws Exception {
        String input = write("input.txt", "ab\n!\n");
        // 'a' 97 + 'b' 98 + '!' 33
        check("228", () -> SumBytes.main(new String[]{input}), "");
    }

    @Test
    void sumLinesPerLine() throws Exception {
        String input = write("input.txt", "ab\n!\n");
        check("195\n33", () -> SumLines.main(new String[]{input}), "");
    }

    @Test
    void wordCountMatchesWholeWordsSortedByCount() throws Exception {
        String words = write("words.txt", "of which The");
        String text = write("text.txt", "The house of which the roof is the house of whichever.\nOf course, of it.\n");
        WordCount.main(new String[]{words, text, out()});
        assertEquals("of - 3\nwhich - 1\nThe - 1", read("output.txt"));
    }
}

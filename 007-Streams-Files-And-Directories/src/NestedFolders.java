import java.io.File;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) {
        Deque<File> queue = new ArrayDeque<>();
        queue.offer(new File(args[0]));
        int count = 0;

        while (!queue.isEmpty()) {
            File folder = queue.poll();
            System.out.println(folder.getName());
            count++;
            File[] children = folder.listFiles(File::isDirectory);
            if (children != null) {
                Arrays.sort(children, Comparator.comparing(File::getName));
                queue.addAll(Arrays.asList(children));
            }
        }
        System.out.println(count + " folders");
    }
}

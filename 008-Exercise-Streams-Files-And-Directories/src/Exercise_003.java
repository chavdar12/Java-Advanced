package src;

import java.io.File;

public class Exercise_003 {
    public static void main(String[] args) {
        String path = "Exercises Resources";
        File file = new File(path);

        dfs(file);
        System.out.println(count);
    }

    static int count = 0;

    private static void dfs(File file) {
        if (!file.isDirectory()) {
            count += file.length();
            return;
        }

        File[] files = file.listFiles();
        for (File f : files) {
            dfs(f);
        }
    }
}

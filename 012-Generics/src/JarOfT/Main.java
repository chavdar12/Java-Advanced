package src.JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();
        jar.add("Pesho");
        jar.add("Gosho");
        jar.add("Stamat");
        System.out.println(jar.remove());
    }
}

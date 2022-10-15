package m1_mito;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.counter("Hello World");
    }

    private void counter(String string) {

        String trimmed = string.trim();
        String cleaned = trimmed.replaceAll("\\s+", "");

        int[] counter = new int[256];

        for (int i = 0; i < cleaned.length(); i++) {
            counter[cleaned.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if(counter[i] != 0){
                System.out.println((char) i + " -> " + counter[i]);
            }

        }
    }
}

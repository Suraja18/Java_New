import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        try{
            Process process = processBuilder.start();
            while (true){
                try{
                    int exitCode = process.exitValue();
                    System.out.println("Process exited  with code: "+ exitCode);
                    break;
                } catch (IllegalThreadStateException e) {

                }
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
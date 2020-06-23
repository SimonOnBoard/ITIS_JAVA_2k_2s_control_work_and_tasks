import java.io.*;
import java.net.URL;

public class LoadFilesFromUrl {

    public static void main(String[] args) throws IOException {
        InputStream inputStream;
        try {
            inputStream = new URL(args[0]).openStream();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s;
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File("image.png")));
        while((s = bufferedReader.readLine()) != null){
            printWriter.println(s);
        }
        bufferedReader.close();
        printWriter.close();
        loadPicture(args);
    }

    private static void loadPicture(String[] args) throws IOException {
        InputStream inputStream;
        try {
            inputStream = new URL(args[0]).openStream();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        int i;
        File file;
        FileOutputStream fileOutputStream = new FileOutputStream("photo_horse.png");
        while ((i = inputStream.read()) != -1){
            fileOutputStream.write(i);
        }
        inputStream.close();
        fileOutputStream.close();
    }
}

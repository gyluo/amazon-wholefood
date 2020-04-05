package autoslot.config;

import java.io.*;

public class Configures {
    public static String username;
    public static String password;

    static {
        File file = new File("/Users/gluo/amazon.config");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            username = br.readLine();
            password = br.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

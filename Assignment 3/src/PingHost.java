import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PingHost {

    public static void runSystemCommand(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                //p.destroy();
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        String ip;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        ip =in.nextLine();
        runSystemCommand("ping " + ip);

    }
}

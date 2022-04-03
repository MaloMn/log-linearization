import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Request {

    private static final String connectionString = "elastic:8iskEsS7vetPvrhBzdhtiIT6";
    private static final String server = "https://k-elastic-c3a4b8.es.francecentral.azure.elastic-cloud.com:9243/";

    public static JSONObject getRequest(String query) {
        String command = String.join(" ","curl", "-u", connectionString, "-XGET", server + query);
        System.out.println("Executing: " + command);

        Runtime rt = Runtime.getRuntime();

        Process proc = null;
        try {
            proc = rt.exec(command.split(" "));
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert proc != null;
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));

        // Read the output from the command
        System.out.println("Here is the standard output of the command:\n");
        String s = null;
        while (true) {
            try {
                if ((s = stdInput.readLine()) == null) break;
                System.out.println(s);
                //return new JSONObject(s);
            } catch (IOException  e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void postRequest(String s, String s1) {
        String command = "curl -u " + connectionString + " -XGET" + server + s;
    }
}

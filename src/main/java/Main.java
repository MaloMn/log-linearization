import org.json.JSONObject;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // 1. Get times of last logs per device
        JSONObject data = Request.getRequest("data-*/_search");
        // 2. Parse result, and extract hashmap<device, timestamps>

        // 3. Get messages of these last logs : deviceId = 4562 AND timestamp = 1234563 OR ...
        //Request.getRequest("data/_search");
        // 4. Emit new logs on new index, timestamped with start of 1.
        //Request.postRequest("new_index/", "{\"message\":\"new log\"}");


    }
}

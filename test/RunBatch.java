package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RunBatch {

  public void hintApiCall(int n) throws IOException {
    String resourceUrl = "http://localhost:8080/helloworld";
    URL url = new URL(resourceUrl);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i <= n; i++) {
      int responseCode = conn.getResponseCode();
      map.put(i, responseCode);
    }
    System.out.println(map);
    conn.disconnect();
  }
  public static void main(String[] args) throws Exception {
    new RunBatch().hintApiCall(100);
  }
}


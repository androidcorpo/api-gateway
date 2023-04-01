package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class RunBatch {
  public void hintApiCall(int n) throws IOException {
    String resourceUrl = "http://localhost:8080/helloworld";
    URL url = new URL(resourceUrl);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    for (int i = 0; i <= n; i++)
      conn.getInputStream();
  }

  public static void main(String[] args) throws Exception {
    new RunBatch().hintApiCall(100);
  }
}


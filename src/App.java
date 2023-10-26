import com.example.client.Client;

public class App {

  public static void main(String[] args) throws Exception {
    Client client = new Client();
    String url = "https://jsonplaceholder.typicode.com/todos";
    String res = client.get(url);
    System.out.println(res);
  }
}

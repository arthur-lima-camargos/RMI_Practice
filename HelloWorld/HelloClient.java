import java.rmi.Naming;

public class HelloClient {
    public static void main(String[] args) {
        try {
            // Porta e Serviço
            Hello obj = (Hello) Naming.lookup("rmi://10.0.2.15:1099/HelloService");
            System.out.println("Response: " + obj.hello());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

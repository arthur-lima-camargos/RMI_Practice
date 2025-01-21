import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class HelloServer {
    HelloServer() {
        try {
            // Identifica a porta
            System.setProperty("java.rmi.server.hostname", "10.0.2.15");
            LocateRegistry.createRegistry(1099);
            // Batizando o serviço
            Hello obj = new HelloImpl();
            Naming.rebind("HelloService", obj);
            System.out.println("Hello Server Pronto!!!");
        } catch (Exception e) {
            e.printStackTrace(); // Printa errros que possam aparecer.
        }
    }

    public static void main(String[] args) {
        new HelloServer();
    }
}

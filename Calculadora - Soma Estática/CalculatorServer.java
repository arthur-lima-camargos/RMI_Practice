import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    CalculatorServer() {
        try {
            // Identifica a porta
            System.setProperty("java.rmi.server.hostname", "10.0.2.15");
            LocateRegistry.createRegistry(1099);
            // Batizando o serviço
            Calculator obj = new CalculatorImpl();
            Naming.rebind("CalculatorService", obj);
            System.out.println("Calculator Server Pronto!!!");
        } catch (Exception e) {
            e.printStackTrace(); // Printa errros que possam aparecer.
        }
    }

    public static void main(String[] args) {
        new CalculatorServer();
    }
}

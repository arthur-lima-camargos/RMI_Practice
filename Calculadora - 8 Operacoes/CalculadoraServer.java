import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculadoraServer {
    CalculadoraServer() {
        try {
            // Identifica a porta
            System.setProperty("java.rmi.server.hostname", "10.0.2.15");
            LocateRegistry.createRegistry(1099);
            // Batizando o serviço
            Calculadora obj = new CalculadoraImpl();
            Naming.rebind("CalculadoraService", obj);
            System.out.println("Server \"Calculadora de 8 Operações\" Pronto!!!");
        } catch (Exception e) {
            e.printStackTrace(); // Printa errros que possam aparecer.
        }
    }

    public static void main(String[] args) {
        new CalculadoraServer();
    }
}

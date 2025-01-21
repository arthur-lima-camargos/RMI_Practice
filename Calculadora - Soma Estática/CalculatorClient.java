import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // Porta e Serviço
            Calculator obj = (Calculator) Naming.lookup("rmi://10.0.2.15:1099/CalculatorService");
            System.out.println("Resposta de 2 + 10: " + obj.add(2, 10));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

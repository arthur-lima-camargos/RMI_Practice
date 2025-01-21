import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {
    protected CalculadoraImpl() throws RemoteException {
        super();
    }

    public Long[] recebeValores() {
        Long[] valores = new Long[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor para a operação selecionada: ");
        valores[0] = scanner.nextLong();

        scanner.nextLine();

        System.out.println("Digite o segundo valor para a operação selecionada: ");
        valores[1] = scanner.nextLong();

        return valores;
    }

    public long adicao(long[] valores) throws RemoteException {
        return valores[0] + valores[1];
    }

    public Long subtracao(long[] valores) throws RemoteException {
        return valores[0] - valores[1];
    }

    public Long multiplicacao(long[] valores) throws RemoteException {
        return valores[0] * valores[1];
    }

    public double divisao(long[] valores) throws RemoteException {
        return valores[0] / valores[1];
    }

    public long[] elevaAoQuadrado(long[] valores) throws RemoteException {
        valores[0] = (long) Math.pow(valores[0], 2);
        valores[1] = (long) Math.pow(valores[1], 2);
        return valores;
    }

    public double[] raizQuadrada(long[] valores) throws RemoteException {
        double[] resultados = new double[valores.length];
        for (int i = 0; i < valores.length; i++) {
            resultados[i] = Math.sqrt((double) valores[i]);
        }
        return resultados;
    }

    public double divisaoEntreQuadrados(long[] valores) throws RemoteException {
        long valoresElevados[] = elevaAoQuadrado(valores);

        double resultado = valoresElevados[0] / valoresElevados[1];
        return resultado;
    }

    public double multiplicacaoEntreRaizes(long[] valores) throws RemoteException {
        double[] raizDosValores = raizQuadrada(valores);

        double resultado = raizDosValores[0] * raizDosValores[1];
        return resultado;
    }
}

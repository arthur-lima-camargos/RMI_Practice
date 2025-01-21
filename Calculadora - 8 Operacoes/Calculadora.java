import java.rmi.RemoteException;
import java.rmi.Remote;

public interface Calculadora extends Remote {
    public Long[] recebeValores() throws RemoteException;

    public long adicao(long[] valores) throws RemoteException;

    public Long subtracao(long[] valores) throws RemoteException;

    public Long multiplicacao(long[] valores) throws RemoteException;

    public double divisao(long[] valores) throws RemoteException;

    public long[] elevaAoQuadrado(long[] valores) throws RemoteException;

    public double[] raizQuadrada(long[] valores) throws RemoteException;

    public double divisaoEntreQuadrados(long[] valores) throws RemoteException;

    public double multiplicacaoEntreRaizes(long[] valores) throws RemoteException;
}

import java.rmi.RemoteException;
import java.rmi.Remote;

public interface Calculator extends Remote {
    public Long add(long a, long b) throws RemoteException;
}

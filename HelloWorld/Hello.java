import java.rmi.RemoteException;
import java.rmi.Remote;

public interface Hello extends Remote {
    public String hello() throws RemoteException;
}

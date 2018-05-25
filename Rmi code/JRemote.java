import java.rmi.*;

public interface JRemote extends Remote{

public abstract String getFullName(String fullname,String lastname) throws RemoteException;

}
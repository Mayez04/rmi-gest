package Rmigestionnairesecuriteetchargementdynamique.DynamicServerClient;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FabInterface extends Remote {
    AppInterface newReverse() throws RemoteException;
}

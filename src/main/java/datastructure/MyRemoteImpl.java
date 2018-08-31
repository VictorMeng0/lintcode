package datastructure;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by menghan on 2018/8/28.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote,Serializable {
    protected MyRemoteImpl() throws RemoteException {

    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says hi";
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("rmi://172.24.142.203:1099/HelloService",service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}

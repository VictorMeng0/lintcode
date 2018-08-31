package datastructure;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by menghan on 2018/8/28.
 */
public interface MyRemote extends Remote{
    public String sayHello() throws RemoteException;
}

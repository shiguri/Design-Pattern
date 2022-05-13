package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 继承标记接口 Remote,
 * 所有的远程方法都需要声明 RemoteException
 *
 * client 和 server 必需有相同的包名。
 */
public interface MyRemote extends Remote {
    public String getMeaning(int i) throws RemoteException;
}

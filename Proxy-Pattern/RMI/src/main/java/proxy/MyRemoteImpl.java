package proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 1. 扩展 UnicastRemoteObject 来创建远程对象。
 * 2. 实现远程接口
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {}

    public String getMeaning(int i) throws RemoteException {
        String ret = "";

        switch (i) {
            case 0 :
                ret = "zero";
                break;
            case 1 :
                ret = "one";
                break;
            default :
                ret = "not 0 and 1";
        }

        return ret;
    }

    public static void main(String[] args) {
        try {
            MyRemote myRemote = new MyRemoteImpl();
            Naming.rebind("MyRemoteService", myRemote);
        } catch (RemoteException | MalformedURLException var2) {
            var2.printStackTrace();
        }
    }
}

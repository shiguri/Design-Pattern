package proxy;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        MyRemote service = null;
        try {
            service = (MyRemote) Naming.lookup("rmi://127.0.0.1/MyRemoteService");
            for (int i = 0; i < 3; i++) {
                System.out.println(service.getMeaning(i));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

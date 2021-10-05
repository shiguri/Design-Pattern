import single.Singleton;

public class Main {
    static Singleton singleton1;
    static Singleton singleton2;

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                Main.singleton1 = Singleton.getInstance();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                Main.singleton2 = Singleton.getInstance();
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(singleton1);
        System.out.println(singleton1 == singleton2);
    }
}

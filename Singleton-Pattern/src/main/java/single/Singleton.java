package single;

public class Singleton {
    private static volatile Singleton uniqueInstance;

    /*
    * 构造方法必须私有
     */
    private Singleton() {}

    /*
    * 定义访问点，通过此静态方法获取实例
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }

    public void doMethod() {
        System.out.println(uniqueInstance.hashCode() + " : working");
    }
}

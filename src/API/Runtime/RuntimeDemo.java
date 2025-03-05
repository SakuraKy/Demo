package API.Runtime;

public class RuntimeDemo {
    public static void main(String[] args) {
        // Runtime:当前虚拟机的运行环境

        // 1.获取Runtime对象
        // 因为是私有的，所以要使用静态方法getRuntime()获取
        Runtime r1 = Runtime.getRuntime();
        @SuppressWarnings("unused")
        Runtime r2 = Runtime.getRuntime();

        // System.out.println(r1 == r2); 结果为true

        // 2.exit 停止虚拟机、0是正常停止，非0是异常停止
        // r1.exit(0);
        // Runtime.getRuntime().exit(0);

        // 3.获得cpu的线程数
        System.out.println(r1.availableProcessors());

        // 4.获得JVM可以使用的总内存,单位byte字节
        System.out.println(r1.maxMemory() / (1024 * 1024) + "M");

        // 5.获得JVM已经获得的内存大小,单位byte字节
        System.out.println(r1.totalMemory() / (1024 * 1024) + "M");

        // 6.剩余内存的大小
        System.out.println(r1.freeMemory() / (1024 * 1024) + "M");

    }

}

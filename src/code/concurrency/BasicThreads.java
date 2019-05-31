package code.concurrency;

/**
 * @Classname BasicThreads
 * @Description 将定义的线程任务转变为工作任务
 * @Author tujing
 * @Date 2019/5/27 2:26 PM
 * @Version 1.0
 */
public class BasicThreads {

    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("waiting for LiftOff");
    }
}

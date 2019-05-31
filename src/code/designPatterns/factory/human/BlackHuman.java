package code.designPatterns.factory.human;

/**
 * @Classname BlackHuman
 * @Description
 * @Author tujing
 * @Date 2019/5/21 9:35 PM
 * @Version 1.0
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑色人种皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("我是黑色人种");
    }
}

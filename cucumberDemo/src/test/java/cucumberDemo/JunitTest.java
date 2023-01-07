package cucumberDemo;

import cucumberDemo.common.AbstractDemo;
import cucumberDemo.common.InheritDemo;
import org.junit.Test;

public class JunitTest {
    @Test
    public void test_01(){
//        short s1 = 1;
//        s1 = s1 + 1;
        short s1 = 1;
        s1 += 1;
        System.out.println(s1);
    }

    @Test
    public void test_02(){
       Integer a = 128,b = 128, c = 127, d = 127;
        System.out.println(a == b);
        System.out.println(c == d);
    }

    @Test
    public void test_03(){
        AbstractDemo abstractDemo = new AbstractDemo() {
            @Override
            public void show() {
                System.out.println("抽象类对象");
            }
        };
        abstractDemo.show();
        System.out.println(abstractDemo.getAge());
    }

    @Test
    public void test_04(){
        InheritDemo demo=new InheritDemo();
        demo.show();
        System.out.println(demo.getSex());
    }
}

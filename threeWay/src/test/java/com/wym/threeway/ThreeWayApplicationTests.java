package com.wym.threeway;

import org.junit.jupiter.api.Test;  // 这一行必须加！！
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ThreeWayApplicationTests {

    @Test
    void contextLoads() {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

    }

}

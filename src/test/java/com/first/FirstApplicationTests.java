package com.first;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.platform.commons.function.Try.success;

@SpringBootTest
class FirstApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testKo(){
        //fail("This test is forced to fail");
        success("This test is forced to sucess");
    }

}

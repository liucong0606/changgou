package com.changgou.test;

import com.changgou.entity.StatusCode;
import org.junit.Test;

public class StatusCodeTest {
    /**
     * 测试枚举类返回码
     */
    @Test
    public void test01() {
        System.out.println(StatusCode.OK.getCode());
    }
}

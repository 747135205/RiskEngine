package com.linqi.RiskCtrlSys.utils.redis;

import com.linqi.RiskCtrlSys.utils.Application;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

/**
 * author: linqi
 * description: Redis工具类单元测试
 * date:  2024
*/
@SpringBootTest(classes = Application.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RedisUtilTest {

    @Autowired
    private RedisUtil redisUtil;


    @DisplayName("测试RedisTemplate set")
    @Test
    @Order(1)
    void testStringSet() {

        redisUtil.stringSet("linqi:set", "this is test redis set");

    }

    @DisplayName("测试RedisTemplate get")
    @Test
    @Order(2)
    void testStringGet() {
        String value = (String)redisUtil.stringGet("linqi:set");
        System.out.println(value);

    }

    @DisplayName("测试redis hash set")
    @Test
    @Order(3)
    void testHashSet() {
        Map<String, Object> map = new HashMap<>();
        map.put("i","linqi");
        map.put("re","RiskEngine");
        redisUtil.hashSet("linqi:hash", map);
    }

    @DisplayName("测试RedisTemplate hash get")
    @Test
    @Order(4)
    void testHashGet() {

        String value = (String)redisUtil.hashGet("linqi:hash", "i");
        System.out.println(value);
    }
}

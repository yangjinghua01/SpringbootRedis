package com.example.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void Testset() {
//        存入数据
        redisTemplate.boundValueOps("name").set("yjh");
    }

    @Test
    public void Testget() {
//获取数据
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }

}

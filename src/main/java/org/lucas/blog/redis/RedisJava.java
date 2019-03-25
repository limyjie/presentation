/**
 * Author: lin
 * Date: 2019/3/12 10:14
 */
package org.lucas.blog.redis;

import redis.clients.jedis.Jedis;

public class RedisJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.ping());
    }
}

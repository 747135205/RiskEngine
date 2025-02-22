package flink.redis.conf;

import lombok.Getter;

/**
 * author: Juege
 * description: Redis数据类型的枚举类
 * date: 2023
 */

@Getter
public enum JuegeRedisDataType {

    STRING,
    HASH,
    LIST,
    SET,
    SORTED_SET,
    ;

    JuegeRedisDataType() {
    }
}

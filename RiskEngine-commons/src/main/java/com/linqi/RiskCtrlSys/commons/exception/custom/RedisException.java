package com.linqi.RiskCtrlSys.commons.exception.custom;

import com.linqi.RiskCtrlSys.commons.exception.BizRuntimeException;
import com.linqi.RiskCtrlSys.commons.exception.enums.BizExceptionInfo;

/**
 * author: linqi
 * description: Redis 自定义异常类
 * date: 2024
 */

public class RedisException extends BizRuntimeException {


    public RedisException(BizExceptionInfo info) {
        super(info);
    }
}

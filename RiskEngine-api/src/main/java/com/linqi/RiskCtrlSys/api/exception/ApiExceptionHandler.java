package com.linqi.RiskCtrlSys.api.exception;

import com.linqi.RiskCtrlSys.commons.exception.custom.RedisException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * author: linqi
 * description: 全局的异常捕抓 (Api)
 * date: 2024
 */

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = RedisException.class)
    public void RedisExceptionHandler(RedisException e) {
        System.out.println("RedisExceptionHandler!!!!!!!");
        //TODO 错误处理
    }

}

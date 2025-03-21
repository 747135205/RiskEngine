package com.linqi.RiskCtrlSys.commons.exception.custom;

import com.linqi.RiskCtrlSys.commons.exception.BizRuntimeException;
import com.linqi.RiskCtrlSys.commons.exception.enums.BizExceptionInfo;
import lombok.extern.slf4j.Slf4j;

/**
 * author: linqi
 * description: Flink 配置信息自定义错误
 * date: 2024
 */

@Slf4j
public class FlinkPropertiesException extends BizRuntimeException {

    public FlinkPropertiesException(BizExceptionInfo info) {
        super(info);
    }
}

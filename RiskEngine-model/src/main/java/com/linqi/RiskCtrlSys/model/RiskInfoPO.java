package com.linqi.RiskCtrlSys.model;

import lombok.Data;

/**
 * author: linqi
 * description: 风险信息POJO
 * date: 2024
 */

@Data
public class RiskInfoPO {

    /**
     * uid
     */
    private int user_id_int;
    /**
     * 规则命中原因
     */
    private String hit_reason;
}

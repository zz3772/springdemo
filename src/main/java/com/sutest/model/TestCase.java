package com.sutest.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TestCase implements Serializable {
    private Integer id;

    /**
     * 用例名称
     */
    private String caseName;

    /**
     * 超时时间（秒）
     */
    private Integer outTime;

    /**
     * 用例描述
     */
    private String caseDesc;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}

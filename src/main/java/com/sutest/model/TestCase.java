package com.sutest.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TestCase implements Serializable {
    private Long id;
    private String caseName;
    private int outTime;
    private String caseDesc;
    private Date createTime;
}

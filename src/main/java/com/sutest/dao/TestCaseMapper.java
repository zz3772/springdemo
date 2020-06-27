package com.sutest.dao;


import com.sutest.model.TestCase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestCaseMapper {

    List<TestCase> findAll(@Param("caseName")String caseName,@Param("caseDesc")String caseDesc);

    int insert(TestCase testCase);
}

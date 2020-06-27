package com.sutest.service.impl;

import com.sutest.dao.TestCaseMapper;
import com.sutest.model.TestCase;
import com.sutest.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCaseServiceImpl implements TestCaseService {
    @Autowired
    private TestCaseMapper testCaseMapper;

    @Override
    public List<TestCase> findAll(String caseName, String caseDesc) {
        return testCaseMapper.findAll(caseName, caseDesc);
    }

    @Override
    public int insert(TestCase testCase) {
        return testCaseMapper.insert(testCase);
    }
}

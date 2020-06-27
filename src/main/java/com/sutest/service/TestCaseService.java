package com.sutest.service;

import java.util.List;

public interface TestCaseService {

    List<com.sutest.model.TestCase> findAll(String caseName, String caseDesc);

    int insert(com.sutest.model.TestCase testCase);
}

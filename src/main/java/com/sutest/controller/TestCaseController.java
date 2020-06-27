package com.sutest.controller;

import com.sutest.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TestCaseController {

    @Autowired
    private TestCaseService testCaseService;
    @RequestMapping("/getList")
    public ResponseInfo findAll(@RequestParam(value = "caseName") String caseName, @RequestParam(value = "caseDesc") String caseDesc) {
        return new ResponseInfo(true, testCaseService.findAll(caseName, caseDesc));
    }
}

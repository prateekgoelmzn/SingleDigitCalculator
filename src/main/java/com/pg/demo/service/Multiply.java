package com.pg.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("*")
public class Multiply implements Operation{
    Logger log = LoggerFactory.getLogger(this.getClass().getName());

    @Override
    public int perform(int num1, int num2) {
        log.info("Performing multiply");
        return num1*num2;
    }
}

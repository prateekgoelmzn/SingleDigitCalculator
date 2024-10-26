package com.pg.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

@Service
public class Calculator {

    public static final char ZERO_CHAR = '0';
    @Autowired
    private Map<String, Operation> operations;

    public int calculate(String str) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (operations.containsKey(String.valueOf(c))) {
                int num1 = stack.pop();
                int num2 = str.charAt(i + 1) - ZERO_CHAR;
                Operation opr = operations.get(String.valueOf(c));
                stack.push(opr.perform(num1, num2));
                i++;
            } else {
                stack.push(str.charAt(i) - ZERO_CHAR);
            }
        }

        return stack.pop();
    }
}

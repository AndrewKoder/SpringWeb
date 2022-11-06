package com.example.springweb.logic;

import com.example.springweb.service.MyMessages;
import org.springframework.stereotype.Component;

@Component
public interface ISolvator {
    // метод решения
    MyMessages.OutputMessage solve(MyMessages.InputMessage input);
}

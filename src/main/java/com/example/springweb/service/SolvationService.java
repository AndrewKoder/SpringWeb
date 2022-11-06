package com.example.springweb.service;

import com.example.springweb.logic.ISolvator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// сам контроллер
@Controller                                // REST-контроллер
@RequestMapping("/service")             // маршрутизация
public class SolvationService {
    @Autowired                      // аннотация автосвязывания
    private ISolvator solvator;     // объект интерфейс решателя (DI)

    // 1. ping
    @GetMapping("/ping")
    public @ResponseBody MyMessages.Message ping() {
        return new MyMessages.Message("pong");
    }

    // 2. статус сервера
    @GetMapping("/status")
    public @ResponseBody MyMessages.Message status() {
        return new MyMessages.Message("Server status OK at port 8080");
    }

    // 3. решение
    @PostMapping("/solvation")
    public @ResponseBody MyMessages.IMessage solve(@RequestBody MyMessages.InputMessage input) {
        System.out.println("Received data: " + input);
        MyMessages.OutputMessage out = solvator.solve(input);
        if (out == null) {
            return new MyMessages.ErrorMessage("The value cannot be empty!");
        }
        return out;
    }
}

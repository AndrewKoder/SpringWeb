package com.example.springweb.logic;

import com.example.springweb.service.MyMessages;
public class SolvatorImpl implements ISolvator {
    // метод нахождения наибольшего общего делителя 2-x целых чисел, алгоритм Евклида
    public static int nod(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    // метод нахождения наименьшего общего кратного 2-x целых чисел
    public static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    @Override
    public MyMessages.OutputMessage solve(MyMessages.InputMessage input) {
        int a = input.a;
        int b = input.b;
        // передача значений серверу
        return new MyMessages.OutputMessage(nok(a, b), nod(a, b));
    }
}

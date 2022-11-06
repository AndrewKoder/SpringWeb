package com.example.springweb.service;

import java.util.Date;

public class MyMessages {
    public interface IMessage {

    }

    // класс простого сообщения
    public static class Message implements IMessage {
        public String message;  // строка сообщения
        public Date time;       // время

        public Message(String message) {
            this.message = message;
            this.time = new Date();
        }

        @Override
        public String toString() {
            return "Message{" +
                    "message='" + message + '\'' +
                    ", time=" + time +
                    '}';
        }
    }

    // входное сообщение
    public static class InputMessage implements IMessage {
        public int a;
        public int b;

        InputMessage(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "InputMessage{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }

    // ответ сервера
    public static class OutputMessage implements IMessage {
        public int outNOK;
        public int outNOD;

        public OutputMessage(int outNok, int outNod) {
            this.outNOK = outNok;
            this.outNOD = outNod;
        }

        @Override
        public String toString() {
            return "OutputMessage{" +
                    "NOK = " + outNOK +
                    ", NOD = " + outNOD +
                    '}';
        }
    }

    // сообщение об ошибке
    public static class ErrorMessage extends Message {
        public ErrorMessage(String error) {
            super(error);
        }
    }
}

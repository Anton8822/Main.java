package com.company;

class WrongFormatOfExpression extends RuntimeException {

    /**
     * @param s Сообщение пользователю о типе ошибки
     */
    WrongFormatOfExpression(String s) {
        System.err.println(s);
    }
}

package com.company.Lessons.les24enum;

public enum StateEnum {
    BAK("USD"),
    RUSSIAN_RUBLE("RUB"),
    EURO("EUR");

    String currency;

    StateEnum(String currency) {
        this.currency = currency;
    }
}

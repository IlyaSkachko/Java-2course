package com.Lab3.Color;

public enum Color {
    GREEN("Зелёный"),
    BLACK("Чёрный"),
    BLUE("Синий"),
    RED("Красный");

    private String color;

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}

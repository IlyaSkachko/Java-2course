package com.Lab3.Color;

public enum Color {
    GREEN("������"),
    BLACK("׸����"),
    BLUE("�����"),
    RED("�������");

    private String color;

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}

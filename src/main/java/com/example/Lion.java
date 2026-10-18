package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    // Базовый объект feline = new Feline() удален отсюда,
    // чтобы класс не зависел от него напрямую.
    Feline feline;

    // Конструктор дополнен: теперь он принимает Feline снаружи
    public Lion(Feline feline, String sex) throws Exception {
        this.feline = feline; // сохраняем переданный объект кошачьих

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}

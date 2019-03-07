package com.spring.aop;

public class MoveProxy implements Move{
    private Move t;

    public MoveProxy(Move t) {
        super();
        this.t = t;
    }

    @Override
    public void move() {
        System.out.println("start");
        t.move();
        System.out.println("stop");
    }
}

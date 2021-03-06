package com.spring.aop;

import java.util.List;

public class Meeting {
    private String theme;
    private List<Boss> boss;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBoss() {
        return boss;
    }

    public void setBoss(List<Boss> boss) {
        this.boss = boss;
    }

    public Meeting(String theme, List<Boss> boss) {
        this.theme = theme;
        this.boss = boss;
    }

    public Meeting() {
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", boss=" + boss +
                '}';
    }
}

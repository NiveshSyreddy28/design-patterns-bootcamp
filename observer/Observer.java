package com.designpatterns.zemoso.observer;

public interface Observer {
    public void update();

    public void setSubject(Subject subject);
}

package org.example.task2;

public class DataBaseAdapter implements DataBase{

    private БазаДаних adaptee;

    public DataBaseAdapter(БазаДаних adaptee) {
        this.adaptee = adaptee;
    }

    public БазаДаних getAdaptee() {
        return adaptee;
    }

    @Override
    public String getUser() {
        return adaptee.отриматиДаніКористувача();
    }

    @Override
    public String getStatistics() {
        return adaptee.отриматиСтатистичніДані();
    }
}

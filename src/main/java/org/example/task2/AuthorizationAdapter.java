package org.example.task2;

public class AuthorizationAdapter implements Authorization {

    private Авторизація adaptee;

    public AuthorizationAdapter(Авторизація adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public boolean authorize(DataBaseAdapter dataBaseAdapter) {
        return adaptee.авторизуватися(dataBaseAdapter.getAdaptee());
    }
}

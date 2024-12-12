package org.example.task2;

public class Main {
    public static void main(String[] args) {
        БазаДаних db = new БазаДаних();
        Авторизація авторизація = new Авторизація();

        DataBaseAdapter dbAdapter = new DataBaseAdapter(db);
        AuthorizationAdapter authAdapter = new AuthorizationAdapter(авторизація);

        if (authAdapter.authorize(dbAdapter)) {
            ReportBuilder br = new ReportBuilder(dbAdapter);
        }
    }
}

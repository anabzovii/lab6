package com.company;

public interface View {
    void Clientready(Client client);
    void Clientrefuse(Client client);
    void Clientbough(Client client);
    void showAvia(Avion avia);
    void Aviacancel(Avion avia);
    void Pilotready(Pilot pilot);
    void Pilotsalary(Pilot pilot);
}

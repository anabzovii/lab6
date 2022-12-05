package com.company;

import java.time.LocalDate;

public class Controller {
    ModelLayer modelLayer = new ConsoleSystemLayer();
    View view = new ConsoleView();

    void Aviaready(Avion avia){
        Avion aviaa = modelLayer.getavion(avia);
        view.showAvia(aviaa);
    }

    void Clientready(Client client){
        Client clientt = modelLayer.getclient(client);
        view.Clientready(clientt);
    }

    void Clientrefuse(Client client){
        Client clientt = modelLayer.getclient(client);
        view.Clientrefuse(clientt);
    }

    void Clientbough(Client client){
        Client clientt = modelLayer.getclient(client);
        view.Clientbough(clientt);
    }

    void Aviacancel(Avion avia){
        Avion aviaa = modelLayer.getavion(avia);
        view.Aviacancel(avia);
    }

    void Pilotready(Pilot pilot){
        Pilot pilott = modelLayer.getpilot(pilot);
        view.Pilotready(pilot);
    }

    void Pilotsalary(Pilot pilot){
        Pilot pilott = modelLayer.getpilot(pilot);
        view.Pilotsalary(pilot);
    }


}

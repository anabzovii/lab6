package com.company;

import java.time.LocalDate;

public class ConsoleSystemLayer implements ModelLayer{
    @Override
    public Avion getavion(Avion avia){
        return new Avion(avia.getCountryin(), avia.getCountryout(),avia.getNrpasageri(), avia.getModel(), avia.getName(), avia.getData());
    }

    public Client getclient(Client client){
        return new Client(client.getName(), client.getSurname(), client.getCountryin(), client.getCountryout(), client.getPrice(),client.getData(),client.getNrpasageri(), client.getModel(), "AirMoldova");
    }

    public Pilot getpilot(Pilot pilot){
        return new Pilot(pilot.getName(), pilot.getSurname(), pilot.getExperience(), pilot.getNrpasageri(), pilot.getModel(),"AirMoldova", pilot.getCountryin(), pilot.getCountryout(), pilot.getData());
    }
}

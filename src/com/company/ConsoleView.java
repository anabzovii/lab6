package com.company;

public class ConsoleView implements View{
    @Override
    public void Clientready(Client client) {
        System.out.println("Clientuln "+ client.getName()+ " "+ client.getSurname()+ " want to buy a ticket for this flight for price: "+ client.getPrice()+ " |ID: "+ client.getId());
    }

    public void Clientrefuse(Client client){
        System.out.println("Client "+ client.getName()+ " "+ client.getSurname()+ " refused to buy !");
    }

    public void Clientbough(Client client){
        System.out.println("Client "+ client.getName()+ " "+ client.getSurname()+ " bought the ticket!");
    }

    public void showAvia(Avion avia){
        System.out.println("Airplane "+ avia.getModel()+ " was established for flight "+avia.getCountryin()+" - "+avia.getCountryout() + " |ID: "+avia.getId());
    }

    public void Aviacancel(Avion avia){
        System.out.println("Flight with " + avia.getModel()+ "with ID: "+ avia.getId() + " | was canceled because of airplane defection! All payments will be refunded");
    }

    public void Pilotready(Pilot pilot){
        System.out.println("Pilot " + pilot.getName() + " " + pilot.getSurname() + " is ready for flight! |ID: " + pilot.getId());
    }

    public void Pilotsalary(Pilot pilot){
        pilot.setExperience(pilot.getExperience()+1);
        System.out.println("Pilot current sallary: " + pilot.getSalary());
    }


}

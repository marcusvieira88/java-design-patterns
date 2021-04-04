package tech.marcusvieira.structural.decorator;

public class EasyJetFlightTicket implements FlightTicket{
    @Override
    public String getDescription() {
        return "EasyJet Flight Ticket - price " + getPrice();
    }

    @Override
    public double getPrice() {
        return 100;
    }
}

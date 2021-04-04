package tech.marcusvieira.structural.decorator;

public class RyanairFlightTicket implements FlightTicket{
    @Override
    public String getDescription() {
        return "Ryanair Flight Ticket - price " + getPrice();
    }

    @Override
    public double getPrice() {
        return 90;
    }
}

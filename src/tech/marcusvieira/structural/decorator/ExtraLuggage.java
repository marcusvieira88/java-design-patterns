package tech.marcusvieira.structural.decorator;

public class ExtraLuggage extends FlightTicketDecorator {

    private FlightTicket flightTicket;

    public ExtraLuggage(FlightTicket flightTicket) {
        this.flightTicket = flightTicket;
    }

    @Override
    public String getDescription() {
        return flightTicket.getDescription()+", Extra Luggage - price " + this.getPrice();
    }

    @Override
    public double getPrice() {
        return flightTicket.getPrice()+40;
    }
}

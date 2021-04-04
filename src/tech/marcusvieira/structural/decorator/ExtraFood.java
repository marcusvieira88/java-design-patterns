package tech.marcusvieira.structural.decorator;

public class ExtraFood extends FlightTicketDecorator {

    private FlightTicket flightTicket;

    public ExtraFood(FlightTicket flightTicket) {
        this.flightTicket = flightTicket;
    }

    @Override
    public String getDescription() {
        return flightTicket.getDescription()+", Extra Food - price " + this.getPrice();
    }

    @Override
    public double getPrice() {
        return flightTicket.getPrice()+14;
    }
}

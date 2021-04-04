package tech.marcusvieira.structural.decorator;

public class ExtraFood extends FlightTicketDecorator {

    public ExtraFood(FlightTicket flightTicket) {
        super(flightTicket);
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

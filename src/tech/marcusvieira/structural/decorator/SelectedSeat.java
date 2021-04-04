package tech.marcusvieira.structural.decorator;

public class SelectedSeat extends FlightTicketDecorator {

    public SelectedSeat(FlightTicket flightTicket) {
        super(flightTicket);
    }

    @Override
    public String getDescription() {
        return flightTicket.getDescription()+", Selected Seat - price " + this.getPrice();
    }

    @Override
    public double getPrice() {
        return flightTicket.getPrice()+5;
    }
}

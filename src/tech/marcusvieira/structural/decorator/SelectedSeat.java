package tech.marcusvieira.structural.decorator;

public class SelectedSeat extends FlightTicketDecorator {

    private FlightTicket flightTicket;

    public SelectedSeat(FlightTicket flightTicket) {
        this.flightTicket = flightTicket;
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

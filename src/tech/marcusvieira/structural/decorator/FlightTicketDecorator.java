package tech.marcusvieira.structural.decorator;

public abstract class FlightTicketDecorator implements FlightTicket {

    protected FlightTicket flightTicket;

    public FlightTicketDecorator(FlightTicket flightTicket) {
        this.flightTicket = flightTicket;
    }
}

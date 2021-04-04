package tech.marcusvieira.structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        FlightTicket easyJetFlightTicket = new EasyJetFlightTicket();
        easyJetFlightTicket = new SelectedSeat(easyJetFlightTicket);
        easyJetFlightTicket = new ExtraLuggage(easyJetFlightTicket);

        System.out.println("EasyJetFlightTicket description:"+easyJetFlightTicket.getDescription());
        System.out.println("EasyJetFlightTicket price:"+easyJetFlightTicket.getPrice());

        FlightTicket ryanairFlightTicket = new RyanairFlightTicket();

        ryanairFlightTicket = new ExtraLuggage(ryanairFlightTicket);
        ryanairFlightTicket = new ExtraFood(ryanairFlightTicket);
        ryanairFlightTicket = new SelectedSeat(ryanairFlightTicket);

        System.out.println("RyanairFlightTicket description:"+ryanairFlightTicket.getDescription());
        System.out.println("RyanairFlightTicket price:"+ryanairFlightTicket.getPrice());
    }
}

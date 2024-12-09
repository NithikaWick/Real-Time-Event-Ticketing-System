import java.math.BigDecimal;

public class Ticket {
    private static int idCounter = 0; // Static counter for unique IDs
    private int ticketID;
    private String eventName;//The name of the event
//    private String eventDate;
    private BigDecimal ticketPrice;//The price of the ticket



    public Ticket(int ticketID, String eventName, BigDecimal ticketPrice) {
        this.ticketID = generateUniqueID();
        this.eventName = eventName;
        this.ticketPrice = ticketPrice;


    }
    private synchronized int generateUniqueID() {
        return idCounter++;
    }

    public int getTicketID() {
        return ticketID;
    }

    public String getEventName() {
        return eventName;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketID=" + ticketID +
                ", eventName='" + eventName + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}

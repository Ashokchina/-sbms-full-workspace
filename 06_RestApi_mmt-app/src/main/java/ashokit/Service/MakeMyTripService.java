package ashokit.Service;

import java.util.List;

import ashokit.binding.PassengerInfo;
import ashokit.binding.TicketInfo;

public interface MakeMyTripService {
public TicketInfo bookTickets(PassengerInfo p);
List<TicketInfo>getAllTickets();
}

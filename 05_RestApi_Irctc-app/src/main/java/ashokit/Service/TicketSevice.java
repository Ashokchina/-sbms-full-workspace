package ashokit.Service;

import java.util.Collection;
import java.util.List;

import ashokit.binding.PassengerInfo;
import ashokit.binding.TicketInfo;

public interface TicketSevice {
	public TicketInfo bookTicket(PassengerInfo p);
	 Collection<TicketInfo> getAllTickets();

}

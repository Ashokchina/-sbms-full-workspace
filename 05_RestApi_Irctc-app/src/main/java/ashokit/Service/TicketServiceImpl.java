package ashokit.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ashokit.binding.PassengerInfo;
import ashokit.binding.TicketInfo;

@Service
public class TicketServiceImpl implements TicketSevice {
	HashMap<Integer, TicketInfo> db = new HashMap<>();

	@Override
	public TicketInfo bookTicket(PassengerInfo p) {
		TicketInfo t = new TicketInfo();
		Random r = new Random(100);
	long id = r.nextLong();
		t.setTicketNum(id);
		BeanUtils.copyProperties(p, t);
		t.setStatus("Confirmed");
		db.put((int) id, t);
		return t;
	}

	@Override
	public Collection<TicketInfo> getAllTickets() {

		return db.values();
	}

}

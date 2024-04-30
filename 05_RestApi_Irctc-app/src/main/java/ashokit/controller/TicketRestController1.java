package ashokit.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ashokit.Service.TicketSevice;
import ashokit.binding.PassengerInfo;
import ashokit.binding.TicketInfo;

@RestController
public class TicketRestController1 {

    @Autowired
    private TicketSevice service; 

    @PostMapping("/ticket")
    public ResponseEntity<TicketInfo> bookAllTickets(@RequestBody PassengerInfo p) {
        TicketInfo ticket = service.bookTicket(p);
        return new ResponseEntity<>(ticket, HttpStatus.CREATED);
    }

    @GetMapping("/tickets")
    public ResponseEntity<Collection<TicketInfo>> getAllBooks() {
        Collection<TicketInfo> allTickets = service.getAllTickets();
        return new ResponseEntity<>(allTickets, HttpStatus.OK);
    }
}

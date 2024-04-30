package ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ashokit.entity.Order;
import ashokit.service.OrderService;

@RestController
public class ProducerController {
	@Autowired
private OrderService service;
	
	@PostMapping("/order")
	public String createOrder(@RequestBody Order order) {
	    String msg = service.addMsg(order);
	    return msg;
	}

}

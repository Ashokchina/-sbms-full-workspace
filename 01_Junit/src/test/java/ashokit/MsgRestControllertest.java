package ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import ashokit.Controller.MsgRestController;
import ashokit.service.MsgService;

@WebMvcTest(controllers = MsgRestController.class)
public class MsgRestControllertest {
	@MockBean
private MsgService service;
	@Autowired
	private MockMvc mockMvc;
	@Test
	public void welcomeTest() throws Exception {
		when(service.welcome()).thenReturn("Good Evening");
	MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
	MvcResult result = mockMvc.perform(requestBuilder).andReturn();
	MockHttpServletResponse response = result.getResponse();
	String contentAsString = response.getContentAsString();
	System.out.println(contentAsString);
	int status = response.getStatus();
	assertEquals(200, status);
	
	}
}

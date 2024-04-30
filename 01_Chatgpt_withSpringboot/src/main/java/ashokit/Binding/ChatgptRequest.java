package ashokit.Binding;

import java.util.List;

public class ChatgptRequest {

	private String model;
	private List<Message>messages;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	@Override
	public String toString() {
		return "ChatgptRequest [model=" + model + ", messages=" + messages + "]";
	}
	
}

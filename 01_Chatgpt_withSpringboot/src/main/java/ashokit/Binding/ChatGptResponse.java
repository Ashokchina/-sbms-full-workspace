package ashokit.Binding;

import java.util.List;

public class ChatGptResponse {
private List<Choice>choices;
public static class Choice{
	private Integer index;
	private String message;
	
	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Choice [index=" + index + ", message=" + message + "]";
	}
	
}
}

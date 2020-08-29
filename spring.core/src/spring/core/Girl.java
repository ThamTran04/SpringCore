package spring.core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // Replace for Default Constructor (constructor no parameter)
@Setter
@Getter
public class Girl {
	private Conversation setting;

	public Girl(Conversation conversation1) {
		this.setting = conversation1;
	}

	public void setConversation2(Conversation conversation3) {
		this.setting = conversation3;
	}

}
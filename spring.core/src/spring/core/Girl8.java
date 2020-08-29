package spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // Replace for Default Constructor (constructor no parameter)
@Setter
@Getter
@Component
public class Girl8 {

	@Autowired
	private Conversation setting;

	public Girl8(Conversation conversation1) {
		this.setting = conversation1;
	}

	public void setConversation2(Conversation conversation3) {
		this.setting = conversation3;
	}

}
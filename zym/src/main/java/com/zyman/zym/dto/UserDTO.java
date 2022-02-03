package com.zyman.zym.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	private String ID;
	private String Name;
	private String Password;
	
	public UserDTO(String ID, String Name, String Password) {
		this.ID = ID;
		this.Name = Name;
		this.Password = Password;
	}
}

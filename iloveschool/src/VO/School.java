package VO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class School {
	int id;
	String diff;
	String schoolName;
	String address;
	int postCode;
	String tel;
	String fax;
	String educationOffice;
	String publicPrivate;
	String homepage;

}

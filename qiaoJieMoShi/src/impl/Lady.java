package impl;

import abs.Clothing;
import abs.Person;

public class Lady extends Person{

	public Lady() {
		setType("Ů��");
	}
	
	@Override
	public void dress() {
		Clothing c = getClothing();
		c.personDressCloth(this);
		
	}

}

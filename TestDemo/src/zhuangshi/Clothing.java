package zhuangshi;

public abstract class Clothing implements Person{
	private Person person;
	
	public void setPerson(Person person){
		this.person = person;
	}
	
	public Person getPerson(){
		return person;
	}
	@Override
	public void show(){
		if(person != null){
			person.show();
		}
	}
}

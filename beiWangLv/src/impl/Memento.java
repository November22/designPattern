package impl;

/**
 * 备忘录
 * 负责存储发起人的内部状态，在需要的时候提供发起人需要的内部状态
 * @author sen.huang
 *
 */
public class Memento {
	private String state = "";
	
	public Memento(String state){
		this.state = state;
	}
	
	public String getState(){
		return this.state;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	
}

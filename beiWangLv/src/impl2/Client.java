package impl2;

public class Client {
	public static void main(String[] args) {
		Originator o = new Originator();
		Caretaker c = new Caretaker();
		o.setState1("�й�");
		o.setState2("����");
		o.setState3("�¹�");
		System.out.println("��ʼ̬��"+o.toString());
		
		c.setMemento("001", o.createMemento());
		
		o.setState1("��");
		o.setState2("��");
		o.setState3("0");
		System.out.println("̬2��"+o.toString());
		
		o.restoreMemento(c.getMemento("001"));
		System.out.println("�ָ���"+o.toString());
	}
}
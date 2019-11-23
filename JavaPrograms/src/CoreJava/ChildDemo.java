package CoreJava;

public class ChildDemo extends ParentDemo {

	String name ="Riju";
	public ChildDemo() {
		System.out.println("Child class constructor:");
	}
	
	public void getString() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getdata();
		System.out.println("This is child class");
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChildDemo cd =new ChildDemo();
			cd.getString();
			cd.getData();
			 
	}

}

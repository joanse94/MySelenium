package CoreJava;

public class thisDemo {

public	int a = 7;

	public void getData() {
		int a = 5;
		int b = this.a + a;		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		// this refers to current object ,object scope lies within class level

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo obj = new thisDemo();
		obj.getData();
	}

}

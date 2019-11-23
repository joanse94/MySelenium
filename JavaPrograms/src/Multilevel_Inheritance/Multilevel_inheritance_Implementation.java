package Multilevel_Inheritance;

public class Multilevel_inheritance_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassParent parent = new ClassParent();
		ClassChild child = new ClassChild();
		ClassGrandchild gchild = new ClassGrandchild();
		parent.parent();
		child.child();
		child.parent();
		gchild.grandChild();
		gchild.child();
		gchild.parent();
	}

}

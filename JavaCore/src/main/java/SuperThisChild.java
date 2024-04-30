
public class SuperThisChild extends SuperThisParent {

	public static void main(String[] args) {
		new SuperThisChild();
		new SuperThisChild(1);
		new SuperThisChild("parent");
	}

	String parent = "name1";

	SuperThisChild() {
		System.out.println("Constructor SuperThisChild() runs.");
	}

	SuperThisChild(int number) {
		this(); // this constructor
		System.out.println("Constructor SuperThisChild(int " + number + ") runs.");
	}

	SuperThisChild(String parent) {
		super("name2"); // super constructor
		System.out.println("Constructor SuperThisChild(String " + parent + ") runs.");
		System.out.println("parent (old value)=" + this.parent); // this variable
		this.parent = super.title; // super variable
		System.out.println("parent (new value)=" + this.parent);
	}
}

class SuperThisParent {
	String title = "title";

	SuperThisParent(String name) {
		System.out.println("Constructor SuperThisParent( String " + name + ") runs.");
		this.title = name; // this variable
	}

	SuperThisParent() {
	}
}
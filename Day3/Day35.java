class Grandparent {
	class Parent {
		Parent(int val) {
			System.out.println("parent class");
		}
	}
}

class Parent2 {
        class Child extends Grandparent.Parent {
                Child(Grandparent val) {
					System.out.println("child class");
				}
        }
}

public class Day35 {
	public static void main(String[] args) {
		Parent2 obj= new Parent2();
		Parent2.Child obj2 = obj.new Child(new Grandparent());
	}
}
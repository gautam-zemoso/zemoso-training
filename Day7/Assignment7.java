
import java.io.*;
import java.util.*;
class SNode<T> {
	T val;
	SNode<T> next;
	SNode() { val = null; next = null;}
	SNode(T val, SNode<T> next) {
		this.val = val;
		this.next = next;
	}
	public String toString(){return "" + val;}
}
class slitrstIterator<U> {
	SNode<U> ptr;
	slitrstIterator(SNode<U> head) {
		ptr = head;
	}
	boolean hasNext(){
		return ptr.next != null;
	}
	SNode<U> next(){
		ptr = ptr.next;
		return ptr;
	}
	void insert(U val){
		ptr.next = new SNode<U>(val, ptr.next);
		ptr = ptr.next;
	}
	void remove(){
		if(ptr.next != null){
			ptr.next = ptr.next.next;
		}
	}
}
class slitrst<T> {
	private SNode<T> top = new SNode<T>();
	slitrstIterator<T> iterator() {
		return new slitrstIterator<T>(top);
	}
	public String toString() {
		String s = "";
		SNode<T> tmp = top;
		if(tmp.next != null){
			s = s + tmp.next.val;
			while(tmp.next.next != null){
				s = s + " " + tmp.next.next.val;
				tmp = tmp.next;
			}
		}
		return s;
	}
}

public class Assignment7 {
	public static void main(String... args) {
		slitrst<Integer> sl = new slitrst<Integer>();
		slitrstIterator<Integer> slitr = sl.iterator();
		// Scanner sc = new Scanner(System.in);
		// while(true){
		// 	System.out.println("select '1' for insert , '2' for remove");
		// 	int ch = sc.nextInt();
		// 	switch(ch){
		// 		case  1 :
		// 			int p = sc.nextInt();
		// 		 	slitr.insert(p);
		// 		 	System.out.println(sl);
		// 		 case 2 :
		// 		  slitrstIterator<Integer> slitr1 = sl.iterator();
		// 		 slitr1.remove();
		// 		 System.out.println(sl);
				 

		// 	}
		// }

		slitr.insert(1);
		System.out.println(sl);
		slitr.insert(2);
		System.out.println(sl);
		slitr.insert(3);
		System.out.println(sl);
		slitr.insert(4);
		System.out.println(sl);
		slitrstIterator<Integer> slitr1 = sl.iterator();
		slitr1.remove();
		System.out.println(sl);
		slitr1.remove();
		System.out.println(sl);
		slitr1.remove();
		System.out.println(sl);
		slitr1.remove();
		System.out.println(sl);
	}
}
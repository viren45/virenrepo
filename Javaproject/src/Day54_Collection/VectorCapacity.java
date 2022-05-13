package Day54_Collection;

import java.util.Vector;

public class VectorCapacity {
	public static void main(String[] args) {
		Vector<String> vcTr = new Vector<String>(5);
		System.out.println("Default,Vector Capacity: " + vcTr.capacity());//10
		System.out.println("Vector Size: " + vcTr.size());//0
		vcTr.setSize(2);
		System.out.println("Vector Size: " + vcTr.size());//2
		vcTr.addElement("Sunday");
		vcTr.addElement("Monday");
		System.out.println("after add, Vector Size: " + vcTr.size());//2
		vcTr.addElement("Wednesday");
		System.out.println("After addElement, Vector Size: " + vcTr.size());//5
		System.out.println("Vector Capacity: " + vcTr.capacity());//10
	}
}

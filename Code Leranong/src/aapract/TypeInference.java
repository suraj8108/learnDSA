package aapract;

class GenericClass<X> {
	X name;
	public GenericClass(X name) {
		this.name = name;
	}
	
	public X getName() {
		return name;
	}
	
}
public class TypeInference {

	public static void main(String[] args) {
		GenericClass<Integer> g1 = new GenericClass(1);
		System.out.println(g1.getName());
		
		GenericClass<String> g2 = new GenericClass("Suraj");
		System.out.println(g2.getName());
	}
}

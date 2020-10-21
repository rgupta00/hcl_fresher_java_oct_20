class A{
	private int id;
	private String name;
	
	///calling one ctr from another ctr

	A(){
		this(10,"foo");
	}
	
	A(int id, String name){
		this.id=id;
		this.name=name;
	}
}
public class ConstructorChaining {
	
	public static void main(String[] args) {
		
	}

}

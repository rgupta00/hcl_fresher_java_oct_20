class Foof{
	static  int  id=55;

	//as main is static : hence it can not access instance variable
	
	public static void main(String args[]){
		id++;
		System.out.println(id);
	}

}
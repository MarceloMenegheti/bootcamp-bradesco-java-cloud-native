
public record Person(String name, int age) {
	
	public Person{
		
	}
	
	public Person(String name, int age){
		this(name, 1);
	}
	
	public String getInfo() {
		return "name: "+ name + " age: "+ age;
	}
	

}

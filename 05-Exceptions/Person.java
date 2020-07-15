
public class Person {

	private String name;
	
	public Person(String name) throws TooManyDavesException {
		if (name.equals("Dave")) {
			throw new TooManyDavesException("Too many Daves!!!!");
		} else {
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}
	
}

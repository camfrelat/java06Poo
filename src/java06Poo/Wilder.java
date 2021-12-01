package java06Poo;

public class Wilder {
	
	// attributes
	private String firstname;
	private boolean aware;
	
	// constructor
	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	
	public String whoAmI() {
		if (getFirstname().equals("Jean Claude")  && isAware()) {
			return "Je m'appelle " + getFirstname() + " et je suis aware";
		} else {
			return "Je m'appelle " + getFirstname() + " et je ne suis pas aware";
		}
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}

}

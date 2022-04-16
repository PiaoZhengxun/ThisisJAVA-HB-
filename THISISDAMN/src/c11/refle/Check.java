package c11.refle;

public class Check {
	
	private String model;
	public String owner;
	
	public Check() {
	}
	
	public Check(String model) {
		this.model = model;
	}
	
	public Check(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	private void setOwner(String owner) {
		this.owner = owner;
	}


}

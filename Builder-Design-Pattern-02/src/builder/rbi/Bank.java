package builder.rbi;

public class Bank {

	private Integer id;

	private String type;
	
	
	

	public Bank( String type) {
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void RBIBank(Integer id, String type) {

		this.id = id;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", type=" + type + "]";
	}

	
	
}

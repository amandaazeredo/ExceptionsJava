package exe1;

public class Contact {
	
	private static int counter = 0;
	private int id;
	private String name;
	private String cellphone;
	private String email;
	
	public Contact() {
		counter++;
		id = counter;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String s = "[" + "Id: " + id + ", Name: "+ name + ", Cellphone: "+cellphone + ", Email: " + email + "]";
		return s;
		
	}
	
}

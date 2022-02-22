package curs12;

public interface Angajat {
	
	String getName();
	void setName();
	
	String getEmail();
	
	default String departament() {
		return "ceva";
	};

}

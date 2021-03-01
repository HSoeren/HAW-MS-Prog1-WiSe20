package aufgaben;

public class Studierender {
	String name;
	int matrikelnummer;
	
	// Getter für den Namen
	public String getName() {
		return name;
	}
	
	// 
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getMatrikel() {
		return matrikelnummer;
	}
	
	public void setMatrikel(int newNummer) {
		this.matrikelnummer = newNummer;
	}
	
	public String toString() {
		String meinString = getMatrikel() + " " + getName();
		return meinString;
	}
}

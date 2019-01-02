package diabloapi;

public class Item {	
	
	private String name,effect, type, classe;
	private int socket;
	
	public Item(String name, String effect, String type, String classe, int socket) {
		this.name = name;
		this.effect = effect;
		this.type = type;
		this.classe = classe;
		this.socket = socket;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getSocket() {
		return socket;
	}

	public void setSocket(int socket) {
		this.socket = socket;
	}


}
package diabloapi;

// TODO: Auto-generated Javadoc
/**
 * The Class Item.
 */
public class Item {	
	
	/** The socket. */
	private int id, socket;
	
	/** The classe. */
	private String name,effect, type, classe;
	
	/**
	 * Instantiates a new item.
	 *
	 * @param name the name
	 * @param effect the effect
	 * @param type the type
	 * @param classe the classe
	 * @param socket the socket
	 */
	public Item(String name, String effect, String type, String classe, int socket) {
		this.name = name;
		this.effect = effect;
		this.type = type;
		this.classe = classe;
		this.socket = socket;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the effect.
	 *
	 * @return the effect
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * Sets the effect.
	 *
	 * @param effect the new effect
	 */
	public void setEffect(String effect) {
		this.effect = effect;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the classe.
	 *
	 * @return the classe
	 */
	public String getClasse() {
		return classe;
	}

	/**
	 * Sets the classe.
	 *
	 * @param classe the new classe
	 */
	public void setClasse(String classe) {
		this.classe = classe;
	}

	/**
	 * Gets the socket.
	 *
	 * @return the socket
	 */
	public int getSocket() {
		return socket;
	}

	/**
	 * Sets the socket.
	 *
	 * @param socket the new socket
	 */
	public void setSocket(int socket) {
		this.socket = socket;
	}


}
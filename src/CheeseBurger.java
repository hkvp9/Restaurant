
public class CheeseBurger extends HamBurger{
	
	private String cheeseType;

	public CheeseBurger(String breadType, String patty, boolean ranch, String cheeseType) {
		super(breadType, patty, ranch);
		
			this.cheeseType = cheeseType;
			
			
			
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "CheeseBurger [cheeseType=" + cheeseType + ", breadType="
				+ breadType + ", patty=" + patty + ", ranch=" + ranch + "]";
	}

	
	
	
}


public class HealthyBurger extends HamBurger {
	
	private String lettuce;

	public HealthyBurger(String breadType, String patty, boolean ranch, String lettuce) {
		super(breadType, patty, ranch);
		this.lettuce = lettuce ;
		
		
		
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "HealthyBurger [lettuce=" + lettuce + ", breadType=" + breadType
				+ ", patty=" + patty + ", ranch=" + ranch + "]";
	}
	
}
	
	



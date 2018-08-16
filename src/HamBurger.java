
public class HamBurger {
	
	protected String breadType;
	protected String patty;
	private boolean mayo; // Customer wants mayo?
	boolean ranch; // customer wants ranch?
	
	
	public HamBurger(String breadType, String patty, boolean mayo, boolean ranch) {
		this.breadType = breadType;
		this.patty = patty;
		this.mayo = mayo;
		this.ranch = ranch;
	}


	public HamBurger(String breadType, String patty, boolean ranch) {
		this.breadType = breadType;
		this.patty = patty;
		this.ranch = ranch;
	}
	
	
	
	

}

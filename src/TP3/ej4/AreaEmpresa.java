package TP3.ej4;

public class AreaEmpresa {
	
	private String id ;
	private int delay ;
	
	public AreaEmpresa(String id, int delay) {
		super();
		this.id = id;
		this.delay = delay;
	}
	
	public AreaEmpresa() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	@Override
	public String toString() {
		return "(" + id + "-" + delay +")\n";
	}
	
}

package Geometri;

public abstract class ObjekGeometris {
    private String warna = "Putih";
	private boolean filled;

	protected ObjekGeometris() {
	}

	protected ObjekGeometris(String warna, boolean filled) {
		this.warna = warna;
		this.filled = filled;
	}

	public String getColor() {
		return warna;
	}

	public void setColor(String warna) {
		this.warna = warna;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "\nWarna: " + warna +
			"\nfilled: " + filled;
	}
        
	public abstract double getArea();

	public abstract double getPerimeter();
}
package daythree.assigment;

public abstract class Quadrilateral {
	public int base;
	public int height;
	
	
	public Quadrilateral(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public abstract int getArea();
}

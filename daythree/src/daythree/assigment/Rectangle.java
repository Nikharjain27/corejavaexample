package daythree.assigment;

public class Rectangle extends Quadrilateral {
	public Rectangle(int base, int height) {
		super(base, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return getBase() * getHeight();
	}
}

package FacadePattern;

public class ShapeMaker {
	private Circle c;
	private Rectangle r;
	private Square s;

	public ShapeMaker() {
		c = new Circle();
		r = new Rectangle();
		s = new Square();
	}

	public void drawCircle() {
		c.draw();
	}

	public void drawRectangle() {
		r.draw();
	}

	public void drawSquare() {
		s.draw();
	}
}
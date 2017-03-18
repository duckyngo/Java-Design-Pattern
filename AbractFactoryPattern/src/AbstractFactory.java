
import shape.Shape;
import color.Color;


public abstract class AbstractFactory {
	abstract Color getColor(String color);
	
	abstract Shape getShape(String shape);
}

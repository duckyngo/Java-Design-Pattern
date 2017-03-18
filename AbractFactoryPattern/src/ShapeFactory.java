
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;
import color.Color;


public class ShapeFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape == null){
			return null;
		}
		
		if(shape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		
		if(shape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		
		if(shape.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		
		
		
		return null;
	}

}

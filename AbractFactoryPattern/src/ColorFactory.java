import shape.Shape;
import color.Blue;
import color.Color;
import color.Green;
import color.Red;


public class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		
		if(color == null){
			return null;
		}
		
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		}
		
		if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		
		if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}

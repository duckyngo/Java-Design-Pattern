
public class FactoryPatternExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("CIRCLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
	}

}

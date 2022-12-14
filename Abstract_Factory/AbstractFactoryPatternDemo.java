package Abstract_Factory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");
		
		Shape shape=shapeFactory.getShape("CIRCLE");
		shape.draw();
		
		Shape shape1=shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		
		
		Shape shape2=shapeFactory.getShape("SQUARE");
		shape2.draw();

		AbstractFactory colorFactory=FactoryProducer.getFactory("COLOR");
		
		Color color1=colorFactory.getColor("RED");
		color1.fill();
		
		Color color2=colorFactory.getColor("BLUE");
		color2.fill();
		
		Color color3=colorFactory.getColor("GREEN");
		color3.fill();
		
	}

}

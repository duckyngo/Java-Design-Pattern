
public class SingletonPatternExam {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
//		SingleObject object2 = new SingleObject();
		
		object.showMessage();
	}
}

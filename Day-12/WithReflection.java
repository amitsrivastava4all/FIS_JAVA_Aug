import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
class ScCalc
{
	ScCalc(){
		System.out.println("SC Calc");
	}
	double power(int x, int y){
		return Math.pow(x, y);
	}
}
public class WithReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class  Name");
		String className = scanner.next();
		Object object = Class.forName(className).newInstance();
		System.out.println("Type add for Addition");
		System.out.println("Type subtract for Subtraction");
		System.out.println("Type multiply for Multiplication");
		System.out.println("Type divide for Division");
		System.out.println("Type pow for Power");
		//System.out.println("Enter the Method Name");
		String methodName = scanner.next().toLowerCase().trim();
		Method method = object.getClass().getDeclaredMethod(methodName, int.class,int.class);
		Object result = method.invoke(object, 3,2);
		System.out.println(result);
		scanner.close();

	}

}


public class Test {
	public static void main(String[] args) {
		Car a=new Car("232",new Point(3,3));
		a.move("w,d,d,w");
		a.order("show");
		a.order("back");
		a.order("back");
		a.order("back");
		a.order("back");
	}
}

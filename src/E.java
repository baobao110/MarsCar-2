import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class E extends Point{
	private static final E1 a=new E1();
	private static final E2 b=new E2();
	private static final E3 c=new E3();
	private static final E4 d=new E4();
	private  static Map<String, E>e=new HashMap<String,E>();
	String name;
	static Point point;
	protected static int x=0;
	protected static int y=0;
	
	static{
		e.put("w",a);
		e.put("a", b);
		e.put("s",c);
		e.put("d",d);
	}
	
	public E(String name, Point point) {
		this.name = name;
		this.point = point;
		x=point.getX();
		y=point.getY();
		Car.f.add(x+","+y);
	}
	
	public E(String name) {
		this.name = name;
		x=new Random().nextInt();
		y=new Random().nextInt();
		point =new Point(x,y);
		Car.f.add(x+","+y);
	}
	
	public E() {
		point=new Point();
	}
	
	public void move(Point point){
		
	}
	
	public static void Move(String x){
		String[] y=x.split(",");
		for(String i:y)
			move(i);
	}
	
	public static void move(String x){
		e.get(x).move(point);
		String address=point.getX()+","+point.getY();
		Car.f.add(address);
	}
	
	public static void show(){
		for(String i:Car.f)
			System.out.println(i);
	}
	
	public static void back(){
		System.out.println(Car.f.get(Car.f.size()-2-Car.i));
	}
	
}

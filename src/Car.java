import java.util.ArrayList;
import java.util.List;


public class Car {
	private Point point;
	protected  static int i=0;
	protected  static List<String> f=new ArrayList<String>();
	
	public Car(String name){
		E a=new E(name);
	}
	
	public Car(){
		E a=new E();
	}
	
	public Car(String name,Point point){
		this.point=point;
		E a=new E(name,point);
	}
	
	public void move(String a){
		E.Move(a);
	}
	
	private void show(){
		System.out.println("运动轨迹:");
		E.show();
	}
	
	private void back(){
		if(i==f.size()-2)
		{	
			System.out.println("到达起始位置");
			E.back();
			return;
		}
		else
		{
			System.out.println("前面一步为");
			E.back();
			i++;
		}
	}
	
	public void order(String x){
		if("show".equals(x))
		{
			show();
		}
		else{
			back();
		}
	}
	
}

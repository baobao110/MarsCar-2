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
		System.out.println("�˶��켣:");
		E.show();
	}
	
	private void back(){
		if(i==f.size()-2)
		{	
			System.out.println("������ʼλ��");
			E.back();
			return;
		}
		else
		{
			System.out.println("ǰ��һ��Ϊ");
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

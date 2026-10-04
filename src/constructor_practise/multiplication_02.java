package constructor_practise;

class rectangel01{
	public int length,width;
	rectangel01(){
		System.out.println("This is constuctor for rectangel...");
	}
	rectangel01(int l, int w){
		this.length=l;
		this.width=w;
		System.out.println("this is parametirized constuctor for rectangel....");
	}
	public int area() {
		return this.length * this.width;
	}
}
class cuboid extends rectangel01{
	public int height;
	cuboid(){
		System.out.println("this is normal constructor for cuboid...");
	}
	cuboid(int l,int w,int h){
		super(l,w);
		this.height=h;
		System.out.println("this is parametirized constucter for cuboid...");
	}
	public int area1() {
		return 2*(this.length * this.width + this.width * this.height + this.length * this.height);
	}
}
public class multiplication_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cuboid c=new cuboid(10,20,30);
		System.out.println(c.area());
		System.out.println(c.area1());
	
	}

}

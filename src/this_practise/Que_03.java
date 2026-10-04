package this_practise;

class rectangel{
	int length;
	int width;
	
	rectangel(int l,int w){
		this.length=l;
		this.width=w;
	}
	rectangel setDimenstions(int len,int wid) {
		this.length=len;
		this.width=wid;
		return this;
	}
	public int area() {
		return this.length * this.width;
	}
	void display() {
		System.out.println("length is "+length+" width is "+width);
		System.out.println("area is "+area());
	}
}

public class Que_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangel rec=new rectangel(5,10);
		rec.setDimenstions(10,20);
		
		rec.display();
	}

}

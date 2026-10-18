package interface_practise;

interface Printable{
	void printDocument();
}
interface Scannable{
	void scanDocument();
}
class AllInOnePrinter implements Printable,Scannable{
	public void printDocument() {
		System.out.println("Document is printing..");
	}
	public void scanDocument() {
		System.out.println("Documene is scanning...");
	}
}
public class SmartDeviceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AllInOnePrinter p = new AllInOnePrinter();
		p.printDocument();
		p.scanDocument();
		
	}

}

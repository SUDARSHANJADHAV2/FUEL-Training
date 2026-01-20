package Interface;

public class Book implements Writeable,Readable{
	public void read(){
		System.out.println("Readable!!!!!");
	}
	public void write() {
		System.out.println("Writeable");
	}
	public static void main(String args[]) {
		Book B1= new Book();
		B1.read();
		B1.write();
	}
	

}

package Computer;

public class Desktop extends Computer{
	public void computerSize() {
		System.out.println("Your computer size is 900 GB");
	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.computerSize();
	}
}

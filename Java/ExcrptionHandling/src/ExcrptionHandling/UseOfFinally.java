package ExcrptionHandling;

public class UseOfFinally {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4};
		try {
			System.out.println(arr[4]);
		}
		catch(Exception e){
			System.out.println("Exception was handled successfully which was about : "+e);
		}
		finally {
			System.out.println("Finally is excepted");
		}
	}

}

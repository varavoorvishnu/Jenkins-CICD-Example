import java.util.Arrays;

public class Client {
	
	public void test(){
		String[] arr = {"program", "creek", "is", "a", "java", "site"};
		Arrays.sort(arr, (String m, String n) -> Integer.compare(m.length(), n.length()));
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[]){
		TestHashCode th1= new TestHashCode();
		TestHashCode th2= new TestHashCode();
		TestHashCode th3= new TestHashCode();
		th1.setTitle("Hello1");
		th2.setTitle("Hello2");
		th3.setTitle("Hello2");
		
		System.out.println(th1.hashCode());
		System.out.println(th2.hashCode());
		System.out.println(th3.hashCode());
				
	}
}

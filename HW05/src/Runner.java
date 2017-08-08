
public class Runner {
	public static void main(String[] args) {
		MyArrayList<String> myArrayList = new MyArrayList<>();
		myArrayList.add("One");
		myArrayList.add("Two");
		myArrayList.add("Three");
		
		System.out.println("Original data:");
		for(String i : myArrayList) {
			System.out.println(i);
		}
		
			myArrayList.remove(0);
			myArrayList.clear();
	
		System.out.println("Data after action:");
		for(String i : myArrayList) {
			System.out.println(i);
		}
	}
}

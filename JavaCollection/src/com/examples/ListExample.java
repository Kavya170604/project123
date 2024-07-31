package com.examples;
interface MySam{
	void show();
}
//class A implements MySam{
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("Hello");
//	}
//	
//}
public class ListExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MySam m=new A();
//		m.show();
		
//		MySam m=new MySam() {
//
//			@Override
//			public void show() {
//				// TODO Auto-generated method stub
//				System.out.println("Hello guys");
//			}
//			
//		};
		
		MySam m=()->System.out.println("Hello hiii");
m.show();
	}

}

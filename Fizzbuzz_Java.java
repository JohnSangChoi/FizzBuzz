package FizzBuzz;

public class Fizzbuzz_Java {
	public static void main(String [] args){
		FizzBuzz();
	}
	public static void FizzBuzz(){
		for(int i = 1; i <= 100; i++ ){
		if(i % 3 ==0 && i%15 !=0){
			System.out.println("Fizz");
		} else if(i % 5 ==0 && i%15!=0) {
			System.out.println("Buzz");
		} else if(i%15 ==0) {
			System.out.println("FizzBuzz");
		} else {
			System.out.println(i);
			}
		}
	}
}

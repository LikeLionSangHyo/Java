	class MyClass<T>{
	T val;
	void set(T a){
		val = a;
	}
	T get() {
		return val;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		MyClass<String> s = new MyClass<String>();
		s.set("Hello");
		System.out.print(s.get());

	}

}

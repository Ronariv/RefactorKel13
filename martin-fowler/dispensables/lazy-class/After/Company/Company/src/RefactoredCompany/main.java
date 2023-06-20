package RefactoredCompany;

public class main {
	class worker{
		String name;
		int salary;
		
		public worker(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
	}

	public main(){
		worker jack = new worker("jack anderson",10000);
		worker keila = new worker("keila bla",11000);
		
		print(jack);
		print(keila);
	}

	void print(worker w){
		System.out.println(w.name + "'s salary is Rp." + w.salary);
	}
	public static void Main(String[] args) {
		new main();
	}
}

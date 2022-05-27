class req{
	void fig() {
		System.out.println("what are the requirements of figma???");
	}
}
class laptop extends req{
	void ram() {
		req obj2=new req();
		obj2.fig();
		System.out.println("it requires minimum of 16 GB ram");
	}
}
class orb extends laptop{
	void processor() {
		laptop obj=new laptop();
		obj.ram();
		System.out.println("it requires 64 bit or 32 bit processor ");
	}
}
class arthmentic{
	public static void main(String[] args) {
		orb plac=new orb();
		plac.processor();
	}
}
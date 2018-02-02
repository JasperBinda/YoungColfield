class Demo{
	public static void main(String[] args){
		House h1 = new House();
		h1.housenumber = 34;
		h1.name = "Street";

		street(h1.name);

		nextnumber(h1);
		//nextnumber(h1.housenumber);

		System.out.println("name " + h1.name);
		System.out.println("next number " + h1.housenumber);
	}
	static void street(String x){
		x = "new street";
	}
	
	static void nextnumber(House x){
	//static void nextnumber(int x){
		x.housenumber+=2;
	//	x+=2;
	}
}

class House{
	int housenumber;
	String name;
}

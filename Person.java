class Person {
	String name;
	int age;
	String sex;
	Address place;

	Person(String name, int age, String sex, Address place) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.place = place;
	}
}

class Address {
	String city;
	String state;

	Address(String city, String state) {
		// TODO Auto-generated constructor subs
		this.city = city;
		this.state = state;
	}
}



class ExamplesPerson{
	ExamplesPerson(){}
		Address timAdd = new Address("Warick","RI");
		Address patAdd = new Address("Boston","MA");
		Address kimAdd = new Address("Boston","MA");
		Address danAdd = new Address("Nashua","NH");
		Person timWA = new Person("Tim",20,"M",this.timAdd);
		Person patWA = new Person("Pat",19,"M",this.patAdd);
		Person kimWA = new Person("Tim",17,"M",this.kimAdd);
		Person danWA = new Person("Tim",22,"M",this.danAdd);
	
}


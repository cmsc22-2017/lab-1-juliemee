interface IAT {}

class Unknown implements IAT{
	Unknown(){}
}

class Person implements IAT{
	String name;
	IAT mom;
	IAT dad;
	
	Person(String name,IAT mom,IAT dad){
		this.name = name;
		this.mom = mom;
		this.dad = dad;
	}
}

class ExamplesAncestors{
	ExamplesAncestors(){}
	
	IAT unknown = new Unknown();
	IAT leda = new Person("Leda",this.unknown,this.unknown);
	IAT rhea = new Person("Rhea",this.unknown,this.unknown);
	IAT cronus = new Person("Cronus",this.unknown,this.unknown);
	
	IAT zeus = new Person("Zeus",this.rhea,this.cronus);
	IAT helen = new Person("Helen",this.leda,this.zeus);
	
}
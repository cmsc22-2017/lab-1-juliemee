interface IMenu{}

class Soup implements IMenu{
	Item item;
	boolean isVegetarian;
	
	Soup(Item item, boolean isVegetarian) {
		this.item = item;
		this.isVegetarian = isVegetarian;
	}

}
class Salad implements IMenu{
	Item item;
	boolean isVegetarian;
	String dressing;
	
	Salad(Item item, boolean isVegetarian, String dressing){
		this.item = item;
		this.isVegetarian = isVegetarian;
		this.dressing = dressing;
	}
}
class Sandwich implements IMenu {
	Item item;
	String bread;
	boolean isPandJ;
	boolean isHandC;
	Sandwich(Item item, String bread, boolean isPandJ, boolean isHandC){
		this.item = item;
		this.bread = bread;
		this.isPandJ = isPandJ;
		this.isHandC = isHandC;
	}
}

class Item{
	String name;
	int price;
	
	Item(String name, int price){
		this.name = name;
		this.price = price;
	}
}

class ExamplesIMenu{
	ExamplesIMenu(){}
		Item a = new Item ("a",5);
		Item b = new Item ("b",10);
		Item c = new Item ("c",15);
		Item d = new Item ("d",20);
		Item e = new Item ("e",25);
		Item f = new Item ("f",30);
		IMenu s1 = new Soup (this.a,true);
		IMenu s2 = new Soup (this.b,false);
		IMenu s3 = new Salad (this.c,true,"dressing");
		IMenu s4 = new Salad (this.d,false,"dressings");
		IMenu s5 = new Sandwich (this.e,"bread",true,false);
		IMenu s6 = new Sandwich (this.f,"breads",false,true);
	
}
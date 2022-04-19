package mypackage;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MyArimaticOperations{
	public static void main (String[] args) {

/*		Dog xx = new Dog()	;
		xx.bark();
		System.out.println(xx.breed);
		System.out.println(xx.breed);
		xx.setBreed();
		System.out.println(xx.age);
		xx.setAge();

		System.out.println(xx.age);
		
		System.out.println(xx.age);

		xx.setAge(10);
		System.out.println(xx.age);
		
		System.out.println(xx.age);
		xx.setAge(10,20);
		System.out.println(xx.age);
		
		Dog yy1 = new Dog() ;
		System.out.println(yy1.color);
		System.out.println(yy1.color);
		
		yy1.setColor();
		
		
		System.out.println(yy1.color);*/



		Cat mm = new Cat() ;
		System.out.println(mm.color);
		System.out.println(mm.color);System.out.println();
		mm.setAge(2);
		System.out.println("My cat's age is = "+mm.getAge());
		mm.setColor("white");

		System.out.println("My cat's color is = "+mm.getColor());
		Bycycle pp= new Bycycle();
		pp.setWheels(2);
		System.out.println("My bycycle has "+pp.getwheels()+" wheels");




		Flower ff = new Flower();
		ff.setColor("pink");
		System.out.println("The flower is "+ff.getColor()+"color");
		String rose = "rose";
		ff.setName(rose);
		System.out.println("Name of the flower is "+ff.getName()+"name");

		Tree tt =new Tree();
		tt.setName("mango");
		System.out.println("The tree is "+tt.getName());

		//how to declare array of 10 Cats
		Cat[] mm1 = new Cat[10] ;

		//assign object to the first cat
		mm1[0]= new Cat();
		//get the first cat and set its age to 10
		mm1[0].setAge(10);

		//assign object to the second cat
		mm1[1]= new Cat();
		//get the second cat and set its age to 20
		mm1[1].setAge(20);

		//print the age of the first cat
		System.out.println(mm1[1].getAge());
		TV tt1 = new TV();
		tt1.setBrand("TCL");
		System.out.println("Name of the brand is "
				+tt1.getBrand());

		Car cc = new Car();
		cc.setBrand("Mazda");
		System.out.println("I have a car "+cc.getBrand());

		Camera kk = new Camera();
		kk.setBrand("canon");
		System.out.println("I am good at the brand "+kk.getBrand());



	}




}


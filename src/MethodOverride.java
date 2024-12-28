
	class Animal {
	    public void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
		@Override
	    public void sound() {
	        System.out.println("Dog barks");
	    }
	}

	class Cat extends Dog {
		@Override
	    public void sound() {
	        System.out.println("Cat meows");
	    }
	}

	public class MethodOverride {
	    public static void main(String[] args) {

	        Animal a= new Animal();
	        Animal b= new Dog();  
	        Dog c = new Cat(); 
	        a.sound();  
	        b.sound(); 
	        c.sound();
	    }
	}



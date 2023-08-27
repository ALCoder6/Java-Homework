// class Birb extends Animal {
//   private String modelName = "Mustang";    // Car attribute
//   public static void main(String[] args) {

//     // Create a myCar object
//     Car myCar = new Car();

//     // Call the honk() method (from the Vehicle class) on the myCar object
//     myCar.honk();

//     // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
//     System.out.println(myCar.brand + " " + myCar.modelName);
//   }
// }



class Animal {
    void sound() {
        ; 
    }

    public static void main(String[] args)
    {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Animal birdSound = new Bird();
        birdSound.sound();
 
        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Animal catSound = new Cat();
        catSound.sound();
    }
}

class Bird extends Animal {
    // This method overrides show() of Parent
    @Override void sound() {
        System.out.println("birds chirp");
    }
}

class Cat extends Animal {
    // This method overrides show() of Parent
    @Override void sound() {
        System.out.println("cats meow");
    }
}
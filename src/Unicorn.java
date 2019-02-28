public class Unicorn extends Animal {


    public Unicorn(String name) {
        super(name, "marshmallows");
    }

    public void sleep() {
        // your overridden sleep code...
        System.out.println(name + " sleeps in a cloud");

    }
    public void eat(String food) {
        // complete your eat function here!

        if(food==favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! "+ name + " wants more " + food);
            sleep();
        }else{
            System.out.println("YUCK!!! "+name+" will not eat "+food);
        }

    }
}


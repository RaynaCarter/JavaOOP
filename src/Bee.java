public class Bee extends Animal {

    public Bee(String newname) {
        super("Stinger", "pollen");
        name=newname;
        favoriteFood="pollen";
    }

    public void sleep() {

        System.out.println( name + " never sleeps ");

    }
    public void eat(String food) {

        if(food==favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! "+ name + " wants more " + food);
            sleep();
        }else{
            System.out.println("YUCK!!! "+name+" will not eat "+food);
        }

        }
    }


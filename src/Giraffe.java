public class Giraffe extends Animal {

    public Giraffe(String newname) {

        super("Gemma", "leaves");
        name=newname;
        favoriteFood="leaves";
    }


    public void eat(String food) {

        if(food==favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! "+ name + " wants more " + food);
            sleep();
        }else{
            System.out.println("YUCK!!! "+ name + " will not eat " + food);
        }
    }
}

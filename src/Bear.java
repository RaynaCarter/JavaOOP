public class Bear  extends Animal{


    public Bear(String newname) {
        // put your constructor content here
        super("Pooh","fish");
        name=newname;
       favoriteFood="fish";

    }

    public void sleep(){
        System.out.println(name + " hibernates for 4 months");
    }

}

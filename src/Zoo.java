import sun.awt.image.GifImageDecoder;

public class Zoo {

    public static void main(String[]args){

        Zoo tiger = new Zoo();
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");

        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        Animal[] animal = {tigger,pooh,rarity,gemma,stinger};
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals( animal,"food");



    }

}

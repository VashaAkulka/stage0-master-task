public class MasterTask {
}

class Animal {
    private String color;
    private int NumberOfPaws;
    private boolean hasFur;

    public Animal(String color, int NumberOfPaws, boolean hasFur) {
        this.color = color;
        this.NumberOfPaws = NumberOfPaws;
        this.hasFur = hasFur;
    }

    public void getDescription() {
        System.out.print("This animal is mostly " + color + ". It has " + NumberOfPaws + " paws and ");
        if (hasFur) System.out.print("a");
        else System.out.print("no");
        System.out.print(" fur.");
    }
}

class Dog extends Animal {

    public Dog() {
        super("brown", 4, true);
    }
}

class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public void getDescription(){
        super.getDescription();
        System.out.println("Moreover, it has 2 wings and can fly.");
    }
}
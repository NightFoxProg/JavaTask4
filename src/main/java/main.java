public class main {
    public static void main(String[] args) {
        Animals One = new Cat();
        One.name = "Vasya";
        One.animalRun(300);
        Animals Two = new Cat();
        Two.name = "Petya";
        Two.animalRun(100);
        Animals OneMore = new Cat();
        OneMore.name = "Anatoliy";
        OneMore.animalRun(300);
        System.out.println();
        System.out.println(Cat.getCount());
        Animals Animal =new Animals();
        System.out.println(Animals.getCount());
        Animals Cot = new Cat();
        System.out.println(Animals.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());

    }
}

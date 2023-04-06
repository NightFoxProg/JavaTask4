public class Cat extends Animals {
    private static int count;
    protected final int catMaxDistance = 200;
    Cat(){
        super();
        count++;
    }
    @Override
    public void animalRun(int distance){
        if (distance<=catMaxDistance) {
            super.animalRun(distance);
        }
        else {
            System.out.println(this.name + " "+ distance+" м не пробіжить");
        }
        }
    @Override
    public void animalSwim(int distance){
        System.out.println("Кіт не вміє плавати");
    }
    public static int getCount(){
        return count;
    }
}



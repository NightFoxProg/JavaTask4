public class Dog extends Animals {
    private static int count;
    protected final int dogMaxDistance = 500;
    protected final int dogMaxSwimDistance = 500;
    Dog(){
        super();
        count++;
    }
    @Override
    public void animalRun(int distance){
        if (distance<=dogMaxDistance) {
            super.animalRun(distance);
        }
        else {
            System.out.println(this.name + " "+ distance+" не пробіжить");
        }
    }
    @Override
    public void animalSwim(int distance) {
        if (distance <= dogMaxSwimDistance) {
            super.animalSwim(distance);
        } else {
            System.out.println(this.name + " " + distance + " не пропливе");
        }
    }
    public static int getCount(){
        return count;
    }
}



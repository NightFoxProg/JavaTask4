public class Animals {
    private static int count;
    public String name;
    Animals (){
        count++;
    }
    public void animalRun(int distance){
        System.out.println(this.name+" пробіг "+distance+" м");
    }
    public void animalSwim(int distance){
        System.out.println(this.name+" проплив "+distance+" м");
    }
    public static int getCount() {
        return count;
    }
}


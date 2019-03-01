public class Coffee extends CaffineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    public boolean customerWantsCondiments(){
        return false;
    }
}

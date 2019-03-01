public abstract class CaffineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    public boolean customerWantsCondiments() {
        return true;
    }

    private void pourInCup() {
        System.out.println("pouring in cup");
    }

    public abstract void brew();

    private void boilWater() {
        System.out.println("boiling water");
    }

    public abstract void addCondiments();

}

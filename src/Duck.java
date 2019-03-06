public class Duck implements Comparable {

    String name;
    int weight;

    public Duck (String name, int weight){
        this.name = name;
        this.weight = weight;
    }


    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck)o;
        char d1, d2;

        for(int i = 0; i < this.name.length()&& i < otherDuck.name.length(); i++){
            d1 = this.name.charAt(i);
            d2 = otherDuck.name.charAt(i);
            if(d1 != d2){
                return d1-d2;
            }
        }
        if(this.name.length() != otherDuck.name.length()){
            return this.name.length()-otherDuck.name.length();
        }else {
            return this.weight-otherDuck.weight;

        }
    }

    public String toString(){
        return "Name: " + name + "\tWeigh: " + weight;
    }
}

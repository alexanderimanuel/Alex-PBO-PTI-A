public class Vehicle1 {
    // No. 3 
    double load, maxLoad;
    // private double load, maxLoad;
    
    public Vehicle1 (double max){
        this.maxLoad = max;
    }
    // No. 1 accessor1
    public double getLoad(){
        return this.load;
    }
    // No. 1 accessor2
    public double getMaxLoad(){
        return this.maxLoad;
    }

    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        } else { 
            return false;}
    }
}
public class IronMan {
    
    private String name;
    private String color;
    private int weight;
    private String armorType;
    private int numOfWeapons;
    private boolean icingProblemSolved;
    private double batteryLeft;
 
    public IronMan() {
        name = "not yet defined";
        color = "not yet defined";
        weight = -1;
        armorType = "not yet defined";
        numOfWeapons = -2;
        icingProblemSolved = false;
        batteryLeft = -1.1;
    }
    
    public IronMan(String name, String color, int weight, String armorType, int numOfWeapons, boolean icing, double batteryLeft) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.armorType = armorType;
        this.numOfWeapons = numOfWeapons;
        this.icingProblemSolved = icing;
        this.batteryLeft = batteryLeft;
    }    
    
    public String toString() {
        
        String result = "";
        result += "\n---------------------------------\n";
        result += "Name: " + name + "\n";
        result += "Color: " + color + "\n";
        result += "Weight: " + weight + "\n";
        result += "Armor Type: " + armorType + "\n";
        result += "Number Of Weapons: " + numOfWeapons + "\n";
        result += "Icing Problem Solved: " + icingProblemSolved + "\n";
        result += "Battery Remaining: " + batteryLeft + "\n";
        
        return result;
    }
    
    public void fly() {
        
        while (batteryLeft > 0) {
            // code to ignite 
        }
    }

}

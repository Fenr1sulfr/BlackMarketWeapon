package FireWeapons.Shotgun;

import FireWeapons.Firearms;

public class Shotgun extends Firearms {
    public Shotgun(){}
    public Shotgun(double price, double weight,int range, String country, double trunkLength, int magazine, double caliber, boolean isAutamatic){
        super(weight, price, range, country, trunkLength, magazine, caliber, isAutamatic);
    }
}

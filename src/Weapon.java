public class Weapon {
    private String weaponType;
    private String weaponName;

    public Weapon( String weaponName) {

        this.weaponName = weaponName;
    }


    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    public String toString(){
        return weaponName;
    }
}

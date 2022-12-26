public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss(400,300, new Weapon("Gun"));
        boss.setHealth(400);
        boss.setDamage(300);
        System.out.println("Health: "+boss.getHealth()+" Damage: "
                +boss.getDamage()+" WeaponName: " +boss.getWeapon());
    }
}
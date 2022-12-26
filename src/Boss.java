public class Boss extends GameEntity{
 public Boss(int health, int damage,Weapon weapon) {
  this.weapon = weapon;
 }

 private Weapon weapon;

 public Weapon getWeapon() {
  return weapon;
 }

 public void setWeapon(Weapon weapon) {
  this.weapon = weapon;
 }
}

/*To show extension of interface with inheritance*/

interface Monster {
       void menace();
 }
interface DangerousMonster extends Monster {
void destroy();
	}
	interface Lethal {
	void kill();
	}
	class DragonZilla implements DangerousMonster {
	public void menace() {
            System.out.println("Dragon from dragonzilla");
	}
	public void destroy() {
             System.out.println("dangerousmonster destroy");
	}
	}
	interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
	}
	class VeryBadVampire implements Vampire {
	public void menace() {
         System.out.println("menace from verybadvampire");
	}
	public void destroy() {
             System.out.println("verybadvampire destroy");
	}
	public void kill() {
          System.out.println("verybadvampire kill");
	}
	public void drinkBlood() {
         System.out.println("drink blood");
	}
	}
	public class interfaceInheritanceDemo {
	static void u(Monster b) {
	b.menace();
	}
static void v(DangerousMonster d) {
	d.menace();
	d.destroy();
}
	static void w(Lethal l) {
	l.kill();
	}
	public static void main(String[] args) {
	DangerousMonster barney = new DragonZilla();
	u(barney);
v(barney);
	Vampire vlad = new VeryBadVampire();
	u(vlad);
v(vlad);
	w(vlad);
	}
	} 

class Aircraft {
    private int maxAmmo;
    private int baseDamage;
    private int ammo;

    public Aircraft(int maxAmmo, int baseDamage) {
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.ammo = 0;
    }

    public int fight() {
        int damage = baseDamage * ammo;
        ammo = 0;
        return damage;
    }

    public int refillAmmo(int ammoToFill) {
        int remainingAmmo = Math.min(maxAmmo - ammo, ammoToFill);
        ammo += remainingAmmo;
        return ammoToFill - remainingAmmo;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getStatus() {
        return "Type " + getType() + ", Ammo: " + ammo + ", Base Damage: " + baseDamage +
                ", All Damage: " + (ammo * baseDamage);
    }

    public boolean isPriority() {
        return false;
    }
}

class F16 extends Aircraft {
    public F16() {
        super(8, 30);
    }
}

class F35 extends Aircraft {
    public F35() {
        super(12, 50);
    }

    @Override
    public boolean isPriority() {
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Aircraft f16 = new F16();
        Aircraft f35 = new F35();

        System.out.println(f16.getStatus());
        System.out.println(f35.getStatus());

        int ammoToFill = 50;
        int remainingAmmo = f16.refillAmmo(ammoToFill);
        System.out.println("Remaining ammo: " + remainingAmmo);

        remainingAmmo = f35.refillAmmo(ammoToFill);
        System.out.println("Remaining ammo: " + remainingAmmo);

        System.out.println(f16.fight());
        System.out.println(f35.fight());

        System.out.println(f16.getStatus());
        System.out.println(f35.getStatus());
    }
}
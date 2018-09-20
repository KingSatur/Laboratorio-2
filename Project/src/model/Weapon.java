package model;

public class Weapon {

	private String name;
	private int ammo;
	
	
	public Weapon(String name, int ammo) {
		super();
		this.name = name;
		this.ammo = ammo;
	}

	public String getName() {
		return name;
	}

	public void setType(String name) {
		this.name = name;
	}

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}
	
	
}


public class PetMachine {

	private boolean clean = true;
	private int water = 30;
	private int shampoo = 10;
	private Pet pet;
	
	public void takeAShower() {
		if(pet == null) {
			System.out.println("Coloque o pet na maquina para iniciar o  banho");
			return;
		}
		
		this.water -= 10;
		this.shampoo -= 2;
		pet.setClean(true);
		System.out.println("O pet " + pet.getName() +" esta limpo! ");
	}
	
	public void addWater() {
		if(water == 30) {
			System.out.println("A capacidade da maquina esta no maximo");
			return;
		}
		
		water += 2;
	}
	
	public void addShampoo() {
		if(shampoo == 10) {
			System.out.println("A capacidade do shampoo na maquina esta no maximo");
			return;
		}
		
		water += 2;
	}

	public int getWater() {
		return water;
	}

	public int getShampoo() {
		return shampoo;
	}
	
	public boolean HasPetInMachine() {
		return pet != null;
		
	}

	public void setPet(Pet pet) {
		if(!this.clean) {
			System.out.println("A maquina esta suja, para usala é necessario limpa-la");
			return;
		}
		
		if(HasPetInMachine()) {
			System.out.println("O pet "+ this.pet.getName() + " esta na maquina no momento");
			return;
		}
		
		this.pet = pet;
	}
	
	public void removePet() {
		this.clean = this.pet.isClean();
		System.out.println("O pet "+ this.pet.getName() + " esta limpo");
		this.pet = null;
	}
	
	public void washMachine() {
		this.water -= 10;
		this.shampoo -= 2;
		this.clean = true;
		System.out.println("A maquina foi limpa! ");
	}

	
}

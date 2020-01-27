package virtualpetamok;

import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {
List<VirtualPet> pets = new ArrayList<>();
	
	public void addVirtualPet(VirtualPet pet) {
		pets.add(pet);
	}
	
	public int getListSize() {
		return pets.size();
	}
	
	public void feedAll() {
		for(VirtualPet pet: pets) {
			if(pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}
		}
	}
	
	public void waterAll() {
		for(VirtualPet pet: pets) {
			if(pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
			}
		}
	}
	
	public void walkAll() {
		for(VirtualPet pet: pets) {
			if(pet instanceof Dog) {
				((Dog) pet).walkDog();
			}
		}
	}
	
	public void oilAll() {
		for(VirtualPet pet: pets) {
			if(pet instanceof RoboticPet) {
				 ((RoboticPet) pet).oilPet();
			}
		}
	}
	
	public void petStateAll() {
		for(VirtualPet pet: pets) {
			pet.petState();
		}
	}
	
	public void cageCleanliness() {
		for(VirtualPet pet: pets) {
			if(pet instanceof Dog) {
				if(((Dog) pet).getWaste() > 15) {
					pet.decreaseHealth();
				}
			}
		}
	}
	
	public void litterBoxCleanliness() {
		for(VirtualPet pet: pets) {
			if(pet instanceof Cat) {
				if(((Cat) pet).getWaste() > 18) {
					pet.decreaseHealth();
				}
			}
		}
	}
	
	public void oilLevel() {
		for(VirtualPet pet: pets) {
			if(pet instanceof RoboticPet) {
				if(((RoboticPet) pet).getOil() < 15) {
					pet.decreaseHealth();
				}
			}
		}
	}
	
	public void cleanAllCages() {
		for(VirtualPet pet: pets) {
			if( pet instanceof Dog) {
				 ((Dog) pet).cleanCage();
			} 
		}
	}
	
	public void emptyLitterBox() {
		for(VirtualPet pet: pets) {
			if( pet instanceof Cat) {
				 ((Cat) pet).cleanLitterBox();
			} 
		}
	}
	
	public void playWithPet(String petName) {
		for(VirtualPet pet: pets) {
			if(pet.getName().equals(petName)) {
				pet.play();
			}
		}
	}
	
	public void adopt(String pet) {
		int value = getPet(pet);
		
		if(value != -1) {
			pets.remove(value);
		}
		else {
			System.out.println("Sorry wrong name");
		}
	}
	
	public int getPet(String name) {
		int i = 0;
		for(VirtualPet pet: pets) {
			if (pet.getName().equals(name)) {
				return i;
			}
			i++;
		}
			return -1;
	//	return pets.get(index);
	}
	
	public void tick() {
		for(VirtualPet pet: pets) {
			pet.tick();
		}
	}
	
	public void displayTwo() {
		for(VirtualPet pet: pets) {
			System.out.println("[" + pet.getName() + "] " + pet.getDescription());
		}
	}
	
	public void displayAll() {
		for(VirtualPet pet: pets) {
			if (pet instanceof OrganicPet) {
				System.out.println(pet.getName() + "\t |" + ((OrganicPet) pet).getHunger() + "\t |" + ((OrganicPet) pet).getThirst() + "\t |" + ((OrganicPet) pet).getBoredom() + "\t |" +  pet.getHealth() + "\t |" + pet.getHappiness() + "\t |" + " - ");
			}
			else {
				System.out.println(pet.getName() + "\t |" + " - " + "\t |" + " - " + "\t |" + " - " + "\t |" +  pet.getHealth() + "\t |" + pet.getHappiness() + "\t |" + ((RoboticPet) pet).getOil());
			}
		} 
	}
	
}

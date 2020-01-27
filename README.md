# virtual-pet-amok
VirtualPet class for this project is the parent abstract class for the Dog class, Cat class and RoboticPet class. It has four instance variables, health, happiness, name and description. It includes methods like getHealth(), getHappiness(), getName(), getDescription(), decreaseHealth(). It also contains abstact methods including petState(), play() and tick().

Dog class and Cat class are children class of Virtual Pet class that implements the OrganicPet Interface. This includes methods like getHunger(), getThirst(), getBoredom(), getWaste(), feed() and water().

The Dog class has unique methods including cleanCage() and walkDog() while the Cat method has a unique method clean litter box. The waste instance variable in these two classes is used to keep track of waste in the cage or the litter box. The amound of waste can affect the heath of the organic pets.

Robotic pet has an instance variable oil and methods like getOil() and oilPet().

The constructor for The Dog class and Cat class includes name and description alone or name, description, hunger, thirst, boredom, health and happiness.
The RoboticPet constructor includes either name and description or name, description, health, happiness and oil.

VirtualPetShelter This class stores virtual pets in a list (arraylist) called pets.

The addVirtualPet(Virtual Pet) method is used to add a virtual pet to the list. The getListSize() method returns the size of the list. feedAll() method feeds all the virtual pets in the pets list that are OrganicPets (Cat and Dog) by calling the feed() method. waterAll() method waters all the virtual pets in the pets list that are OrganicPets(Cat and Dog) by calling the water() method. The playWithPet(String petName) method takes the name of the pet and searches for the pet in the list and when found, it calls the play() method in virtualPet class. adoptPet(String pet) method takes the name of the pet that a user wants to adopt, finds it in the list and removes it from the list. getPet(String name) method takes in the name of the pet, looks for it in the list and returns the index of the pet. tick() method calls the tick method of the individual pet class. displayTwo() method displays the name and description of the virtual pet displayAll() method displays the name, hunger, thirst, boredom, health, happiness and oil of the virtual pet.

VirtualPetShelterApp This is where user Interaction is present.

Four virtual pets are initially created and are added to the list in VirtualPetShelter through the addVirtualPet(VirtualPet pet)method. User is given six options. 1 is to feed all pets, 2 is to water all pets, 3 is to play with a pet, 4 is to adopt a pet, 5 is to admit a pet and 6 is to quit. Based on the users choice, the appropriate methods are called in the VirtualPetShelter class.

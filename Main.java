class Main {
  public static void main(String[] args) {

    
    // TODO: Create 2 hero objects (hero1 and hero2), one passing no arguments in the constructor and the other passing arguments
    //NEED ARGUMENTS
    Superhero hero1 = new Superhero("Batman", "Bruce Wayne", "Smarts");
    Superhero hero2 = new Superhero();  
    // TODO: Use setters to change a hero's name, hero name, and power
    hero2.setHeroName("Spiderman");
    hero2.setName("Stan Lee");
    hero2.setPower("Strength");
// TODO: Print the information of hero1 using getters
    
    System.out.println("The hero "+ hero1.getHeroName()+"'s real name is "+ hero1.getName()+" and his superpower is "+ hero1.getPower());
   
    // TODO: Print the information of hero2 using the toString
    System.out.println(hero2.toString());
    // TODO: Have your heros fight by using the fight method
    hero1.fight(hero2);


  }
}

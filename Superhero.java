 class Superhero {
    

        private String heroName;
        private String name;
        private String power;
      
        public Superhero() {
          heroName = "Superman";
          name = "Clark Kent";
          power = "all of them";
        }
        // TODO: Add second constructor accepting hero name, name, and power
        public Superhero(String heroName1,String  name1,String  power1){
          heroName = heroName1;
          name = name1; 
          power = power1;
          
        }
        
      
        public void fight(Superhero fighter) {
          // TODO: Make random a random value from 1-10
          
          
          int random = (int)(Math.random()*10)+1;
      
          Superhero winner;
          Superhero loser;
          if (random > 5) {
            winner = this;
            loser = fighter;
          } else {
            winner = fighter;
            loser = this;
          }
      
          System.out.println("After a close fight, " + winner.getHeroName() + " beat " + loser.getHeroName() + "!");
        }
      
        // Getter for hero name
        public String getHeroName() {
          return heroName;
        }
      
        // Setter for hero name
        public void setHeroName(String heroName) {
          heroName = heroName;
        }
      
        // TODO: Add getter and setter methods for name and power
        
        public String getName(){
          return name;
        }
        public String getPower(){
          return power;
        }
        public void setName(String newName){
          name = newName;
        }
        public void setPower(String newPower){
        power = newPower;    
        }
      
        
      
      
        // TODO: Have toString return details of hero i.e. "The hero Superman's real name is Clark Kent and his superpower is all of them."
        public String toString() {
          return "The hero "+ heroName + "'s real name is "+ name +
            " and his superpower is "+ power;
        }
      
}


/**
 * Klasse für Aufgabe 3 b) des Teils B von Übungsblatt 2:
 * Erweitert Aufgabe 3 a), indem neue Methoden und Variablen zum Anzeigen
 * des "Graincounts" deklariert werden, anstatt diesen immer eigenständig
 * geschrieben anzeigen zu lassen.
 * 
 * @author (Julian Gottschlich) 
 * @version (08.11.2018)
 */
public class CopyOfCopyOfHomeworkHamster extends HomeworkHamsterGame{
    @Override
    protected void run(){
        paule.write("Ich weiß nicht wie :'(");
        paule.move();
        paule.move();
        paule.move();
        paule.move();
        paule.move();
        pickGrainAndCount();
        turnRight();
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        pickGrainAndCount();
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        paule.move();
        pickGrainAndCount();
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        pickGrainAndCount();
        paule.turnLeft();
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        turnRight();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.move();
        pickGrainAndCount();
        putGrainAndCount();
        putGrainAndCount();
        putGrainAndCount();
        putGrainAndCount();
        putGrainAndCount();
    }
          
    int grains = 0;
    
    void pickGrainAndCount(){
        if (paule.grainAvailable() == true) {
            paule.pickGrain();
            grains = grains + 1;
            String countedGrains = "" + grains;
            paule.write(countedGrains);
        }
    }
    
    void putGrainAndCount(){
        if (paule.mouthEmpty() == false){
            paule.putGrain();
            grains = grains - 1;
            String countedGrains = "" + grains;
            paule.write(countedGrains);
        }
    }
    
    void turnRight(){
        paule.turnLeft();
        paule.turnLeft();
        paule.turnLeft();  
    }
}
    
   
        
        
        



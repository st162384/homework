
/**
 * Klasse für Aufgabe 3 a) des Teils B von Übungsblatt 2:
 * Erweitert Aufgabe 2 durch Anzeigen der "Grains" im Mund des Hamsters
 * nach jedem Aufsammeln und Ablegen eines solchen.
 * 
 * @author (Julian Gottschlich) 
 * @version (08.11.2018)
 */
public class CopyOfHomeworkHamster extends HomeworkHamsterGame{
    @Override
    protected void run(){
        paule.write("Ich weiß nicht wie :'(");
        paule.move();
        paule.move();
        paule.move();
        paule.move();
        paule.move();
        paule.pickGrain();
        paule.write("1");
        turnRight();
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.pickGrain();
        paule.write("2");
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        paule.move();
        paule.pickGrain();
        paule.write("3");
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.pickGrain();
        paule.write("4");
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
        paule.pickGrain();
        paule.write("5");
        paule.putGrain();
        paule.write("4");
        paule.putGrain();
        paule.write("3");
        paule.putGrain();
        paule.write("2");
        paule.putGrain();
        paule.write("1");
        paule.putGrain();
        paule.write("0");
    }
        
    void turnRight(){
        paule.turnLeft();
        paule.turnLeft();
        paule.turnLeft();  
    }
}


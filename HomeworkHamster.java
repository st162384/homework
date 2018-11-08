
/**
 * Lässt Paule durch das Spielfeld laufen, um alle "Grains" einzusammeln und
 * diese in seiner Höhle (Spalte 6, Zeile 4) wieder abzulegen.
 * 
 * @author (Julian Gottschlich) 
 * @version (08.11.2018)
 */
public class HomeworkHamster extends HomeworkHamsterGame{
    @Override
    protected void run(){
        paule.write("Ich weiß nicht wie :'(");
        paule.move();
        paule.move();
        paule.move();
        paule.move();
        paule.move();
        paule.pickGrain();
        turnRight();
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.pickGrain();
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        paule.move();
        paule.pickGrain();
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.pickGrain();
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
        paule.putGrain();
        paule.putGrain();
        paule.putGrain();
        paule.putGrain();
        paule.putGrain();
    }
        
    void turnRight(){
        paule.turnLeft();
        paule.turnLeft();
        paule.turnLeft();  
    }    
}


package practice_serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NFSGame implements Serializable {
	String name;
	int level;
	long score;
	int life;
	public NFSGame(String name, int level, long score, int life) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}
	
}
public class Run1_Serialization {
	public static void main(String[] args) throws Throwable {
    NFSGame userobj= new NFSGame("Nagender", 20, 800000, 2);
    FileOutputStream fos= new FileOutputStream("./ngdr.txt");
    
    ObjectOutputStream objout= new ObjectOutputStream(fos);
    objout.writeObject(userobj);
    System.out.println("===END===");
  }
}

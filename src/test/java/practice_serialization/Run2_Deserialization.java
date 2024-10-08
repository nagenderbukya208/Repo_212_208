package practice_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Run2_Deserialization {
public static void main(String[] args) throws Throwable {
	FileInputStream input= new FileInputStream("./ngdr.txt");
	ObjectInputStream objinput= new ObjectInputStream(input);
  NFSGame user1obj=(NFSGame)objinput.readObject();
  System.out.println(user1obj.name);
  System.out.println(user1obj.level);
  System.out.println(user1obj.score);
  System.out.println(user1obj.life);
}
}

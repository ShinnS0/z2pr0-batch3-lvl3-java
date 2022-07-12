package Day6;

public class Assignment1 {

	public static void main(String[] args) {
		
		String sent = "Monkey D. Luffy, also known as Straw Hat Luffy and commonly as Straw Hat, is the main protagonist of the manga and anime, One Piece . "
				+ "He is the founder and captain of the increasingly infamous and powerful Straw Hat Pirates, as well as one of its top fighters . "
				+ "He is also one of the Four Emperors that rule over the New World.His lifelong dream is to become the Pirate King by finding the legendary treasure left behind by the late Gol D. Roger . "
				+ "He believes that being the Pirate King means having the most freedom in the world . ";
		
//		System.out.println(sent);
		System.out.println("----- For this paragraph -----\n");
		String []Data1 = sent.split(" . ");
		System.out.println("Number of sentence: " + Data1.length);
		
		String []Data = sent.split(" ");
		System.out.println("Total word: "+ Data.length);
		
	}
}

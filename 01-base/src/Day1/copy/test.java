package Day1.copy;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		String str = "12/batahta/(N)/043519";
		String[] splits = str.split("/");
//      Object splita2;
//		System.out.println(splits);
//		for(String splits2: splits) {
//            System.out.println(splits2);
            for (int i=0; i < splits.length; i++){
                System.out.println(splits[i]);
              }
            
	}

}

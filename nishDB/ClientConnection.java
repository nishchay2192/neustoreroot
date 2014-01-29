package nishDB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientConnection{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean alive = true;
		while(alive){
			String get = br.readLine();
			if(get.toLowerCase().trim().equals("exit")){
				alive = false;
			}else{
				parseAndExecute(get);
			}
		}
	}
	private static void parseAndExecute(String get){
		
	}
}

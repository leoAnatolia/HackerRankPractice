package com.avivasa.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Player
{
	String name;
	int score;
}

class Checker{

	public Comparator<Player> desc = new Comparator<Player>() {

		@Override
		public int compare(Player player1, Player player2) {

			int returnVal = 0;
			Integer score1 = new Integer(player1.score);
			Integer score2 = new Integer(player2.score);
			
			returnVal = score2.compareTo(score1);
			
			if(returnVal == 0) returnVal = player2.name.compareTo(player1.name);
			
			
			//return player2.name.compareTo(player1.name);
			return returnVal;
		}
	};
	
}
public class JavaComparator {

	/*
	 * Sample Input

		5
		amy 100
		david 100
		heraldo 50
		aakansha 75
		aleksa 150

		Sample Output
		
		aleksa 150
		david 100
		amy 100
		aakansha 75
		heraldo 50
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
	  int N=Integer.parseInt(br.readLine().trim());
	  String s;
	  StringTokenizer st;
	  Player Player[]=new Player[N];
	  
	  Checker check=new Checker();
	  
	  for(int i=0;i<N;i++)
	  {
		  s=br.readLine().trim();
		  st=new StringTokenizer(s);
		  Player[i]=new Player();
		  Player[i].name=st.nextToken();
		  Player[i].score=Integer.parseInt(st.nextToken());
	  }
	 
	  Arrays.sort(Player,check.desc);
	  
	  for(int i=0;i<Player.length;i++)
	  {
			System.out.printf("%s %s\n",Player[i].name,Player[i].score);
	  }

		
    }
}


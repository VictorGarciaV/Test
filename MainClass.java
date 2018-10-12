package arrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		MainClass finalList = new MainClass();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(8);
		list.add(2);
		list.add(12);
		list.add(15);
		
		int option = Integer.parseInt(JOptionPane.showInputDialog("Choose option: \n" + "1)Introduce numbers \n"+ "2)Text file \n"+ "3)Use system list \n"));
		
		if(option ==1) {
			for(int i = 0; i < 9; i++) {
				list.remove(0);
				list.add(Integer.parseInt(JOptionPane.showInputDialog("Introduce number: ")));
			}
			JOptionPane.showMessageDialog(null, finalList.removeBadPairs(list));
		}
		
		if (option ==2) {
			list.clear();
			 System.out.println(list); 
			FileReader fr = new FileReader("ArrayProvided.txt");
			BufferedReader br = new BufferedReader (fr);
			
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			
			while(br.ready()) {
				list.add(Integer.parseInt(br.readLine()));
				
			}
			br.close();
			JOptionPane.showMessageDialog(null, finalList.removeBadPairs(list));
			System.out.println(list.toString());
		}
		
		if(option == 3) {
			JOptionPane.showMessageDialog(null, finalList.removeBadPairs(list));
		}
	}
		
	
    public ArrayList removeBadPairs(ArrayList<Integer> list) {
    	 if(list.size()%2!= 0) {
    		 list.remove(list.size()-1);
    	 }
    	 for(int i = 0; i<list.size(); i+= 2) {
    		 if(list.get(i) > list.get(i+1)) {
    			 list.remove(i);
    			 list.remove(i);
    			 i-= 2;
    		 }
    	 }
    	 return list;
    }
   
 }



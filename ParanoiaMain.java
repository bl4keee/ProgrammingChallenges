
public class ParanoiaMain {

	public static void main(String[] args) {
		
		Paranoia myParanoia = new Paranoia();
		myParanoia.openFile();
		myParanoia.readFile();
		myParanoia.search();
		myParanoia.closeFile();

	}

}

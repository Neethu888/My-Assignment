package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser ie=new Browser();
		String launchBrowser=ie.launchBrowser("internet Explorer");
		System.out.println(launchBrowser);
		ie.loadurl();
	}

	}


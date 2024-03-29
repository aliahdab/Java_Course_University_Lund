package polygon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import se.lth.cs.pt.window.SimpleWindow;

public class OnePolygon {

	public static void main(String[] args) {
		Scanner scan = null;
		scan = new Scanner(System.in);
		System.out.println("Enter the file name");
		File file = new File(scan.nextLine());
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't find file ");
			System.exit(1);
		}
		SimpleWindow w = new SimpleWindow(600, 600, "A polygon");
		Polygon2 pol = new Polygon2();
		while (scan.hasNext()) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			pol.addVertex(x, y);
		}
		pol.draw(w);
	
	}
}

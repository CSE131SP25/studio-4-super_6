package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
				Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		System.out.println(isFilled);
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		if (isFilled == true) {
			if(shapeType.equals("rectangle")) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else if(shapeType.equals("ellipse")){
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else {
				double parameterFive = in.nextDouble();
				double parameterSix = in.nextDouble();
				double[] x = {parameterOne, parameterThree, parameterFive};
				double[] y = {parameterTwo, parameterFour, parameterSix};
				StdDraw.filledPolygon(x, y);
			}
			
		} else {
			if(shapeType.equals("rectangle")) {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else if(shapeType.equals("ellipse")){
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else {
				double parameterFive = in.nextDouble();
				double parameterSix = in.nextDouble();
				double[] x = {parameterOne, parameterThree, parameterFive};
				double[] y = {parameterTwo, parameterFour, parameterSix};
				StdDraw.polygon(x, y);
			}
		}
		
	}
}

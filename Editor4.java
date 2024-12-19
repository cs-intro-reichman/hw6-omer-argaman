import java.awt.Color;

/**
 * This class takes a colored image and converts it int a black and 
 * white version of itself. Then morphs the colored image into the black and white version
 * it does this in 'n' steps which is given my the user
 */
public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(targetImage, sourceImage , n);
	}
}

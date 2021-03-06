import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;


public class ImageToStl {
	//attributs
	private int[][] tabPixelZ;
	private File fichierStl;
	private Pixel[] tabPixelPoints;
	
	//constructeurs
	
	public ImageToStl(Image imageGris){
		this.tabPixel = imageToInt((BufferedImage)imageGris);
		fichierStl = new File("fichierSTL");
	}
	
	//methodes
	   private static int[][] imageToInt(BufferedImage image) {

		      final byte[] pixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
		      final int width = image.getWidth();
		      final int height = image.getHeight();
		      final boolean hasAlphaChannel = image.getAlphaRaster() != null;

		      int[][] result = new int[height][width];
		      if (hasAlphaChannel) {
		         final int pixelLength = 4;
		         for (int pixel = 0, row = 0, col = 0; pixel < pixels.length; pixel += pixelLength) {
		            int argb = 0;
		            argb += (((int) pixels[pixel] & 0xff) << 24); // alpha
		            argb += ((int) pixels[pixel + 1] & 0xff); // blue
		            argb += (((int) pixels[pixel + 2] & 0xff) << 8); // green
		            argb += (((int) pixels[pixel + 3] & 0xff) << 16); // red
		            result[row][col] = argb;
		            col++;
		            if (col == width) {
		               col = 0;
		               row++;
		            }
		         }
		      } else {
		         final int pixelLength = 3;
		         for (int pixel = 0, row = 0, col = 0; pixel < pixels.length; pixel += pixelLength) {
		            int argb = 0;
		            argb += -16777216; // 255 alpha
		            argb += ((int) pixels[pixel] & 0xff); // blue
		            argb += (((int) pixels[pixel + 1] & 0xff) << 8); // green
		            argb += (((int) pixels[pixel + 2] & 0xff) << 16); // red
		            result[row][col] = argb;
		            col++;
		            if (col == width) {
		               col = 0;
		               row++;
		            }
		         }
		      }

		      return result;
		   }
	   public Point[] pointPixel(){
		   int i,j;
		   for (i=0; i<tabPixelZ.length;i++){
			   for (j=0; j<tabPixelZ[0].length; j++){
				   
			   }
		   }
	   }
	   
}

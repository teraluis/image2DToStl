import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.util.Vector;


public class ImageToStl {
	//attributs
	private int[][] tabPixelZ; // image matricielle
	private File fichierStl;
	private Face[][] tabPixelPoints;
	
	//constructeurs
	
	public ImageToStl(Image imageGris){
		this.tabPixelZ = imageToInt((BufferedImage)imageGris);
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
	   
	/*   public Pixel[][] pointPixel(){
		   int i,j;
		   int imax = tabPixelZ.length;
		   int jmax = tabPixelZ[0].length;
		   Pixel tabPix[][] = new Pixel[imax][jmax];
		   for (i=0; i<imax;i++){
			   for (j=0; j<jmax; j++){
				   Point a = new Point(i,j);
				   Point b = new Point(i,j+1);
				   Point c = new Point(i+1,j+1);
				   Point d = new Point(i+1,j);
				   Triangle t1 = new Triangle (a,b,c);
				   Triangle t2 = new Triangle (b,c,d);
				   Pixel pixel = new Pixel (t1,t2,tabPixelZ[i][j]);
				   tabPix[i][j] = pixel; 
			   }
		   }
		   return tabPix;
	   }
*/	   
}

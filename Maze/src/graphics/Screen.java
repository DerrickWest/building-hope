/*
 *  author 		: Mathew Petermeyer (Drakos)
 *  description : Following tutorials to create basic 3d engine...
 *  date		: 7/29/2013
 * 
 * 
 * 
 */

package graphics;

import java.util.Random;

public class Screen extends Render {

	private Render test;

	public Screen(int width, int height) {
		super(width, height);
		Random random = new Random();

		test = new Render(256, 256);
		for (int i = 0; i < 256 * 256; i++) {
			test.pixels[i] = random.nextInt();
		}

	}

	public void render() {
		
		for (int i = 0; i <width*height; i++){
			pixels[i] = 0;
		}
		
		
		for (int i = 0; i < 50; i++){
			
			int anim = (int) (Math.sin((System.currentTimeMillis()+i) % 20000.0 / 2000 * Math.PI * 2) * 200);
			int anim2 = (int) (Math.cos((System.currentTimeMillis()+i) % 20000.0 / 2000 * Math.PI * 2) * 200);
		
		
		draw(test, (width - 256) / 2 +anim, (height - 256) / 2 + anim2 );
		}
	}
}

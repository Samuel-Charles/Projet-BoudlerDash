package Model;

import static org.junit.Assert.*;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WallsTest {
	
	public Image wall;
	public Image wall2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWalls() {
		//fail("Not yet implemented");
		ImageIcon img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//wall.png");
		wall = img.getImage();
		img = new ImageIcon("C://Users//LATITUDE//Desktop//Try//new.png");
		wall2 = img.getImage();
	}

	@Test
	public void testGetWall() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetWall2() {
		//fail("Not yet implemented");
	}

}

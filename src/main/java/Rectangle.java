import java.util.Map;
import java.util.HashMap;
import java.io.Console;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Rectangle {
	private int mLength;
	private int mWidth;
  	
  	// public static void main(String[] args) {}

	public Rectangle(int length, int width){
		mLength = length;
		mWidth = width;
	}

	public int getLength() {
		return mLength;
	}

	public int getWidth() {
	  return mWidth;
	}
	
	public boolean isSquare() {
		return mLength == mWidth;
	}

}

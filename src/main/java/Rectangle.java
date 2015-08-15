import java.util.*;
// import java.util.Map;
// import java.util.HashMap;
import java.io.Console;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Rectangle {
  public static void main(String[] args) {
	private Integer mLength;
	private Integer mWidth;

	public Rectangle(Integer length, Integer width) {
		mLength = length;
		mWidth = width;
	}

	public int getLength() {
		return mLength;
	}

	public int getWidth() {
	  return mWidth;
	}
  }	
	
	public boolean isSquare() {
		return mLength == mWidth;
	}

}

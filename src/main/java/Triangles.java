// import java.util.Map;
// import java.util.HashMap;
// import java.io.Console;
//
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;

public class Triangles {
 private int mSideA;
 private int mSideB;
 private int mSideC;
 private int sumAB = mSideA + mSideB;
 private int sumBC = mSideB + mSideC;
 private int sumAC = mSideA + mSideC;

public Triangles(int sideA, int sideB, int sideC) {
	mSideA = sideA;
	mSideB = sideB;
	mSideC = sideC;
}

public int getSideA() {
	return mSideA;
}

public int getSideB() {
	return mSideB;
}

public int getSideC() {
	return mSideC;
}

public String triangleType(){
	if(!isTriangle()){
		return "That's not a triangle! Try again.";
	} else if (isEquilateral()){
		return "Equilateral";
	} else if (isIsoscelese()){
		return "Isoscelese";
	} else if (isScalene()){
		return "Scalene";
	} else {
		return "Your code has issue";
	}

}

public boolean isEquilateral(){
	if ((mSideA == mSideB) && (mSideB == mSideC) && (mSideA == mSideC)) {
	return true;
	} else {
		return false;
	}
}

public boolean isIsoscelese() {
	if((mSideA == mSideB) || (mSideA == mSideC) || (mSideB == mSideC)) {
		return true;
	} else {
		return false;
	}
}

public boolean isScalene() {
 	boolean result = false;
	while(isTriangle()){
		if (!isEquilateral() && !isIsoscelese()){
			result = true;
		} else {
			result = false;
		}
	}
	return result;
}

public boolean isTriangle(){
	if ((sumAB > mSideC) && (sumBC > mSideA) && (sumAC > mSideB)){
		return true;
	} else {
		return false;
	}
}

}


public class Triangles {
 private int mSideA, mSideB, mSideC, sumAB, sumBC, sumAC;

public Triangles(int sideA, int sideB, int sideC) {
	mSideA = sideA;
	mSideB = sideB;
	mSideC = sideC;
	sumAB = mSideA + mSideB;
	sumBC = mSideB + mSideC;
	sumAC = mSideA + mSideC;
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
	} else if (isIsosceles()){
		return "Isosceles";
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

public boolean isIsosceles() {
	if((mSideA == mSideB) || (mSideA == mSideC) || (mSideB == mSideC)) {
		return true;
	} else {
		return false;
	}
}

public boolean isScalene() {
	if (!isEquilateral() && !isIsosceles()){
			return true;
		} else {
			return false;
	}
}

public boolean isTriangle(){
	if ((sumAB > mSideC) && (sumBC > mSideA) && (sumAC > mSideB)){
		return true;
	} else {
		return false;
	}
}

}

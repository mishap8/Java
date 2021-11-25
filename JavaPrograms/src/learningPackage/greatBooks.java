package learningPackage;

public class greatBooks {

	private int noOfCopies;

	public greatBooks(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void setNoOfCopies(int noOfCopies) {
		if (noOfCopies >= 0) {
			this.noOfCopies = noOfCopies;
		} else
			System.out.println("No Of copies cannot be set");
	}

	int getNoOfCopies() {
		return this.noOfCopies;
	}

	public void increaseCopies(int increaseCount) {
		setNoOfCopies(this.noOfCopies + increaseCount);
	}

	public void decreaseCopies(int decreaseCount) {
		setNoOfCopies(this.noOfCopies - decreaseCount);
	}

}
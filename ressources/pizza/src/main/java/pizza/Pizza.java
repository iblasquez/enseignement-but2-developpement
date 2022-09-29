package pizza;

public class Pizza {

	public static final int COOKED = 0;
	public static final int BAKED = 1;
	public static final int DELIVERED = 2;

	private String name;

	int state = COOKED;

	public boolean bake() {

		if (state == COOKED) {
			state = BAKED;
		} else if (state == BAKED) {
			return false; // Can't bake a pizza already baked !
		} else if (state == DELIVERED) {
			return false; // Can't bake a pizza already delivered !
		}

		return true;

	}

	public boolean deliver() {

		if (state == COOKED) {
			return false; // Can't deliver a pizza not baked yet;
		} else if (state == BAKED) {
			state = DELIVERED;
		} else if (state == DELIVERED) {
			return false; // Can't deliver a pizza already delivered;
		}

		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}

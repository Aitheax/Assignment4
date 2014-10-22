package Assignment4;

public class Room {
	// The member variables.
	String color;
	String floor;
	int windows;

	// The constructor.
	public Room(){
		color = "yellow";
		floor = "hard wood";
		windows = 1;
	}
	public Room(String color, String floor, int number) {
		color = "purple";
		floor = "hardwood";
		windows = 0;
	}

	public String getcolor() {
		return color;
	}

	public String getfloor() {
		return floor;
	}

	public int getwindows() {
		return windows;
	}

	public void setcolor(String newcolor) {
		this.color = newcolor;
	}

	public void setfloor(String newfloor) {
		this.floor = newfloor;
	}

	public void setwindows(int newwindows) {
		this.windows = newwindows;
	}
	public String toString() {
	return "color:" + getcolor() + " " + "windows:" + getwindows() + " " + "floor:" + getfloor();
	}
}
package Assignment4;
public class RoomDemo{
public static void main(String[] args) {
/**
* @author Aitheax
* 8/22/2014
* This is the class to accompany Room.java
*/
//RoomA
Room RoomA = new Room();
RoomA.setcolor("yellow");
RoomA.setfloor("wood");
RoomA.setwindows(1);
System.out.println(RoomA.toString());
//RoomB
Room RoomB = new Room();
RoomB.setcolor("purple");
RoomB.setfloor("tiled");
RoomB.setwindows(0);
System.out.println(RoomB.toString());
//RoomC
Room RoomC = new Room();
RoomC.setcolor("white");
RoomC.setfloor("carpeted");
RoomC.setwindows(3);
System.out.println(RoomC.toString());
}
}
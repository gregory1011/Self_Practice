package day15_Loops;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Want to reserve a room? Yes/No");
        String room = input.next().toLowerCase();

        while ( ! ( room.equals("yes") || room.equals("no") ) ) {
            System.err.println("Invalid entry, please provide a valid entry");
            room = input.next().toLowerCase();

            if (room.equals("no")) {
                System.out.println("have a great day");
                return;
            }
        }

        input.nextLine();

              System.out.println("Which type of room you want to reserve? \nKing Bed\nQueen Bed\nSingle Bed");
                String roomType = input.nextLine().toLowerCase().trim();

                while ( ! ( roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed"))){
                    System.err.println("Invalid room type, please try again");
                    roomType = input.nextLine().toLowerCase().trim();
                }

        String res = roomType + " ==> ";
        res += (roomType.equals("king bed")) ? "120$" : (roomType.equals("queen bed")) ? "100$" : "80$";

        System.out.println(res);






    }
}

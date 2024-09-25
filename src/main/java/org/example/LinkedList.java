package org.example;

public class LinkedList {
    private Node head;  // Head of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end
    public void insertAtEnd(Node head, String data) {

        //makes a new node with the given value
        Node newNode = new Node(data);

        //if the list is empty, make the new node the head
        if(this.head == null)
            this.head = newNode;

        Node currentNode = this.head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        //this would set the currentNode to the newNode, aka to the end
        currentNode.next = newNode;



    }

    // Method to update a specific position in the list
    public void updatePosition(int position, String data) {

        if (position <= 0 || position > 9){
            System.out.println("Invalid position, try again");
        }
        int currentPosition = 1; // to keep track of the spot
        Node currentNode = head;// makes the tracker equal to the head to start


        while(currentNode != null){
            if(currentPosition == position)
                currentNode.data = data;

            currentPosition++;
            currentNode = currentNode.next;

        }


    }

    // Method to get the value at a specific position
    public String getPositionValue(int position) {
        if (position <= 0 || position > 9){
        return "Invalid position, try again";
    }
        int currentPosition = 1; // to keep track of the spot
        Node currentNode = head;// makes the tracker equal to the head to start

        Node positionWantedNode = null;

        while(currentNode != null){
            if(currentPosition == position)
                positionWantedNode = currentNode;

            currentPosition++;
            currentNode = currentNode.next;

        }
        if(positionWantedNode != null)
        return positionWantedNode.data;
        else
            return "No data inside of the node"
;
    }

    // Method to display the Tic Tac Toe board
    public void displayBoard() {
        //would like to start traversing from the head
        Node currentNode = head;
        int counterForSpace = 0;
        //traverses until it points at null
        while(currentNode != null){

            if(counterForSpace % 3 == 0)//after 3 turns of printing, it should skip line
                System.out.println();

            //if it is null, print something as a placeholder so the player can see the bored
            if(currentNode.data == null)
                System.out.print(" * ");

            else
                System.out.println(" " + currentNode.data + " ");

            currentNode = currentNode.next;//will go to the next node
            counterForSpace++;//changes the space counter
        }

    }

    // Method to check for a win
    public boolean checkWinCondition(String playerTurn) {

        //what I would like to do is split this into 8 if statement checks
        //I would keep checking the count, then im going to keep track of 3 different nodes
        // it's going to iterate through the linked list 8 different times
        // will check a new win condition each time
        //changed the signature, so it would split the amount of if statements in half
        Node currentNode = head;
        int iteration_tracker = 1;

        while(iteration_tracker < 9){

            while(currentNode != null){
                if(currentNode.data == playerTurn && (iteration_tracker==1)){
                   // if(currentNode.data)
                }
            }




        }



        return false;
    }

    // Method to check if the board is full (for draw condition)
    public boolean isBoardFull() {
        int fullCounter = 0;
        Node currentNode = head;
        while (currentNode!= null) {

            if (currentNode.data.equals("X") || currentNode.data.equals("O"))
                fullCounter++;

            currentNode = currentNode.next;

        }
        if(fullCounter == 9)
            return true;
        else
            return false;
    }

    // Method to reset the board
    public void resetBoard() {

        Node currentNode = head;
        while(head.data != null) {
            while (currentNode.data != null) {
                currentNode.data = null;
                currentNode = currentNode.next;
            }
        }

    }
}

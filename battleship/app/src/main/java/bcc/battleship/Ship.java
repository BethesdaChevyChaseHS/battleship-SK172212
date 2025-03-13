package bcc.battleship;

public class Ship {

    private int row;
    private int col;
    private int length;
    private int direction;
    // Constructor. Create a ship and set the length.
    public Ship(int length) {
        direction = Constants.UNSET;
        row = Constants.UNSET;
        col = Constants.UNSET;
        this.length = length;
    }

    // Has the location been initialized
    public boolean isLocationSet() {
        if(row == Constants.UNSET || col == Constants.UNSET)
        {
            return false;
        }
        else{
            return true;
        }
        
    }

    // Has the direction been initialized
    public boolean isDirectionSet() {
        if(direction == Constants.UNSET)
        {
            return false;
        }
        else{
            return true;
        }
        
    }

    // Set the location of the ship
    public void setLocation(int row, int col) {
       this.row = row;
       this.col = col;
    }

    // Set the direction of the ship
    public void setDirection(int direction) {
       this.direction = direction;
    }

    // Getter for the row value
    public int getRow() {
        return row;
    }

    // Getter for the column value
    public int getCol() {
        return col;
    }

    // Getter for the length of the ship
    public int getLength() {
        return length;
    }

    // Getter for the direction
    public int getDirection() {
        return direction;
    }

    // Helper method to get a string value from the direction
    // Helper method to get a string value from the direction
    private String directionToString() {
        if (direction == Constants.HORIZONTAL)
        {
            return "horizontal";
        }
        else if(direction == Constants.VERTICAL)
        {
          return "vertical";
        }
        else{
            return "unset direction";
        }
        
    }

    // Helper method to get a (row, col) string value from the location
    private String locationToString() {
        if (isLocationSet())
    {
        return "("+row+", "+col+")";
    }
        return "(unset location)";
    }

    // toString value for this Ship
    @Override
    public String toString() {
        return directionToString()+ " ship of length "+ getLength() +" at "+ locationToString();
    }
}
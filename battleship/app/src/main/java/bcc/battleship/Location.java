package bcc.battleship;

public class Location {
    // Instance variables
    private int status;
    private boolean containsShip;
    // Constructor. Initializes with no ship and status UNGUESSED.
    public Location() {
       status = Constants.UNGUESSED;
       containsShip = false;
    }

    // Was this Location a hit?
    public boolean checkHit() {
        return status == Constants.HIT;
    }

    // Was this location a miss?
    public boolean checkMiss() {
       return status == Constants.MISSED;
    }

    // Was this location unguessed?
    public boolean isUnguessed() {
        return status == Constants.UNGUESSED;
    }

    // Mark this location as a hit.
    public void markHit() {
       status = Constants.HIT;
    }

    // Mark this location as a miss.
    public void markMiss() {
       status = Constants.MISSED;
    }

    // Return whether or not this location has a ship.
    public boolean hasShip() {
        return containsShip;
    }

    // Set whether this location has a ship.
    public void setShip(boolean val) {
      containsShip = val;
    }

    // Set the status of this Location.
    public void setStatus(int status) {
       this.status = status;
    }

    // Get the status of this Location.
    public int getStatus() {
        return status;
    }
}

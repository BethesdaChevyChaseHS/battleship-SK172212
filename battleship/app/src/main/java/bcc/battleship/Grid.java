package bcc.battleship;

public class Grid {
    
    private Location[][] board;
    
    // Create a new Grid and initialize each Location.
    public Grid() {
        board = new Location[10][10];
        for(int i =0; i< board.length;i++)
        {
          for (int j =0; j <board[0].length;j++)
          {
            board[i][j] = new Location();
          }
        }
    }
    
    // Mark a hit in the specified location.
    public void markHit(int row, int col) {
       board[row][col].markHit() ;
    }
    
    // Mark a miss in the specified location.
    public void markMiss(int row, int col) {
        board[row][col].markMiss();
    }
    
    // Set the status of the Location at (row, col).
    public void setStatus(int row, int col, int status) {
        board[row][col].setStatus(status);
    }
    
    // Get the status of the Location at (row, col).
    public int getStatus(int row, int col) {
        return board[row][col].getStatus();
    }
    
    // Return whether this Location has already been guessed.
    public boolean alreadyGuessed(int row, int col) {
        return !board[row][col].isUnguessed();
    }
    
    // Set whether there is a ship at this location.
    public void setShip(int row, int col, boolean val) {
        board[row][col].setShip(val);
    }
    
    // Return whether there is a ship at this location.
    public boolean hasShip(int row, int col) {
        return board[row][col].hasShip();
    }
    
    // Get the Location object at this row and column.
    public Location get(int row, int col) {
        return board[row][col];
    }
    
    // Return the number of rows.
    public int numRows() {
        return board.length;
    }
    
    // Return the number of columns.
    public int numCols() {
        return board[0].length;
    }
    

    //maybe convert to boolean?
    public boolean addShip(Ship s) {
 
        int row = s.getRow();
        int col = s.getCol();
        if(s.getDirection()== Constants.HORIZONTAL){
            for(int i =0;i<s.getLength();i++){
                if(!board[row][col+i].hasShip() && col+s.getLength() < board[0].length)
                {
                    board[row][col+i].setShip(true);
                }
                else{
                    return false;
                }
            }
            return true;
        }
        if(s.getDirection()== Constants.VERTICAL){
            for(int i =0;i< s.getLength();i++){
               if(!board[row+i][col].hasShip() && row+ s.getLength() < board.length)
               {
                  board[row+i][col].setShip(true);
               }
               else{
                return false;
               }
            }
            return true;
        }
       return false;
    }
    


    public boolean allShipsSank(){
      for(int i =0; i<board.length;i++)
      {
        for(int j =0;j<board[0].length;j++)
        {
          if(board[i][j].hasShip() && !board[i][j].checkHit())
          {
             return false;
          }
        }
      }
        return true;
    
}
}

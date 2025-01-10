public enum Direction {
  EAST(90, 1),
  SOUTH(180, 2), 
  WEST(270, -1),
  NORTH(360, -2),
  ;

  private final int a;
  private final int value;

  private Direction (int a, int value){
    this.a = a;
    this.value = value;
  }
  public int getA(){
    return this.a;
  }

  // public int getValue(){
  //   return this.value;
  // }
  public Direction oppsite(){
    for (Direction d : values()){
      if (d.value == this.value * -1)
      return d;
    }return null;
  }



  public static void main(String[] args) {
    Direction.EAST.getA();
    //return Direction.EAST.oppsite() -> Direction SOUTH
    // public Direction oppsite(Direction direction){
    //   switch(direction){
    //     case EAST:
    //     return Direction.WEST;
    //     case SOUTH:
    //     return Direction.NORTH;
    //     case WEST:
    //     return Direction.EAST;
    //     case NORTH:
    //     return Direction.SOUTH;
    //   }
      
    //   }

    
  }


}

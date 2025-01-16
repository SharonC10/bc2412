public enum SysError {
  INVALID_USERNAME("Invalid User Name."),
  INVALID_PASSWORD("Invalid Password."),
  ;

  private String desc; //attratube

  private SysError(String desc){ //construtor 
    this.desc = desc;
  }

  public String getDesc(){ //gettter
    return this.desc;
  }

}

public class MTR {
  private String stationName;
  private boolean transferStation;
  private boolean mtrMall;

  public MTR(String stationName, boolean transferStation, boolean mtrMall) {
    this.stationName = stationName;
    this.transferStation = transferStation;
    this.mtrMall = mtrMall;
  }

  public String getStationName() {
    return this.stationName;
  }

  public boolean getTransferStation() {
    return this.transferStation;
  }

  public boolean getMtrMall() {
    return this.mtrMall;
  }

  //Setter
  public void setStationName(String stationName){
    this.stationName = stationName;
  }

  public static void main(String[] args) {
    MTR m1 = new MTR("Tsing Yi", true, true);
    System.out
        .println("Station Name:" + m1.getStationName() + " Transfer Station:"
            + m1.getTransferStation() + " MTR Mall:" + m1.getMtrMall());
MTR m2 = m1;

m1.setStationName("Sha Tin");
System.out.println("Station Name:" + m1.getStationName());

  }
}

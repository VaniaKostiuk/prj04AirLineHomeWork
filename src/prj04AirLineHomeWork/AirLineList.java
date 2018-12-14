package prj04AirLineHomeWork;

public class AirLineList {
	private AirLine [] airLines ;
	private int count ;
	
	public AirLineList () {
		airLines = new AirLine[10];
		count=-1;
	}
	public void add(AirLine airLine){
		airLines[++count] = airLine ;	
	}
	public AirLine get(int i){
		return airLines[i];
	}
	public int size(){
		return count+1;
	}
	public void print() {
		for (int i = 0; i < size(); i++) {
		System.out.println(airLines[i]);
		}
	}
	//(getFligthsByDestination) список рейсов для заданного пункта назначения;
	//(getFlightsByDate) список рейсов для заданного дня недели;
	//(getFlightsByDateAfterTime) список рейсов для заданного дня недели, время вылета для которых больше заданного.
	
	public AirLineList getFligthsByDestination (String Destination) {    
		AirLineList getFligthsByDestination = new AirLineList ();
		for (int i = 0; i < size(); i++) {
				if(airLines[i].getDestination().equals(Destination)) {
					System.out.println(airLines[i]);
				}
			}
		return getFligthsByDestination ;
	}
	
	public AirLineList getFlightsByDate (int DayWeek) {    
		AirLineList getFlightsByDate = new AirLineList ();
		for (int i = 0; i < size(); i++) {
				if(airLines[i].getDayWeek()==DayWeek) {
					System.out.println(airLines[i]);
				}
			}
		return getFlightsByDate ;
	}
	
	public AirLineList getFlightsByDateAfterTime (int DayWeek, int DepartureTime) {    
		AirLineList getFlightsByDate = new AirLineList ();
		for (int i = 0; i < size(); i++) {
				if(airLines[i].getDayWeek()==DayWeek && airLines[i].getDepartureTime()>DepartureTime ) {
					System.out.println(airLines[i]);
				}
			}
		return getFlightsByDate ;
	}
}

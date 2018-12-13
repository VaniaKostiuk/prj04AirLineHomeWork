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
	// Название методов : (aaa,bbb,ccc) :	
	//aaa) список рейсов для заданного пункта назначения;
	//bbb) список рейсов для заданного дня недели;
	//ccc) список рейсов для заданного дня недели, время вылета для которых больше заданного.
	
	//aaa) список рейсов для заданного пункта назначения;
	public AirLineList aaa (String Destination) {    
		AirLineList aaa = new AirLineList ();
		for (int i = 0; i < size(); i++) {
				if(airLines[i].getDestination().equals(Destination)) {
					System.out.println(airLines[i]);
				}
			}
		return aaa ;
	}
	//bbb) список рейсов для заданного дня недели;
	public AirLineList bbb (int DayWeek) {    
		AirLineList bbb = new AirLineList ();
		for (int i = 0; i < size(); i++) {
				if(airLines[i].getDayWeek()==DayWeek) {
					System.out.println(airLines[i]);
				}
			}
		return bbb ;
	}
	//ccc) список рейсов для заданного дня недели, время вылета для которых больше заданного.
	public AirLineList ccc (int DayWeek, int DepartureTime) {    
		AirLineList ccc = new AirLineList ();
		for (int i = 0; i < size(); i++) {
				if(airLines[i].getDayWeek()==DayWeek && airLines[i].getDepartureTime()>DepartureTime ) {
					System.out.println(airLines[i]);
				}
			}
		return ccc ;
	}
}

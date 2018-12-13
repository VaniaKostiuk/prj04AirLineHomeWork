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
	// �������� ������� : (aaa,bbb,ccc) :	
	//aaa) ������ ������ ��� ��������� ������ ����������;
	//bbb) ������ ������ ��� ��������� ��� ������;
	//ccc) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
	
	//aaa) ������ ������ ��� ��������� ������ ����������;
	public AirLineList aaa (String Destination) {    
		AirLineList aaa = new AirLineList ();
		for (int i = 0; i < size(); i++) {
				if(airLines[i].getDestination().equals(Destination)) {
					System.out.println(airLines[i]);
				}
			}
		return aaa ;
	}
	//bbb) ������ ������ ��� ��������� ��� ������;
	public AirLineList bbb (int DayWeek) {    
		AirLineList bbb = new AirLineList ();
		for (int i = 0; i < size(); i++) {
				if(airLines[i].getDayWeek()==DayWeek) {
					System.out.println(airLines[i]);
				}
			}
		return bbb ;
	}
	//ccc) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
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

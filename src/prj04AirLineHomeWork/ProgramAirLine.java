package prj04AirLineHomeWork;


public class ProgramAirLine {

	public static void main(String[] args) {
		// �������� ������� : (aaa,bbb,ccc) :	
		//aaa) ������ ������ ��� ��������� ������ ����������;
		//bbb) ������ ������ ��� ��������� ��� ������;
		//ccc) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
		
		AirLineList airLineList = new AirLineList () ;
		airLineList.add(new AirLine ("kiev", 0001, "boing", 100, 1));
		airLineList.add(new AirLine ("odessa", 0010, "boing2", 250, 2));
		airLineList.add(new AirLine ("minsk", 0012, "boing", 200, 1));
		
		AirLineList DestinationList = airLineList.aaa("kiev");
		DestinationList.print();
		System.out.println("***********************");
		
		AirLineList DayWeekList = airLineList.bbb(1);
		DayWeekList.print();
		System.out.println("***********************");
		
		AirLineList DayWeekMoreDepartureTimeList = airLineList.ccc(1,110);
		DayWeekMoreDepartureTimeList.print();
		System.out.println("***********************");
	}

}

package prj04AirLineHomeWork;


public class ProgramAirLine {

	public static void main(String[] args) {
		//(getFligthsByDestination) список рейсов для заданного пункта назначения;
		//(getFlightsByDate) список рейсов для заданного дня недели;
		//(getFlightsByDateAfterTime) список рейсов для заданного дня недели, время вылета для которых больше заданного.
		
		AirLineList airLineList = new AirLineList () ;
		airLineList.add(new AirLine ("kiev", 0001, "boing", 100, 1));
		airLineList.add(new AirLine ("odessa", 0010, "boing2", 250, 2));
		airLineList.add(new AirLine ("minsk", 0012, "boing", 200, 1));
		
		AirLineList DestinationList = airLineList.getFligthsByDestination("kiev");
		DestinationList.print();
		System.out.println("***********************");
		
		AirLineList DayWeekList = airLineList.getFlightsByDate(1);
		DayWeekList.print();
		System.out.println("***********************");
		
		AirLineList DayWeekMoreDepartureTimeList = airLineList.getFlightsByDateAfterTime(1,110);
		DayWeekMoreDepartureTimeList.print();
		System.out.println("***********************");
	}

}

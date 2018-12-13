package prj04AirLineHomeWork;

public class AirLine {
	
/*Airline: ѕункт назначени€, Ќомер рейса, “ип самолета, ¬рем€ вылета, ƒни
недели.
—оздать массив объектов. ¬ывести:
a) список рейсов дл€ заданного пункта назначени€;
b) список рейсов дл€ заданного дн€ недели;
c) список рейсов дл€ заданного дн€ недели, врем€ вылета дл€ которых
больше заданного.
*/
	private String Destination ;
	private int FlightNumber ;
	private String TypePlain ;
	private int DepartureTime ;  //¬рем€ вылета указываем 4-х знач. формате по типу -  0122 (01:22) < 1545 (15:45). дл€ дальнейшего сравнени€ в методе
	private int DayWeek ;		// как сделать поле в котором ми будем задавать несколько дней а не один и дальше сравнивать в методе  ?
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public int getFlightNumber() {
		return FlightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		FlightNumber = flightNumber;
	}
	public String getTypePlain() {
		return TypePlain;
	}
	public void setTypePlain(String typePlain) {
		TypePlain = typePlain;
	}
	public int getDepartureTime() {
		return DepartureTime;
	}
	public void setDepartureTime(int departureTime) {
		DepartureTime = departureTime;
	}
	public int getDayWeek() {
		return DayWeek;
	}
	public void setDayWeek(int dayWeek) {
		DayWeek = dayWeek;
	}
	public AirLine(String destination, int flightNumber, String typePlain, int departureTime, int dayWeek) {
		super();
		Destination = destination;
		FlightNumber = flightNumber;
		TypePlain = typePlain;
		DepartureTime = departureTime;
		DayWeek = dayWeek;
	}
	@Override
	public String toString() {
		return "AirLine [Destination=" + Destination + ", FlightNumber=" + FlightNumber + ", TypePlain=" + TypePlain
				+ ", DepartureTime=" + DepartureTime + ", DayWeek=" + DayWeek + "]";
	}
	
	
}

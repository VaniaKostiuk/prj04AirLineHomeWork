package prj04AirLineHomeWork;

public class AirLine {
	
/*Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ���
������.
������� ������ ��������. �������:
a) ������ ������ ��� ��������� ������ ����������;
b) ������ ������ ��� ��������� ��� ������;
c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� �������
������ ���������.
*/
	private String Destination ;
	private int FlightNumber ;
	private String TypePlain ;
	private int DepartureTime ;  //����� ������ ��������� 4-� ����. ������� �� ���� -  0122 (01:22) < 1545 (15:45). ��� ����������� ��������� � ������
	private int DayWeek ;		// ��� ������� ���� � ������� �� ����� �������� ��������� ���� � �� ���� � ������ ���������� � ������  ?
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

package logicalprograms;

import java.time.temporal.ChronoUnit;

import java.time.*;

public class ElapsedTime {
	public static void main(String[] args){
		LocalTime StartTime = LocalTime.of(19, 21, 40);
		LocalTime StopTime = LocalTime.of(21, 22, 00);
		long hours = ChronoUnit.HOURS.between(StartTime, StopTime);
		long minutes = ChronoUnit.MINUTES.between(StartTime, StopTime);
		long seconds = ChronoUnit.SECONDS.between(StartTime, StopTime);
		long toConvertInMinutes = minutes % 60;
		long toconvertInsecond = seconds % 60;
		System.out.println("Difference is " + hours + " hours " + toConvertInMinutes + " minutes " + toconvertInsecond
				+ " seconds.");
	 }
}

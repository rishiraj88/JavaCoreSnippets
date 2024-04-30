//java8 Date/Time/Calendar samples:
// All time treasure, full of gold
class DateTimeCalendar {

// immutability sample
LocalDate date1 = LocalDate.of(2017, 1, 31);
Period period1 = Period.ofMonths(1);date1.plus(period1);

Sysout(date1);
LocalDate date2 = date1.plus(period1);
sysout(date2);

//LocalDate getinstance methods
from()
now() //3
of() //2
ofEpochDay()
ofYearDay()
parse() //2

LocalDateTime.of(nowDate,nowTime);

LocalDate.of(2012,08,12);
LocalDate.parse("2021-10-12");

LocalTime.of(9,6,43);
LocalTime.parse("10:19:36");

DateTimeFormatter formatter = DateTimeFormatter.ofPattern(strFormat); //"yyyy-MM-dd"
LocalDateTime dt = LocalDateTime.parse(strDT,formatter); //"2021-10-12","yyyy-MM-dd"
LocalDateTime.plusHours();
LocalDateTime.plusDays();
LocalDateTime.getDayOfWeek(); //MONDAY

ldt.format(formatter); // return String


ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("US/Pacific"));

Set<String> zoneIds = ZoneId.getAvailableZoneIds();
List<String> zoneList= new ArrayList<String>(zoneIds);
Collections.sort(zoneList);
for(String zoneId : zoneList) {
	if(zoneId.contains("US")) {
		System.out.println(zoneId);
	}
}

ZoneId pzId = ZoneId.of("US/Pacific");
pzId.getRules().isDaylightSavings(zdt.toInstant()); //returns boolean

zdt.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));

ZonedDateTime totalityAustin = ZonedDateTime.of(2024,4,8 ,13,35,56,0 ,ZoneId.of("US/Central"));
new String(Period.ofMonths(1)); //P1M
ZonedDateTime reminder = totalityAustin.minus(Period.ofMonths(1));
reminder.withZoneSameInstant(ZoneId.of("US/Pacific"));

long longMins = ChronoUnit.MINUTES.between(lt1,lt2); //returns long
Duration pt = Duration.ofMinutes(longMins); //period to time
sysout(pt); //PT1H18M
// P signifies period, T signifies time. Hence PT signifies 'period of time'.

LocalTime.plus(ptDurationOrPeriod); //takes TemporalAmount
LocalTime.plusMinutes(longMins);

Instant totalityInstant = zdt.toInstant();
sysout(totalityInstant); //2024-04-08T18:35:56Z

long lMins = ChronoUnit.MINUTES.between(inst1,inst2);

Instant inst = Instant.now();

totalityAustin.minus(Period.ofDays(3)).getDayOfWeek();
zdt.plusHours(n);
zdt.isBefore(zdt2);
zdt.toLocalDate().isLeapYear();

zdt.format(formatter);

DateTimeFormatter formatter = DateTimeFormatter.ofPattern(""); //"yyyy-MM-dd"

DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(
FormatStyle.SHORT //OR FormatStyle.MEDIUM
)
.withLocale(Locale.UK);

OffsetDateTime.of(ldt,ZoneOffset.of("-05:00"));

Instant inst = ldt.toInstant(ZoneOffset.of("+5"));

java.util.Locale loc = Locale.getDefault();
Locale loc = new Locale(strLang);
Locale loc = new Locale(strLang, strCountry);

ResourceBundle rb = ResourceBundle.getBundle("RB",loc);
rb.getString("ride.in");

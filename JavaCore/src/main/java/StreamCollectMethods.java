import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author rishiraj
 * 20211117
 * to demonstrate various collection methods of Stream API.
 */

public class StreamCollectMethods {
	public static void main(String[] args) {
		
		List<Person> pList = List.of(new Person("Bone",22)
		,new Person("Anne",11)
		,new Person("Chad",33)
		,new Person("Elena",55)
		,new Person("Frank",66)
		,new Person("Dan",44)		); 
		
		//.collect(Collectors.toList())
		//List<Person> java.util.stream.Stream.collect(Collector<? super Person, Object, List<Person>> collector)
		pList.stream().collect(Collectors.toList());
		
		//.collect(Collectors.toCollection(::new));
		//ArrayList<Person> java.util.stream.Stream.collect(Collector<? super Person, Object, ArrayList<Person>> collector)
		pList.stream().collect(Collectors.toCollection(ArrayList::new));
		
		//.collect(Collectors.groupingBy(Person::age));
		//Map<Integer, List<Person>> java.util.stream.Stream.collect(Collector<? super Person, Object, Map<Integer, List<Person>>> collector)
		pList.stream().collect(Collectors.groupingBy(Person::age));
		
		//.collect(Collectors.groupingBy(Person::age,Collectors.counting()));
		//Map<Integer, Long> java.util.stream.Stream.collect(Collector<? super Person, Object, Map<Integer, Long>> collector)
		pList.stream().collect(Collectors.groupingBy(
				Person::age	,Collectors.counting()
				));
		
		/*.collect(Collectors.groupingBy(Person::age,
				Collectors.mapping(
					Person::name,
					Collectors.toList()
				)));*/
		//Map<Integer, List<String>> java.util.stream.Stream.collect(Collector<? super Person, Object, Map<Integer, List<String>>> collector)
		pList.stream().collect(Collectors.groupingBy(
				Person::age	,Collectors.mapping(Person::name, Collectors.toList())
				));
		
		//.collect(Collectors.partitioningBy(p -> p.age()>43));
		// Map<Boolean, List<Person>> java.util.stream.Stream.collect(Collector<? super Person, Object, Map<Boolean, List<Person>>> collector)
		pList.stream().collect(Collectors.partitioningBy(p -> p.age()>23));
		
		//.collect(Collectors.groupingBy(Person::age,Collectors.summingInt(Person::age)));
		//Map<Integer, Integer> java.util.stream.Stream.collect(Collector<? super Person, Object, Map<Integer, Integer>> collector)
		pList.stream().collect(Collectors.groupingBy(
				Person::age	,Collectors.summingInt(Person::age)
				));
		
		//.collect(Collectors.groupingBy(Person::age,Collectors.averagingInt(Person::age)));
		//Map<Integer, Double> java.util.stream.Stream.collect(Collector<? super Person, Object, Map<Integer, Double>> collector)
		pList.stream().collect(Collectors.groupingBy(
				Person::age	,Collectors.averagingInt(Person::age)
				));
		
		//.collect(Collectors.counting());
		//<Long, Object> Long java.util.stream.Stream.collect(Collector<? super Person, Object, Long> collector)
		pList.stream().collect(Collectors.counting());
		
		//.collect(Collectors.joining("'"));
		//<String, ?> String java.util.stream.Stream.collect(Collector<? super String, ?, String> collector)
		pList.stream().map(p -> p.name()).collect(Collectors.joining(" with "));
		
		//.collect(Collectors.maxBy( (a1,a2) -> a1.age() - a2.age() ));
		//<Optional<Person>, Object> Optional<Person> java.util.stream.Stream.collect(Collector<? super Person, Object, Optional<Person>> collector)
		pList.stream().collect(
				Collectors.maxBy(
							(p1,p2) -> p1.age() - p2.age()
						)
				);
		
		List<String> list = new ArrayList<String>();
		list.sort(Comparator.comparing(String::toString));
		
	}
}
// Java 14 record type
record Person(String name, int age) {}

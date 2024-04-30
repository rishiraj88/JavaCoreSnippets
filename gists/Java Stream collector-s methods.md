.collect(Collectors.toCollection(::new));

.collect(Collectors.groupingBy(Person::getAge));

.collect(Collectors.groupingBy(Person::getAge,
	Collectors.counting()));

.collect(Collectors.groupingBy(Person::getAge,
	Collectors.mapping(
		Person::getName,
		Collectors.toList()
	)));

.collect(Collectors.partitioningBy(p -> p.getAge()>43));

.collect(Collectors.groupingBy(Person::getAge,
	Collectors.summingInt(Person::getAge)));

.collect(Collectors.groupingBy(Person::getAge,
	Collectors.averagingInt(Person::getAge)));

.collect(Collectors.counting());
.map(p -> p.getName()).collect(Collectors.joining("'"));

.collect(Collectors.maxBy( (a1,a2) -> a1.getAge() - a2.getAge() ));



package practise.jdk8.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericsDemo<T> {

	public static <T> List<T> fromArrayToList(T[] a) {
		return Arrays.stream(a).collect(Collectors.toList());
	}

	public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
		return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
	}
	//Bounded Generics
	public static <T extends Number> List<T> fromArrayToList(T[] a,String type) {
		return Arrays.stream(a).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Object[] objArray = {"Java","Scala","Spring"};
		GenericsDemo.fromArrayToList(objArray, Object::toString).forEach(System.out::println);
		GenericsDemo.fromArrayToList(objArray).forEach(System.out::println);
		GenericsDemo.fromArrayToList(intArray,Optional.empty().toString()).forEach(System.out::println);

	}

}

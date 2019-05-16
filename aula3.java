package aula3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;

public class aula3 {

	public static void main(String[] args) {
		
		List<Integer> randomNumbers = Arrays.asList(new Random().nextInt(100),new Random().nextInt(100),new Random().nextInt(100),new Random().nextInt(100));
		
		Iterator itr1 = randomNumbers.iterator();
		
		Iterator iterator = randomNumbers.iterator();
         while ( iterator.hasNext()){
             System.out.println(iterator.next());
         }
		Collections.sort(randomNumbers);
		Collections.reverse(randomNumbers);
		
		ListIterator<Integer> iterator2 = randomNumbers.listIterator();
		 while (iterator2.hasNext()){
             System.out.println(iterator2.next());
         }
        while (iterator2.hasPrevious()){
            System.out.println(iterator2.previous());
        }
             
        
    Map<Integer, String> teste = new HashMap<>();

    teste.put(1, "");
    teste.put(2, "2323");
        
        
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> twoEvenSquares = numbers.stream()
		           .filter(n -> {
		                    System.out.println("filtering even" + n); 
		                    return n % 2 == 0;
		                  })
		           .map(n -> {
		                    System.out.println("mapping " + n);
		                    return n * n;
		                  })
		           .collect((Collectors.toList()));*/
		
		String text ="Leicester’s incredible season continues – they’re now five points clear at the top of the Premier League after this convincing victory";
		List<String> textList = Arrays.asList(text.split(" "));
		toUpperCase(textList);
		filterSmallWords(textList);
		matchTWords(textList);
	}

	public static void toUpperCase(List<String> collection) {
        collection.stream() // Convert collection to Stream
                .map(String::toUpperCase) // Convert each element to upper case
                //.collect(toList()) // Collect results to a new list
        		.forEach(s -> System.out.println(s));
    }
	
	public static void filterSmallWords(List<String> collection) {
        collection.stream() // Convert collection to Stream
                .filter(s -> s.length() <= 5) //
                //.collect(toList()) // Collect results to a new list
        		.forEach(s -> System.out.println(s));
    }
	
	public static void matchTWords(List<String> collection) {
        collection.stream() // Convert collection to Stream
        		.filter(s -> s.length() > 5)
                //.collect(toList()) // Collect results to a new list
        		.forEach(s -> System.out.println(s));
    }
}

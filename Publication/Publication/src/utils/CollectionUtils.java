package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

import com.app.core.Book;
import com.app.core.Publication;
import com.app.core.Tape;

import custom_exception.PublicationException;

public interface CollectionUtils {
	static Map<Integer, Publication> populateMap() {
		HashMap<Integer, Publication> pubMap = new HashMap<>();
		//String title, int price, LocalDate publishDate, int rating, int playTime/pgNo
		pubMap.put(1, new Book("Pearson", 200, LocalDate.parse("2016-02-12"), 8, 400));
		pubMap.put(5, new Tape("dreamtech", 500, LocalDate.parse("2023-02-12"), 7, 50));
		pubMap.put(2, new Book("wiley ", 800, LocalDate.parse("2015-03-22"), 9, 380));
		pubMap.put(4, new Book("Atul", 250, LocalDate.parse("2023-02-08"), 4, 497));
		pubMap.put(3, new Tape("Krupa", 650, LocalDate.parse("2016-12-02"), 10, 160));
		return pubMap;
	}
	
	static void displayBookByPublishDate(Map<Integer, Publication> pubMap) {
		//list book publications ordered by publish date in desc
		pubMap.values()
		.stream()
		.filter(p -> p instanceof Book)
		.sorted((b1, b2) -> b2.getPublishDate().compareTo(b1.getPublishDate()))
		.forEach(System.out::println);
	}
	
	static void removeOldPublication(Map<Integer, Publication> pubMap) {
		//remove all 5 year old publications
		Iterator<Publication> itr = pubMap.values().iterator();
		while(itr.hasNext()) {
			Publication pub = itr.next();
			if((Period.between(pub.getPublishDate(), LocalDate.now())).getYears() > 5) {
				itr.remove();
			}
		}
		System.out.println("Publication details");
		pubMap.forEach((k,v) -> System.out.println(v));
	}

	static void displayTopPubByRating(Map<Integer, Publication> pubMap) throws PublicationException {
		//list top 5 publications of current year based on rating
		List<Publication> pubList = pubMap.values()
		.stream()
		.filter(p -> ((Integer)p.getPublishDate().getYear()).equals(LocalDate.now().getYear()))
		.sorted((p1, p2) -> ((Integer)p2.getRating()).compareTo(p1.getRating()))
		.limit(5)
		.collect(Collectors.toList());
		
		if(pubList.size() == 0)
			throw new PublicationException("No such data available");
		pubList.forEach(System.out::println);
	}
}

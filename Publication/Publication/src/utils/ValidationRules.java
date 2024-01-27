package utils;

import java.time.LocalDate;
import java.util.Map;

import com.app.core.Book;
import com.app.core.Publication;
import com.app.core.Tape;

import custom_exception.PublicationException;

public interface ValidationRules {
	////String title, int price, LocalDate publishDate, int rating, int pgCount
	static Book publishBook(String title, int price, String publishDate, int rating, int pgCount,
			Map<Integer, Publication> pubMap) throws PublicationException {
		LocalDate parsedPublishDate = parseAndValidateDate(publishDate);
		if(price <= 0)
			throw new PublicationException("Price must be positive number");
		if(rating < 0 && rating > 10)
			throw new PublicationException("Enter rating between 0 to 10");
		if(pgCount <= 0)
			throw new PublicationException("Enter valid page number");
		return new Book(title, price, parsedPublishDate, rating, pgCount);
	}
	
	static Tape publishTape(String title, int price, String publishDate, int rating, int playTime,
			Map<Integer, Publication> pubMap) throws PublicationException {
		LocalDate parsedPublishDate = parseAndValidateDate(publishDate);
		if(price <= 0)
			throw new PublicationException("Price must be positive number");
		if(rating < 0 && rating > 10)
			throw new PublicationException("Enter rating between 0 to 10");
		if(playTime <= 0)
			throw new PublicationException("Enter valid page number");
		return new Tape(title, price, parsedPublishDate, rating, playTime);
	}

	static LocalDate parseAndValidateDate(String publishDate) throws PublicationException {
		LocalDate dt = LocalDate.parse(publishDate);
		if(dt.isAfter(LocalDate.now()))
			throw new PublicationException("Publication date must not be future date");
		return dt;
	}

	static void chkDupTitle(String title, Map<Integer, Publication> pubMap) throws PublicationException {
		//if(pubMap.containsKey(title))
		//	throw new PublicationException("Title already exists");
		for(Publication p : pubMap.values()) {
			if(p.getTitle().equals(title)) 
				throw new PublicationException("Title already exists");
		}
	}
}

package tester;

import java.util.*;

import static utils.CollectionUtils.*;
import static utils.ValidationRules.*;
import static utils.IOUtils.*;
import com.app.core.Book;
import com.app.core.Publication;
import com.app.core.Tape;

public class PublicationTester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = true;
			Map<Integer, Publication> pubMap = populateMap();

			while (exit) {
				try {
					System.out.println("1. Publish book" + "\n2. Publish tape"
							+ "\n3. list book publications ordered by publish date in desc"
							+ "\n4. list top 5 publications of current year based on rating"
							+ "\n5. remove all 5 year old publications" + "\n0. Exit");
					System.out.println("Enter your choice: ");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter title: ");
						String title = sc.next();
						chkDupTitle(title, pubMap);
						System.out.println("Enter following book details:");
						System.out.println("price, publishDate(yyyy-MM-dd), rating(1-10), pgCount");
						Book book = publishBook(title, sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), pubMap);
						pubMap.put(book.getId(), book);
						System.out.println("Book published...");
						break;
					case 2:
						// String title, int price, LocalDate publishDate, int rating, int pgCount
						System.out.println("Enter title: ");
						title = sc.next();
						chkDupTitle(title, pubMap);
						System.out.println("Enter following tape details:");
						System.out.println("price, publishDate(yyyy-MM-dd), rating(1-10), playTime");
						Tape tape = publishTape(title, sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), pubMap);
						pubMap.put(tape.getId(), tape);
						System.out.println("Tape published...");
						break;
					case 3:
						System.out.println("List of book publications ordered by publish date in desc");
						displayBookByPublishDate(pubMap);
						break;
					case 4:
						System.out.println("List top 5 publications of current year based on rating");
						displayTopPubByRating(pubMap);
						break;
					case 5:
						removeOldPublication(pubMap);
						break;
					case 0:
						System.out.println("Enter file name:");
						sc.nextLine();
						String fileName = sc.nextLine();
						storeData(pubMap, fileName);
						exit = false;
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e.getMessage());
				}
			}
		}
	}

}

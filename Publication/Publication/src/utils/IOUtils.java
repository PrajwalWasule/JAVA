package utils;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Publication;

public interface IOUtils {
	@SuppressWarnings("resource")
	static void storeData(Map<Integer, Publication> pubMap, String fileName) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(pubMap);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

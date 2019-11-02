package enterprise;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.TimeZone;

// I have commented this class because we will not be using this in the real application
// it was just to test my Film Database
public class Controller {
	public static void main(String[] args) {
		/*
		// this little method from Calender class will give us 13 digit unique id whenever the user insertFilm
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		 // so it basically gets the time in miliseconds and however it is always unique
		 // it will be assigned to long because int data type cannot handle 13 digit number
		long filmId = calendar.getTimeInMillis();
		FilmInfo filmDAO= new FilmDAO();
		Film film = new Film(filmId, 2008 ,1900000,"Noman: They Untold Story","Noman Ghous","Biopic","England");
		filmDAO.addFilm(film);
		
		LinkedHashMap<String,Film> filmCollectionMap = new LinkedHashMap<String,Film>();
		filmCollectionMap = filmDAO.listFilm();
		
		for (Film value : filmCollectionMap.values()) {
		
			value.toString();
		    // ...
		}
		**/
	}
}

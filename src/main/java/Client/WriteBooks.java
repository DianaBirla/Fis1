package Client;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteBooks {
	private BookModel book;
	private String username;
	private static JSONArray list = new JSONArray();
	public WriteBooks(BookModel e,String username) {
		book=e;
		this.username=username;
	}
	public void write() {
		JSONObject obj1 = new JSONObject();
		obj1.put("Username", username);
		obj1.put("Titlu",book.getTitlu() );
		list.add(obj1);
	}
	private JSONArray get_list() {
		return list;
	}
}

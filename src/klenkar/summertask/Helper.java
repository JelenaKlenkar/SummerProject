package klenkar.summertask;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Helper {
	public static final String DATE_FORMAT = "dd.MM.yyyy.";

	public static String enterString(String message) {

		String s;
		while (true) {
			s = JOptionPane.showInputDialog(message);

			if (s.trim().length() == 0) {
				JOptionPane.showConfirmDialog(null, "Required field");
				continue;
			}
			return s;
		}

	}

	public static int enterInteger(String message) {
		int i;
		while (true) {
			try {
				i = Integer.parseInt(JOptionPane.showInputDialog(message));
				if (i <= 0) {
					JOptionPane.showConfirmDialog(null, "Number needs to be bigger then zero.");
					continue;
				}
				return i;
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Input of number is required.");
			}
		}

	}

	public static Date enterDate(String message) {
		SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT);
		
		while(true) {
			try {
				return df.parse(JOptionPane.showInputDialog(message));
			}catch(Exception e) {
				JOptionPane.showConfirmDialog(null, "Input must be in format: " + DATE_FORMAT + "\nExample of todays date:"
						+ df.format(new Date()));
			}
		}

	}
}

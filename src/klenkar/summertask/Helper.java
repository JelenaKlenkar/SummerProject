package klenkar.summertask;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Helper {
	public static final String DATE_FORMAT = "dd.MM.yyyy.";
	public static final String TIME_FORMAT = "HH:mm:ss";

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

	public static double enterDouble(String message) {

		DecimalFormat dn = new DecimalFormat("#.##");
		while (true) {
			try {
				return (double) dn.parse(JOptionPane.showInputDialog("message"));

			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Input must be in format: " + "\nExample: 5000.20");

			}
		}
	}

	public static Date enterDate(String message) {
		SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT);

		while (true) {
			try {
				return df.parse(JOptionPane.showInputDialog(message));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Input must be in format: " + DATE_FORMAT
						+ "\nExample of todays date:" + df.format(new Date()));
			}
		}

	}

	public static Date enterTime(String message) {
		SimpleDateFormat tf = new SimpleDateFormat(TIME_FORMAT);
		while (true) {
			try {
				return tf.parse(JOptionPane.showInputDialog(message));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null,
						"Input must be in format: " + TIME_FORMAT + "\nExample of time: 20:12:45");
			}
		}
	}

	public static boolean enterBoolean(String message) {
		int reply = JOptionPane.showConfirmDialog(null, message, "Select Yes or No", JOptionPane.YES_NO_OPTION);
		boolean applicantGotTheJob = false;
		if (reply == JOptionPane.YES_OPTION) {
			applicantGotTheJob = true;

		} else {
			if (reply == JOptionPane.NO_OPTION) {
				applicantGotTheJob = false;
			}

			System.exit(0);
		}

		return applicantGotTheJob;

	}

}

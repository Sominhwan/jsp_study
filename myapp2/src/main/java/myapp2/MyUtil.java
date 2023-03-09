package myapp2;

import java.text.DecimalFormat;

public class MyUtil {
	public static String getMoneyForm(String str) {
		if (str == null)
			return "";

		int offset = str.indexOf(".");
		String work_str = "";
		String nonwork_str = "";

		if (offset > 0) {
			work_str = str.substring(0, offset);
			nonwork_str = str.substring(offset, str.length());
		} else {
			work_str = str;
		}

		DecimalFormat df = new DecimalFormat("###,##0");
		double d = 0.0D;

		try {
			d = Double.valueOf(work_str).doubleValue();
		} catch (Exception e) {
			d = 0.0D;
		}
		return df.format(d) + nonwork_str;
	}
}

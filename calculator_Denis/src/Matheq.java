import java.util.ArrayList;

public class Matheq {

	String fnum = null;
	String lnum = null;
	String total = null;

	public Matheq(String mathoperation) {

		

		mathoperation = mathoperation.replaceAll(",", "");
		mathoperation = mathoperation.replaceAll("plus", "+");
		mathoperation = mathoperation.replaceAll("minus", "-");
		mathoperation = mathoperation.replaceAll("times", "*");
		mathoperation = mathoperation.replaceAll("divided by", "dividedby");
		mathoperation = mathoperation.replaceAll("percent of", "percentof");
		String[] splitstr = mathoperation.split(" ");
		while (splitstr.length > 1) {
			for (int i = 0; i < splitstr.length; i++) {
				System.out.println("Get value: " + splitstr[i]);
				if (splitstr[i].indexOf("percentof") >= 0) {
					String buildit = splitstr[i - 1] + " percent of "
							+ splitstr[i + 1];
					String done = math(buildit);
					System.out.println("Percentage operation: "
							+ splitstr[i - 1] + " percent of "
							+ splitstr[i + 1] + "=" + done);
					splitstr[i] = done;
					splitstr[i - 1] = "";
					splitstr[i + 1] = "";
					ArrayList<String> list = new ArrayList<String>();
					for (String s : splitstr) {
						if (!s.equals("")) {
							list.add(s);
						}
					}
					splitstr = list.toArray(new String[list.size()]);
				}
			}
			for (int i = 0; i < splitstr.length; i++) {
				System.out.println("Get value: " + splitstr[i]);
				if (splitstr[i].indexOf("dividedby") >= 0) {
					String buildit = splitstr[i - 1] + " divided by "
							+ splitstr[i + 1];
					String done = math(buildit);
					System.out.println("Division operation: " + splitstr[i - 1]
							+ " divided by " + splitstr[i + 1] + "=" + done);
					splitstr[i] = done;
					splitstr[i - 1] = "";
					splitstr[i + 1] = "";
					ArrayList<String> list = new ArrayList<String>();
					for (String s : splitstr) {
						if (!s.equals("")) {
							list.add(s);
						}
					}
					splitstr = list.toArray(new String[list.size()]);
				}
			}
			for (int i = 0; i < splitstr.length; i++) {  
				System.out.println("Get value: " + splitstr[i]);
				if (splitstr[i].indexOf("*") >= 0) {
					String buildit = splitstr[i - 1] + " * " + splitstr[i + 1];
					String done = math(buildit);
					System.out.println("Multiplication operation: "
							+ splitstr[i - 1] + " * " + splitstr[i + 1] + "="
							+ done);
					splitstr[i] = done;
					splitstr[i - 1] = "";
					splitstr[i + 1] = "";
					ArrayList<String> list = new ArrayList<String>();
					for (String s : splitstr) {
						if (!s.equals("")) {
							list.add(s);
						}
					}
					splitstr = list.toArray(new String[list.size()]);
				}
			}
			for (int i = 0; i < splitstr.length; i++) {
				System.out.println("Get value: " + splitstr[i]);
				if (splitstr[i].indexOf("+") >= 0) {
					String buildit = splitstr[i - 1] + " + " + splitstr[i + 1];
					String done = math(buildit);
					System.out.println("Addition operation: " + splitstr[i - 1]
							+ " + " + splitstr[i + 1] + "=" + done);
					splitstr[i] = done;
					splitstr[i - 1] = "";
					splitstr[i + 1] = "";
					ArrayList<String> list = new ArrayList<String>();
					for (String s : splitstr) {
						if (!s.equals("")) {
							list.add(s);
						}
					}
					splitstr = list.toArray(new String[list.size()]);
				}
			}
			for (int i = 0; i < splitstr.length; i++) {
				System.out.println("Get value: " + splitstr[i]);
				if (splitstr[i].indexOf("-") >= 0) {
					String buildit = splitstr[i - 1] + " - " + splitstr[i + 1];
					String done = math(buildit);
					System.out.println("Subtraction operation: "
							+ splitstr[i - 1] + " - " + splitstr[i + 1] + "="
							+ done);
					splitstr[i] = done;
					splitstr[i - 1] = "";
					splitstr[i + 1] = "";
					ArrayList<String> list = new ArrayList<String>();
					for (String s : splitstr) {
						if (!s.equals("")) {
							list.add(s);
						}
					}
					splitstr = list.toArray(new String[list.size()]);
				}
			}
			for (int i = 0; i < splitstr.length; i++) {
				System.out.println("Final operation: " + total + " "
						+ splitstr[i]);
			}
		}
//		return total;

	}

	private String math(String mathoperation) {
		// TODO Auto-generated method stub
		if (mathoperation.contains("percent of")) {
			mathoperation = mathoperation.replaceAll("percent of", "%");
			int str = mathoperation.indexOf("%");
			System.out.println(str);
			fnum = mathoperation.substring(0, str - 1);
			fnum = fnum.replaceAll(" ", "");
			fnum = "." + fnum;
			System.out.println(fnum);
			double intfnum = Double.parseDouble(fnum);
			System.out.println(intfnum);
			int lastind = mathoperation.length();
			System.out.println(lastind);
			lnum = mathoperation.substring(str + 1, lastind);
			lnum = lnum.replaceAll(" ", "");
			System.out.println(lnum);
			double intlnum = Double.parseDouble(lnum);
			System.out.println(intlnum);
			double tot = intlnum * intfnum;
			System.out.println(tot);
			total = Double.toString(tot);
			if (total.length() == 3) {
				total = total + "0";
			}
			if (total.length() > 5) {
				total = total.substring(0, 4);
			}
			total = total.replace("0.", "");
			System.out.println("Total:" + total);
		} else if (mathoperation.contains("-")) {
			int str = mathoperation.indexOf("-");
			System.out.println(str);
			fnum = mathoperation.substring(0, str - 1);
			fnum = fnum.replaceAll(" ", "");
			System.out.println(fnum);
			double intfnum = Double.parseDouble(fnum);
			System.out.println(intfnum);
			int lastind = mathoperation.length();
			System.out.println(lastind);
			lnum = mathoperation.substring(str + 1, lastind);
			lnum = lnum.replaceAll(" ", "");
			System.out.println(lnum);
			double intlnum = Double.parseDouble(lnum);
			System.out.println(intlnum);
			double tot = intfnum - intlnum;
			System.out.println(tot);
			total = Double.toString(tot);
			System.out.println(total);
		} else if (mathoperation.contains("+")) {
			int str = mathoperation.indexOf("+");
			System.out.println(str);
			fnum = mathoperation.substring(0, str - 1);
			fnum = fnum.replaceAll(" ", "");
			System.out.println(fnum);
			double intfnum = Double.parseDouble(fnum);
			System.out.println(intfnum);
			int lastind = mathoperation.length();
			System.out.println(lastind);
			lnum = mathoperation.substring(str + 1, lastind);
			lnum = lnum.replaceAll(" ", "");
			System.out.println(lnum);
			double intlnum = Double.parseDouble(lnum);
			System.out.println(intlnum);
			double tot = intfnum + intlnum;
			System.out.println(tot);
			total = Double.toString(tot);
			System.out.println(total);
		} else if (mathoperation.contains("*")) {
			int str = mathoperation.indexOf("*");
			System.out.println(str);
			fnum = mathoperation.substring(0, str - 1);
			fnum = fnum.replaceAll(" ", "");
			System.out.println(fnum);
			double intfnum = Double.parseDouble(fnum);
			System.out.println(intfnum);
			int lastind = mathoperation.length();
			System.out.println(lastind);
			lnum = mathoperation.substring(str + 1, lastind);
			lnum = lnum.replaceAll(" ", "");
			System.out.println(lnum);
			double intlnum = Double.parseDouble(lnum);
			System.out.println(intlnum);
			double tot = intfnum * intlnum;
			System.out.println(tot);
			total = Double.toString(tot);
			System.out.println(total);
		} else if (mathoperation.contains("divided by")) {
			mathoperation = mathoperation.replaceAll("divided by", "/");
			int str = mathoperation.indexOf("/");
			System.out.println(str);
			fnum = mathoperation.substring(0, str - 1);
			fnum = fnum.replaceAll(" ", "");
			System.out.println(fnum);
			double intfnum = Double.parseDouble(fnum);
			System.out.println(intfnum);
			int lastind = mathoperation.length();
			System.out.println(lastind);
			lnum = mathoperation.substring(str + 1, lastind);
			lnum = lnum.replaceAll(" ", "");
			System.out.println(lnum);
			double intlnum = Double.parseDouble(lnum);
			System.out.println(intlnum);
			double tot = intfnum / intlnum;
			System.out.println(tot);
			total = Double.toString(tot);
			System.out.println(total);
		} else {
			total = null;
		}
		return total;
	}

}
package Universidade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		String data = "27/12/1970";
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date da = null;
		try {
			da = df.parse(data);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		Endereco e = new Endereco();
		Doutorado d = new Doutorado("Ava", da, true, "1456456", e);
		d.seFormar(d);

	}

}

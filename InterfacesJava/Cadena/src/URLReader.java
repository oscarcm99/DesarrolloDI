import java.net.*;
import java.io.*;

public class URLReader {
	public static void main(String[] args) throws Exception {
		
		URL direccion = new URL("http://www.spanishdict.com/translate/");
		String html = obtenerHTML (direccion);
		System.otranslationText":"ut.println(html);
	//["translationText":"]house[","translationContext"]
		}
	
	public static String obtenerHTML (URL direccionWeb) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(direccionWeb.openStream()));
		String inputLine, codigo="";

		while ((inputLine = in.readLine()) != null)
			codigo+=inputLine;

		in.close();
		
		return codigo;
	}
}

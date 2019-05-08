package ogrencisleri;
import java.io.*;
public class Listeleme {
	String dosyayolu = System.getProperty("user.dir");
	public void ogrencilisteleme(){
		try{
			File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogrenci.txt");
			FileReader fileReader = new FileReader(f);
			String line;
			try (BufferedReader br = new BufferedReader(fileReader)) {

				while ((line=br.readLine()) != null) {
					System.out.println(line);

				} 
			}
		}
		catch(Exception e){
		}
	}

	public void ogretimuyesilisteleme(){
		try{
			File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
			FileReader fileReader = new FileReader(f);
			String line;
			try (BufferedReader br = new BufferedReader(fileReader)) {

				while ((line=br.readLine()) != null) {
					System.out.println(line);

				} 
			}
		}
		catch(Exception e){
		}
	}
}
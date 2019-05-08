package ogrencisleri;
import java.io.*;
import java.util.*;
public class Program {
	String dosyayolu = System.getProperty("user.dir");
	String gunler[]= {"Pazartesi","Sali","Carsamba","Persembe","Cuma"};
	public void dersprogramýOlusturma() {
		try{
			File f = new File(dosyayolu+"\\src\\ogrencisleri\\dersprogramý.txt");
			FileWriter outFile = new FileWriter(f);
			PrintWriter out = new PrintWriter(outFile,true);
			for (String d: gunler)
			{out.println(d);}
			out.close();
		}catch (Exception e){
			System.err.println("Hata: " + e.getMessage());
		}
	}
	public void dersProgramýGirme() throws FileNotFoundException{
		
	}
}

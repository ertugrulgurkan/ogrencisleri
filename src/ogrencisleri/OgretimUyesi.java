package ogrencisleri;
import java.io.*;
import java.util.*;
public class OgretimUyesi implements Kisiler {
	String dosyayolu = System.getProperty("user.dir");
	private String ad;
	private String soyad;
	private int id;
	@Override
	public void ekleme(String ad,String soyad,int id) {
		PrintWriter out = null;
		try {
			this.setAd(ad);
			this.setSoyad(soyad);
			this.setId(id);
			out = new PrintWriter(new BufferedWriter(new FileWriter(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt", true)));
			out.println(id+" "+ad+" "+soyad);
			System.out.println("Ogretim uyesi eklendi.");
		}catch (Exception e){
			System.err.println("Hata: " + e.getMessage());
		}
	}
	@Override
	public void silme(int id) {
		this.setId(id);
		String a = String.valueOf(id);
		ArrayList<String> list = new ArrayList<>();
		try{
			File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
			FileReader fileReader = new FileReader(f);
			String line;
			try (BufferedReader br = new BufferedReader(fileReader)) {
				line = br.readLine();
				while (line != null) {
					if((line=br.readLine()).startsWith(a)){continue;}
					else{list.add(line);}
				} 
			}
		}
		catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
		try{
			File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
			FileWriter outFile = new FileWriter(f);
			PrintWriter out = new PrintWriter(outFile,true);
			out.println("ID AD SOYAD");
			for (String d: list){out.println(d);}
			out.close();
		}
		catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
	}

	@Override
	public void guncelleme(String ad,String soyad,int id) {
		this.setAd(ad);
		this.setSoyad(soyad);
		this.setId(id);

		String a = String.valueOf(id);
		ArrayList<String> list = new ArrayList<>();
		try{
			File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
			FileReader fileReader = new FileReader(f);
			String line;
			try (BufferedReader br = new BufferedReader(fileReader)) {
				line = br.readLine();
				while (line != null) {
					if((line=br.readLine()).startsWith(a)){list.add(id+" "+ad+" "+soyad);}
					else{ list.add(line);}
				} 
			}
		}
		catch(Exception e){
		}
		try{
			File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
			FileWriter outFile = new FileWriter(f);
			PrintWriter out = new PrintWriter(outFile,true);
			out.println("ID AD SOYAD");
			for (String d: list){out.println(d);}
			out.close();
		}catch (Exception e){
			System.err.println("Hata: " + e.getMessage());
		}
	}
	
	public boolean isExist(int id) throws FileNotFoundException {
		boolean flag = false;
		String idString=String.valueOf(id);
		String line;
		File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
		FileReader fileReader = new FileReader(f);
		try (BufferedReader br = new BufferedReader(fileReader)) {
			line = br.readLine();
			while (line != null) {
				if(line.startsWith(idString)){
					flag = true;
					break;
				}
				else
					flag=false;
				line =br.readLine();
			} 
		}
		catch(Exception e){
		}
		return flag;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}

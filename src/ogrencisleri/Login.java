package ogrencisleri;
import java.io.FileNotFoundException;
import java.util.*;

public class Login {
	public void loginScreen() throws FileNotFoundException {
		Listeleme listeleme=new Listeleme();
		Program program = new Program();
		Scanner scanner = new Scanner(System.in);
		Ogrenci ogr =new Ogrenci();
		OgretimUyesi ogretimUyesi=new OgretimUyesi();
		int x=0;
		while(x!=4) {
			System.out.println("****************************************************");
			System.out.println("Merhabalar, Öðrenci isleri Sistemine hos geldiniz.");
			System.out.println("Lutfen Giris Yapýnýz.");
			System.out.println("1: Yonetici olarak giris yap ");
			System.out.println("2: Ogretim uyesi olarak giris yap ");
			System.out.println("3: Ogrenci olarak giris yap ");
			System.out.println("4:Cikis");			
			int secim;
			secim=scanner.nextInt();
			switch (secim) {
			case 1:
				int y=0;
				while (y!=11) {
					System.out.println("********************************");
					System.out.println("1: Ogrenci kaydet");
					System.out.println("2: Ogrenci sil");
					System.out.println("3: Ogrenci guncelleme");
					System.out.println("4: Ogrenci listesini gor");
					System.out.println("5: Ogretim uyesi kaydet");
					System.out.println("6: Ogretim uyesi sil");
					System.out.println("7: Ogretim uyesi guncelleme");
					System.out.println("8: Ogretim uyesi listesini gor");
					System.out.println("9: Ders programi hazirlanmasi");
					System.out.println("10: Sinav programi hazirlanmasi");
					System.out.println("11: Ust menuye don");
					secim=scanner.nextInt();
					switch (secim) {
					case 1:
						System.out.println("Eklemek istediginiz ogrencinin adini giriniz:");
						Scanner a=new Scanner(System.in);
						String ad=a.nextLine();
						System.out.println("Eklemek istediginiz ogrencinin soyadini giriniz:");
						Scanner b=new Scanner(System.in);
						String soyad=b.nextLine();
						System.out.println("Eklemek istediginiz ogrencinin nosunu giriniz:");
						Scanner c=new Scanner(System.in);
						int id=c.nextInt();
						ogr.ekleme(ad, soyad, id);
						System.out.println(ad+" "+soyad+" isimli ogrenci sisteme eklenmistir.");
						break;
					case 2: 
						System.out.println("Silmek istediginiz ogrencinin okul numarasini giriniz:");
						Scanner d=new Scanner(System.in);
						int id1=d.nextInt();
						ogr.silme(id1);
						System.out.println(id1+" numarali ogrenci sistemden silinmistir.");
						break;
					case 3:
						System.out.println("Guncellemek istediginiz ogrencinin numarasini giriniz:");
						Scanner s=new Scanner(System.in);
						int no=s.nextInt();
						System.out.println("Guncellemek istediginiz ogrencinin adini giriniz:");
						Scanner s1=new Scanner(System.in);
						String ad1=s1.nextLine();
						System.out.println("Guncellemek istediginiz ogrencinin soyadini giriniz:");
						Scanner s2=new Scanner(System.in);
						String soyad2=s2.nextLine();
						ogr.guncelleme(ad1, soyad2, no);
						System.out.println(no+" numarali ogrenci guncellendi");
						break;
					case 4:
						listeleme.ogrencilisteleme();
						break;
					case 5:
						System.out.println("Eklemek istediginiz ogretim uyesinin adini giriniz:");
						Scanner e=new Scanner(System.in);
						String esString=e.nextLine();
						System.out.println("Eklemek istediginiz ogretim uyesinin soyadini giriniz:");
						Scanner f=new Scanner(System.in);
						String fString=f.nextLine();
						System.out.println("Eklemek istediginiz ogretim uyesinin nosunu giriniz:");
						Scanner g=new Scanner(System.in);
						int gid=g.nextInt();
						ogretimUyesi.ekleme(esString, fString, gid);
						System.out.println(esString+" "+fString+" isimli ogretim uyesi sisteme eklenmistir.");
						break;
					case 6:
						System.out.println("Silmek istediginiz ogretim uyesinin id'sini giriniz:");
						Scanner sc1=new Scanner(System.in);
						int idno=sc1.nextInt();
						ogretimUyesi.silme(idno);
						System.out.println(idno+" id'li ogretim uyesi sistemden silinmistir.");
						break;
					case 7: 
						System.out.println("Guncellemek istediginiz ogretim uyesinin id'sini giriniz:");
						Scanner s3=new Scanner(System.in);
						int id3=s3.nextInt();
						System.out.println("Guncellemek istediginiz ogretim uyesinin adini giriniz:");
						Scanner s4=new Scanner(System.in);
						String ad3=s4.nextLine();
						System.out.println("Guncellemek istediginiz ogretim uyesinin soyadini giriniz:");
						Scanner s5=new Scanner(System.in);
						String soyad3=s5.nextLine();
						ogretimUyesi.guncelleme(ad3, soyad3, id3);
						System.out.println(id3+" id'li ogretim uyesi guncellendi");
						break;
					case 8:
						listeleme.ogretimuyesilisteleme();
						break;
					case 9:
						//program.dersprogramýOlusturma();
						//System.out.println("hangi gune ekleme yapmak istiyýrsunuz");
						//Scanner p=new Scanner(System.in);
						//String gun=p.nextLine();
						//System.out.println("eklemek istediginiz dersleri aralarýnda bosluk býrakarak sýra ile giriniz.");
						//Scanner p1=new Scanner(System.in);
						//String dersler=p1.nextLine();
						program.dersProgramýGirme();
						break;
					case 11:
						y=11;
						break;
					default:
						System.out.println("hatali secim yaptiniz lutfen tekrar deneyiniz.");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Ogretim uyesi numaranizi giriniz.");
				int ogretimuyeno=scanner.nextInt();
				if (ogretimUyesi.isExist(ogretimuyeno)) {
					System.out.println("ogretim uyesi bulundu.");
				}
				else {
					System.out.println("ogretim uyesi bulunamadý.");
				}
				break;
			case 3:
				System.out.println("Ogrenci numaranizi giriniz.");
				int ogrencino=scanner.nextInt();
				if (ogr.isExist(ogrencino)) {
					System.out.println("ogrenci bulundu.");
				}
				else {
					System.out.println("ogrenci bulunamadý.");
				}
				break;
			case 4:
				x=4;
				break;
			default:System.out.println("hatali secim yaptiniz lutfen tekrar deneyiniz.");
			break;
			}
		}
	}

}


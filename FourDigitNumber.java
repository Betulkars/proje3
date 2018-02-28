/*Dört	basamaklı	pozitif	bir	tamsayının	basamaklarını	değiştirerek	onu	şifreleyen	bir	Java	programı	yazınız.
Şifreleme	şu	şekilde	olmalıdır:	Her	bir	basamağa	7	ekleyip	10	ile	bölümünden	kalanı	alın.
Daha	sonra	ilk	basamağı	üçüncü	basamakla,	ikinci	basamağı	da	dördüncü	basamakla	yer	değiştirin.
Şifreleyeceğiniz	tamsayı	kullanıcı	tarafından	girilmelidir	ve	şifrelenmiş	yeni	tamsayı	ekrana	yazdırılmalıdır.
Program,	kullanıcının	istenen	özelliklere	sahip	bir	tamsayı	girip	girmediğini	de	kontrol	etmelidir.
* */
import java.util.Scanner;
public class FourDigitNumber {
    public static void main (String args []){
        /*Kullanıcıdan 4 basamaklı bir sayı istemek için integer tipinde bir sayı tanımladım.*/
        int number;
        Scanner input = new Scanner(System.in);
        /*Kullanıcıdan 4 basamaklı bir sayı istedim.*/
        System.out.println("Please enter a four digit number:");
        number = input.nextInt();
        /*Daha sonra teker teker 4 basamaklı girilen sayının basamaklarını tanımladım.Çünkü her basamağa 7 ekleyip 10 ile bölümünden kalanı bulmam gerekiyordu.*/
        int ThousandOfSteps = number /1000;
        int HundrendsOfStep = number/100-10*ThousandOfSteps;
        int TenOfStep =(number/10)-100*ThousandOfSteps-10*HundrendsOfStep;
        int OneOfStep = number-(ThousandOfSteps*1000+HundrendsOfStep*100+TenOfStep*10);
        /*Daha sonra yeni basamaklar tanımladım.Şifreleme yapmam için her basamağı 7 ile toplayıp 10 ile bölümünden kalanı buldum.*/
        int  newStep1=(ThousandOfSteps+7)%10;
        int newStep2=(HundrendsOfStep+7)%10;
        int newStep3=(TenOfStep+7)%10;
        int newStep4=(OneOfStep+7)%10;
        /*Şifreleme yöntemim 1. basamak ile 3. basamak ve 2. basamak ile 4. basamağın yerlerinin değişmesiydi.Yazdırırken yerlerini değiştirip yazdırdım.*/
        System.out.println("Encrypted data is: "+newStep3+""+newStep4+""+newStep1+""+newStep2+"'dir.");




    }
}

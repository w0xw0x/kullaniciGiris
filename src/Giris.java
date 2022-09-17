import java.util.Scanner;
public class Giris {
    public static void main(String[] args) {
        String username,password,newPassword,dilemma;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adınız : ");
        username = input.nextLine();

        System.out.println("Şifreniz : ");
        password = input.nextLine();

        if (username.equals("w0xw0x") && password.equals("asd123qwe456")){
            System.out.println("Başarıyla giriş yapıldı.");

        }else {
            Scanner a = new Scanner(System.in);
            System.out.println("Giriş bilgileriniz hatalı!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?(cevabınız olumluysa 'Evet' yazınız)");
            dilemma = a.nextLine();

            if (dilemma.equals("Evet")) {
                System.out.println("Yeni şifrenizi giriniz : ");
                newPassword = a.nextLine();

                if (newPassword.equals(password)){
                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz!");
                }else {
                    System.out.println("Şifreniz oluşturuldu.");

                }
            }
        }

    }

}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğduğunuz ay (1-12)");
        month = scanner.nextInt();

        System.out.println("Doğduğunuz gün (sayı)");
        day = scanner.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("oglak burcu");
                    } else {
                        System.out.println("kova burcu");
                    }
                } else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        System.out.println("kova burcu");
                    } else {
                        System.out.println("balik burcu");
                    }
                } else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 3:
                if(day>=1 && day<=31) {
                    if(day<21){
                        System.out.println("balik burcu");
                    } else {
                        System.out.println("koc burcu");
                    }
                }else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 4:
                if(day>=1 && day<=31) {
                    if(day<20){
                        System.out.println("koc burcu");
                    } else {
                        System.out.println("boga burcu");
                    }
                }else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 5:
                if(day>=1 && day<=31) {
                    if(day<21){
                        System.out.println("boga burcu");
                    } else {
                        System.out.println("ikizler burcu");
                    }
                }else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 6:
                if(day>=1 && day<=31) {
                    if(day<22){
                        System.out.println("ikizler burcu");
                    } else {
                        System.out.println("yengec burcu");
                    }
                }else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 7:
                if(day>=1 && day<=31) {
                    if(day<22){
                        System.out.println("yengec burcu");
                    } else {
                        System.out.println("aslan burcu");
                    }
                }else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 8:
                if(day>=1 && day<=31) {
                    if(day<23){
                        System.out.println("aslan burcu");
                    } else {
                        System.out.println("basak burcu");
                    }
                }else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 9:
                if(day>=1 && day<=31) {
                    if(day<22){
                        System.out.println("basak burcu");
                    } else {
                        System.out.println("terazi burcu");
                    }
                }else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 10:
                if(day>=1 && day<=31) {
                    if(day<23){
                        System.out.println("terazi burcu");
                    } else {
                        System.out.println("akrep burcu");
                    }
                }else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 11:
                if(day>=1 && day<=31) {
                    if(day<21){
                        System.out.println("akrep burcu");
                    } else {
                        System.out.println("yay burcu");
                    }
                }else {
                    System.out.println("gecersiz gün");
                }
                break;
            case 12:
                if(day>=1 && day<=31) {
                    if(day<21){
                        System.out.println("yay burcu");
                    } else {
                        System.out.println("oglak burcu");
                    }
                }else {
                    System.out.println("gecersiz gün");
                }
                break;
            default:
                System.out.println("hatalı giriş");
        }
    }
}
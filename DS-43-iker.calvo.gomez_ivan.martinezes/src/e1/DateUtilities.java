package e1;

public class DateUtilities {
    public static boolean isLeap(int year){
       if(year%4==0){
           if (year%100==0){
               return year % 400 == 0;
           }
           else return true;
       }
       else return false;
    }
    public static int numberOfDays(int month, int year){

        switch (month){
            case 1,3,5,7,8,10,12: return 31;
            case 2: if (isLeap(year)){return 29;}
                else return 28;

            case 4,6,9,11: return 30;
            default:
                throw new IllegalArgumentException();
        }
    }
    public static String convertToISODate(String dateText){
        String fecha;
        String[] fecha2=dateText.split(" ");
        String mes=fecha2[0];
        int mes2 = switch (mes) {
            case "January" -> 1;
            case "February" -> 2;
            case "March" -> 3;
            case "April" -> 4;
            case "May" -> 5;
            case "June" -> 6;
            case "July" -> 7;
            case "August" -> 8;
            case "September" -> 9;
            case "October" -> 10;
            case "November" -> 11;
            case "December" -> 12;
            default -> throw new IllegalArgumentException();
        };
        String dia=fecha2[1];
        String ano=fecha2[2];
        String dia2=dia.substring(0,dia.length()-1);
        if (mes2>9){
            fecha=ano+"-"+mes2+"-"+dia2;
        }
        else fecha=ano+"-0"+mes2+"-"+dia2;
        return fecha;
    }
    public static boolean checkISODate(String ISODate) {
        String[] fecha = ISODate.split("-");
        String ano = fecha[0];
        int ano1 = Integer.parseInt(ano);
        String mes = fecha[1];
        int mes1 = Integer.parseInt(mes);
        String dia = fecha[2];
        int dia1 = Integer.parseInt(dia);
        System.out.println(mes1);
        if (mes1>=13 || mes1 <=0) {
            return false;
        }
        else {
            if (!(numberOfDays(mes1, ano1) >= dia1)) {
                return false;
            } else {return true;
            }

        }

    }
}

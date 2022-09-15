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
            case 2: if (isLeap(year)==true){return 29;}
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
        int mes2;
        switch (mes){
            case "January": mes2=1;break;
            case "February": mes2=2;break;
            case "March": mes2=3;break;
            case "April": mes2=4;break;
            case "May":mes2=5;break;
            case "June":mes2=6;break;
            case "July":mes2=7;break;
            case "August": mes2=8;break;
            case "September": mes2=9;break;
            case "October":mes2=10;break;
            case "November":mes2=11;break;
            case "December":mes2=12;break;
            default: throw new  IllegalArgumentException();
        }
        String dia=fecha2[1];
        String año=fecha2[2];
        String dia2=dia.substring(0,dia.length()-1);
        if (mes2>9){
            fecha=año+"-"+mes2+"-"+dia2;
        }
        else fecha=año+"-0"+mes2+"-"+dia2;
        return fecha;
    }
    public static boolean checkISODate(String ISODate) {
        String[] fecha = ISODate.split("-");
        String año = fecha[0];
        int año1 = Integer.parseInt(año);
        String mes = fecha[1];
        int mes1 = Integer.parseInt(mes);
        String dia = fecha[2];
        int dia1 = Integer.parseInt(dia);
        System.out.println(mes1);
        if (mes1>=13 && mes1 <=0) {
            return false;
        }
        else {
            if (!(numberOfDays(mes1, año1) >= dia1)) {
                return false;
            } else {
                if (mes1>12){
                    return false;
                }
                else return true;
            }

        }

    }
}

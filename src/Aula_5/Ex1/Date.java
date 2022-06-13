package Aula_5.Ex1;

public class Date {
    public int  a, m, d;

    public Date(int a, int m, int d){
        this.a = a;
        this.m = m;
        this.d = d;
    }

    public static boolean validMonth(int mes){
        boolean valid = true;
        if (mes < 0 || mes > 12);
            valid = false;
        return valid;
    }

    private static boolean isLeap(int ano){
        boolean isLeap = false;
        if((ano%4 == 0) && ((ano%100 != 0) || (ano%400 == 0)))
            isLeap = true;
        return isLeap;
    }

    private static int monthDays(int mes, int ano){
        int dias;
        switch (mes){
            case 1:
            case 3:dias = 31; break;
            case 2:
                if(isLeap(ano))
                    dias = 29;
                else
                    dias = 28;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dias = 31; break;
            default: dias = 30;
        }
        return dias;
    }

    private static boolean isValid(int ano, int mes, int dias) {
        boolean valid = true;
        valid = validMonth(mes);

        if (ano < 0)
            valid = false;

        if (dias < 0 || dias > monthDays(mes, ano))
            valid = false;

        return valid;
    }

    public void setDate(int ano, int mes, int dia){
        if (isValid(ano, mes, dia)){
            this.a = ano;
            this.m = mes;
            this.d = dia;
        }
        else
            System.out.println("Invalid date");
        
    }

    public int getDay(){return d;}
    public int getMonth(){return m;}
    public int getYear(){return a;}

    public void increment(){        
        if (this.d < monthDays(this.m, this.a))
            this.d += 1;
        else if (this.m < 12) {
            this.d = 1;
            this.m += 1;
        }
        else if (this.m == 12){
            this.d = 1;
            this.m = 1;
            this.a += 1;
        }
    }

    public void decrement(){
        if (isValid(this.a, this.m, this.d)){
            if (this.d > 0 )
                this.d -= 1;
        }
        else if (this.m >= 2) {
            this.d = monthDays(this.m-1, this.a);
            this.m += 1;
        }
        else if (this.m == 1){
            this.d = 31;
            this.m = 12;
            this.a -= 1;
        }
    }

    @Override
    public String toString(){
        return this.a + "-" + this.m + "-" + this.d;
    }
}

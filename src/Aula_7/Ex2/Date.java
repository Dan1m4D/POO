package Aula_7.Ex2;

public abstract class Date implements Comparable<Date>{
    public abstract Boolean validMonth(int m);
    public abstract int monthDays(int m, int a);
    public abstract Boolean leapYear(int a);
    public abstract Boolean validDate(int d, int m, int a);
    public abstract String printt();
    public abstract void incrementDate();
    public abstract void decrementDate();
    public abstract int decrementDatee(int dia, int mes, int ano);
    
}

package MinitesteTP06.MT;

public class DateND extends Date {
    public int dia, mes, ano;
    
    public DateND(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDate(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia() {return dia;}
    
    public int getMes() {return mes;}
    
    public int getAno() {return ano;}

    public int monthDays(int m, int a){
        int dias;
        switch (m){
            case 1: 
            case 3:dias = 31; break;
            case 2: 
                if((a%4 == 0) && ((a%100 != 0) || (a%400 == 0))){
                    dias = 29;
                }else{dias = 28;
                }break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dias = 31; break;
            default: dias = 30;
        }
        return dias;
    }
    public int decrementDatee(int dia, int mes, int ano){
        int d = 0;

        while(dia != 1 || mes != 1 || ano != 2000){
            if(dia == 1){
                dia = this.monthDays(mes, ano);
                mes--;
            }else{
                dia--;
            }
            if(mes == 0){
                mes = 12;
                ano--;
            }
            d++;
        }
        
        return d;
    }



    @Override
    public Boolean validMonth(int m) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean leapYear(int a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean validDate(int d, int m, int a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String printt() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void incrementDate() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void decrementDate() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof DateND)) {
            return false;
        }
        
        DateND d = (DateND) o;
        
        return Integer.compare(dia, d.dia) == 0
                && Double.compare(mes, d.mes) == 0
                && Double.compare(ano, d.ano) == 0;
    }

    @Override
    public int compareTo(Date d){
        return 1;
    }
    
    @Override
    public String toString(){
        return String.format("%s-%s-%s", dia, mes, ano);
    }
    
    
}

public class Main {
    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }
// Ho svolto l'esercizio a modo mio, raccogliendo informazioni su Enumeration sul web, in quanto l'argomento non è presente nelle lezioni

    public static void main(String[] args) {

        for (Month month : Month.values()){
            if(month.toString().endsWith("Y")){
                System.out.println(month + " end with y");
            }else {
                System.out.println(month + " doesn't end with y");
            }
        }
    }
}
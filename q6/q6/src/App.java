class Date{
    private int Day,Month,Year;

    Date(int Day,int Month,int Year){
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;

    }

    public int getDay() {
        return Day;
    }
    public void setDay(int day) {
        Day = day;
    }
    public int getMonth() {
        return Month;
    }
    public void setMonth(int month) {
        Month = month;
    }
    public int getYear() {
        return Year;
    }
    public void setYear(int year) {
        Year = year;
    }
    public void fullDate(){
        System.out.println("The Date is " + this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
    }
    
}
public class App {
    public static void main(String[] args) throws Exception {
        Date date01=new Date(19, 7, 2023);

        date01.fullDate();

        date01.setYear(2000);
        date01.fullDate();
                



    }
}

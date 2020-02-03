package projectEnum;

public class DayOfWeekMain {
    public static void main(String[] args) {

        System.out.println(getWorkingHours(DayOfWeek.WEDNESDAY));
}

 public static int getWorkingHours(DayOfWeek day){
     System.out.println(day);
     int answer = 0;
        if(day.getWorksHours() == 0) {
            System.out.println("Сегодня выходной");
        } else {
            int enterEnum = day.ordinal();
            for (DayOfWeek d:DayOfWeek.values()) {
                if (d.ordinal()>=enterEnum){
                    answer+=d.getWorksHours();
                }
            }

        }
        return answer;
    }
}

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
        String[] day_of_week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        
        Calendar cal=Calendar.getInstance();
        
        cal.set(year,month-1,day);
        
        int p=cal.get(Calendar.DAY_OF_WEEK);
        
        return day_of_week[p-1];

    }

}
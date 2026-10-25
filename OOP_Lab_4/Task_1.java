class JTime
{
    private int hour;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0){
            System.out.println("hour can't be greater than 23 or can't be negative!!!");
        }
        else{
        this.hour = hour;}
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59 || minute < 0) {
            System.out.println("minutes can't be greater than 59 or can't be negative!!!");
        }
        else{
        this.minute = minute;}
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds > 59 || seconds < 0) {
            System.out.println("seconds can't be greater than 59 or can't be negative!!!");
        }
        else{
        this.seconds = seconds;}
    }

    private int minute;
    private int seconds;

    public JTime() {}

    public JTime(int hour, int minute, int seconds)
    {
        setHour(hour);
        setMinute(minute);
        setSeconds(seconds);
    }

    public JTime(int totalSeconds)
    {
        if (totalSeconds < 0 || totalSeconds > 86399)
        {
            System.out.println("Total seconds must be between 0 and 86399!!!");
            return;
        }
        setHour(totalSeconds / 3600);
        setMinute((totalSeconds % 3600) / 60);
        setSeconds(totalSeconds % 60);
    }
    JTime elapsed(JTime other)
    {
        return new JTime(difference(other));
    }

    int toSeconds()
    {
        int total_sec = this.getHour() * 3600 + this.getMinute() * 60 + getSeconds();
        return total_sec;
    }
    int difference(JTime other){
        int diff = this.toSeconds() - other.toSeconds();
        if (diff < 0){
            diff = diff * -1;
        }
        return diff;
    }
    void display(){
        System.out.println("Time: "+getHour()+":"+getMinute()+":"+getSeconds());
        System.out.println("Seconds: "+toSeconds());
    }
}
public class Task_1
{
    static void main(String[] args)
    {
        JTime time1 = new JTime(1,30,10);
        JTime time2 = new JTime(1,40,50);
        JTime time3 = new JTime(63200);
        JTime time4 = time1.elapsed(time2);
        time1.display();
        time2.display();
        time4.display();
        time3.display();
        System.out.println("The time difference in sec: "+time1.difference(time2));
    }
}
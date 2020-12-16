public class Training {
    private int burpee_number;
    private int pushup_number;
    private int situp_number;
    private int squat_number;

    public Training(int burpee_number, int pushup_number, int situp_number, int squat_number) {
        this.burpee_number = burpee_number;
        this.pushup_number = pushup_number;
        this.situp_number = situp_number;
        this.squat_number = squat_number;
    }

    public int getBurpee_number() {
        return burpee_number;
    }

    public void setBurpee_number(int burpee_number) {
        this.burpee_number = burpee_number;
    }

    public int getPushup_number() {
        return pushup_number;
    }

    public void setPushup_number(int pushup_number) {
        this.pushup_number = pushup_number;
    }

    public int getSitup_number() {
        return situp_number;
    }

    public void setSitup_number(int situp_number) {
        this.situp_number = situp_number;
    }

    public int getSquat_number() {
        return squat_number;
    }

    public void setSquat_number(int squat_number) {
        this.squat_number = squat_number;
    }

    public void move(String type, int number) {
        if (type.equals("burpee"))
            doBurpee(number);
        else if (type.equals("pushup"))
            doPushup(number);
        else if (type.equals("situp"))
            doSitup(number);
        else if (type.equals("squat"))
            doSquat(number);
        else
            System.out.println("Incorrect type!");
    }

    public void doBurpee(int number) {
        if (burpee_number == 0)
            System.out.println("You finished your goal!");
        else if (burpee_number < number) {
            System.out.println("You passed your goal! Congratulations!");
            burpee_number = 0;
            System.out.println("Remaining burpee number: " + burpee_number);
        }
        else{
            burpee_number=burpee_number-number;
            System.out.println("Remaining burpee number: " + burpee_number);
        }
    }

    public void doPushup(int number) {
        if (pushup_number == 0)
            System.out.println("You finished your goal!");
        else if (pushup_number < number) {
            System.out.println("You passed your goal! Congratulations!");
            pushup_number = 0;
            System.out.println("Remaining pushup number: " + pushup_number);
        }
        else{
            pushup_number=pushup_number-number;
            System.out.println("Remaining pushup number: " + pushup_number);
        }
    }

    public void doSitup(int number) {
        if (situp_number == 0)
            System.out.println("You finished your goal!");
        else if (situp_number < number) {
            System.out.println("You passed your goal! Congratulations!");
            situp_number = 0;
            System.out.println("Remaining situp number: " + situp_number);
        }
        else{
            situp_number=situp_number-number;
            System.out.println("Remaining situp number: " + situp_number);
        }
    }

    public void doSquat(int number) {
        if (squat_number == 0)
            System.out.println("You finished your goal!");
        else if (squat_number < number) {
            System.out.println("You passed your goal! Congratulations!");
            squat_number = 0;
            System.out.println("Remaining squat number: " + squat_number);
        }
        else{
            squat_number=squat_number-number;
            System.out.println("Remaining squat number: " + squat_number);
        }
    }

    public boolean isFinish(){
        return (burpee_number==0)&&(pushup_number==0)&&(situp_number==0)&&(squat_number==0);
    }
}

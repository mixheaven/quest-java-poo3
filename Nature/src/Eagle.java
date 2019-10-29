public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }


    @Override
    public void takeOff(){
        if(!this.flying && this.altitude ==0 ){
            this.flying = true;
            System.out.println(this.getName() + " takes off in the sky.");
        }

    }
    @Override
    public int ascend(int meters){
        this.altitude = meters;
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        return this.altitude;
        }

    @Override
    public int descend(int meters){
        this.altitude = meters;
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        return this.altitude;

    }
    @Override
    public void land(){
        if(this.flying && this.altitude ==0){
            System.out.println(this.getName() + " lands on the ground.");
        }
        else {
            System.out.println("is too high, it can't lands.");

        }
    }
    @Override
    public void glide() {
        System.out.println("It glides into the air.");
    }
}

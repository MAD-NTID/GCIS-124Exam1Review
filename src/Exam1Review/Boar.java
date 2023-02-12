package Exam1Review;
public class Boar extends Animal
{
    private int speed;
    private final int MOVE_AT_HALF_SPEED;

    public Boar(int speed, int staminaCapacity) {
        super(speed, staminaCapacity);
        this.MOVE_AT_HALF_SPEED = speed / 2;
        this.speed = speed;
    }

    @Override
    public int run()
    {
        //reset the boar to the max speed as we might have
        //modified it when we did the half speed when there was not
        //enough stamina
        super.setSpeed(speed);

        //When it doesn’t have enough stamina to run, it moves at half
        //of its speed.
        if(super.getStamina() < super.getSpeed()){
            super.setSpeed(MOVE_AT_HALF_SPEED);
        }

        return super.run();
    }

    @Override
    public String toString()
    {
        return String.format("Exam1Review.Boar has run %s", super.getDistance());
    }
}

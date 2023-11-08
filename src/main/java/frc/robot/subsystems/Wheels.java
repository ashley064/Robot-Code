
package main.java.frc.robot.subsystems;

public class Wheels extends SubsystemBase {

    //An enum is a special "class" that represents a group of constants s
    public enum LeftWheelMotorState {
        ON,
        OFF,
        REVERSED
    }

    public enum RIghtWheelMotorState{
        ON,
        OFF,
        REVERSED
    }

    public CANSParkMAX LeftWheelMotor = new CANSparkMax(Constants.Wheels.leftWheelMotor, MotorType.kBrushless);
    public CANSParkMAX RightWheelMotor = new CANSparkMax(Constants.Wheels.leftWheelMotor, MotorType.kBrushless);

    public DigitalInput WheelLimitSwitch = new DigitalInput(Constants.DIO.WHeelLimitSwitch);

    public LeftWheelMotorState leftWheelMotor = LeftWheelMotorState.OFF;
    public RightWheelMotorState rightWheelMotor = RightWheelMotorState.OFF;

    public Wheels() {
        this.LeftWheelMotor.setIdleMode(IdleMode.kBrake);
        this.RightWheelMotor.setIdleMode(IdleMode.kBrake);

        this.LeftWheelMotor.setSmartCurrentLimit(40);
        this.RightWheelMotor.setSmartCurrentLimit(40);
    }

    public void setLeftWheelMotorState(LeftWheelMotorState state) {
        this.leftWheelMotor = state;

        switch(state) {
            case ON: 
                this.LeftWheelMotor.set(Constants.Wheels.WheelForwardSpeed);
                break;
            case OFF:
                this.LeftWheelMotor.set(0.0);
                break;
            case REVERSED:
                this.LeftWheelMotor.set(Constants.Wheels.WheelBackwardsSpeed);
                break;
            default: 
                this.setLeftWheelMotorState(LeftWheelMotorState.OFF);
        }
    }

    public void setRightWheelMotorState(RightWheelMotorState state) {
        this.rightWheelMotor = state;

        switch(state) {
            case ON: 
                this.RightWheelMotor.set(Constants.Wheels.WheelForwardSpeed);
                break;
            case OFF:
                this.RightWheelMotor.set(0.0);
                break;
            case REVERSED:
                this.RightWheelMotor.set(Constants.Wheels.WheelBackwardsSpeed);
                break;
            default: 
                this.setRightWheelMotorState(RightWheelMotorState.OFF);
        }
    }

    public double getLeftWheelMotorPosition() {
        return this.LeftWheelMotor.getEncoder().getPosiion();
    }

    public double getRightWheelMotorPosition() {
        return this.RightWheelMotor.getEncoder().getPosiion();
    }

    public boolean getWheelSwitch() {
        return this.WheelLimitSwitch.get();
    }
}
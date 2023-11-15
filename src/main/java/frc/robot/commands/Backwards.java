package main.java.frc.robot.commands;

public class Backwards {
    
    public Backwards() {
        this.addRequirements(Robot.wheels);
    }

    public void execute() {

        if (Robot.wheels.getLeftWheelMotorPosition() >= -10) {
            Robot.wheels.setLeftWheelMotorState(Wheels.LeftWheelMotorState.REVERSED);
            Robot.wheels.setRightWheelMotorState(Wheels.RightWheelMotorState.REVERSED);
        }else {
            Robot.wheels.setLeftWheelMotorState(Wheels.LeftWheelMotorState.OFF);
            Robot.wheels.setRightWheelMotorState(Wheels.RightWheelMotorState.OFF);
        }
    }

    public oid end(boolean interrupted) {
        Robot.wheels.setLeftWheelMotorState(Wheels.LeftWheelMotorState.OFF);
        Robot.wheels.setRightWheelMotorState(Wheels.RightWheelMotorState.OFF);
    }
}

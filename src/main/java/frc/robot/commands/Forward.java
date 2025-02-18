package main.java.frc.robot.commands;

public class Forward extends commandBase {
    
    public Forward() {
        this.addRequirements(Robot.wheels);
    }

    public void execute() {

        if (Robot.wheels.getWheelSwitch() == false) {
            Robot.wheels.setLeftWheelMotorState(Wheels.LeftWheelMotorState.ON);
            Robot.wheels.setRightwheelMotorState(Wheels.RightWheelMotorState.ON);
        } else {
            Robot.wheels.setLeftWheelMotorState(Wheels.LeftWheelMotorState.OFF);
            Robot.wheels.setRightWheelMotorState(Wheels.RightWheelMotorState.OFF);
        }
    }

    public void end(boolean interrupted){
        Robot.wheels.setLeftWheelMotorState(Wheels.LeftWheelMotorState.OFF);
        Robot.wheels.setRightWheelMotorState(Wheels.RightWheelMotorState.OFF);
    }
}

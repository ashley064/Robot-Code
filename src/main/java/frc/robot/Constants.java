package frc.robot;

public final class Constants {
    
    public static class CANIds 
    {
        //Set the IDs of the motors
        public static final int leftWheelMotor = 1;
        public static final int rightWheelMotor = 2;
    }

    //Digital input and output
    public static class DIO 
    {
        //Switch plugged into port 1 on the robot
        public static int WheelLimitSwitch = 1;
    }

    public static class Wheels {
        public static int leftWheelMotor = CanIds.leftWheelMotor;
        public static int rightWheelMotor = CANIds.rightWheelMotor;

        //1 = 100%
        public static double WHeelFosrwardSpeed = 1;
        public static double WheelBackwardsSpeed = -1;
    }
}




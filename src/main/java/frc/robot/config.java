package frc.robot;
class Robot{
    public double JOYSTICK_X_MAP_A = 0.75;
    public double JOYSTICK_Y_MAP_A = 0.75;
    public double JOYSTICK_TWIST_MAP_A = 0.5;
    public double JOYSTICK_DEADZONE = 0.05;
    public double JOYSTICK_AVERAGE_PERIOD = 0;
    public double CAMERA_YAW_POS_0 = 0.19;
    public double CAMERA_YAW_POS_1 = 0.90;

    class Drivetrain{
        public double DRIVE_SPEED = 0.4;
        public double DRIVE_SLOW_SPEED = 0.1;
        public double DRIVE_TURN_SPEED = 0.3;
        public double VISION_RATIO = 0.5;
    }
    class Shooter{
        public double INTAKE_SPEED = 0.5;
        public double OUTTAKE_SPEED = 0.5;
        public double INTAKE_CONTROL_SPEED = 0.6;
        public double CONVEYOR_SPEED = 0.5;
        public double SHOOTER_SPEED_0 = 0.77;
        public double SHOOTER_SPEED_1 = 0.95;
}
    class Climber{
        public double CLIMBER_LEFT_UP_SPEED = 0.60;
        public double CLIMBER_RIGHT_UP_SPEED = 0.45;
        public double WINCH_LEFT_FRONT_UP_SPEED = 1.0;
        public double WINCH_LEFT_BACK_UP_SPEED = 1.0;
        public double WINCH_RIGHT_FRONT_UP_SPEED = 1.0;
        public double WINCH_RIGHT_BACK_UP_SPEED = 1.0;
        public double CLIMBER_LEFT_DOWN_SPEED = 0.60;
        public double CLIMBER_RIGHT_DOWN_SPEED = 0.60;
        public double WINCH_LEFT_FRONT_DOWN_SPEED = 1.0;
        public double WINCH_LEFT_BACK_DOWN_SPEED = 1.0;
        public double WINCH_RIGHT_FRONT_DOWN_SPEED = 1.0;
        public double WINCH_RIGHT_BACK_DOWN_SPEED = 1.0;
    }
}
class Autonomous{
    public double POS_1_FORWARD = 43.3;
    public double POS_1_TO_TRENCH = 66.9;
    public double POS_1_TRENCH = 156.3;
    public double POS_2_TRENCH_TURN = 17.9;
    public double POS_2_TURN = 29.1;
    public double POS_2_TO_TRENCH = 86.6;
    public double POS_2_TRENCH = 108;
    public double POS_3_SHOOT = 134.9;
    public double POS_3_TURN = 60.9;
    public double POS_3_TRENCH = 130.4;
    public double DRIVE_DISTANCE = 50.0;
    public double DS_8_TO_MID = 60.0;
    public double DS_8_TURN = 22.5;
    public double DS_8_FORWARD_MID = 86.3;
    public double DS_8_BACK_MID = 68.3;
    public double DS_SHOOT = 178.0;
}

class Drivetrain{
    public double ENCODER_RATIO = 1 / 1460;
}

class Shooter{
    public double CONVEYOR_INTAKE_SPEED = 0.85;
    public double CONVEYOR_SHOOT_SPEED = 0.85;

}
class Ports{

    public int CAMERA_SERVO_YAW = 1;

    class Drivetrain{
        public int LEFT_0 = 1;
        public int LEFT_1 = 2;
        public int RIGHT_0 = 3;
        public int RIGHT_1 = 4;
    }
    class Shooter{
        public int INTAKE = 5;
        public int CONVEYOR = 7;
        public int CONVEYOR_PROX_FRONT = 8;
        public int CONVEYOR_PROX_BACK = 9;
        public int SHOOTER_LEFT = 11;
        public int SHOOTER_RIGHT = 12;
        public int SHOOTER_PISTON_0 = 5;
        public int SHOOTER_PISTON_1 = 7;
    }
    class Climber{
        public int CLIMBER_LEFT = 16;
        public int CLIMBER_RIGHT = 13;
        public int WINCH_LEFT_FRONT = 18;
        public int WINCH_LEFT_BACK = 17;
        public int WINCH_RIGHT_FRONT = 14;
        public int WINCH_RIGHT_BACK = 15;
    }
}
class Buttons{
    class Joystick0{
        public int CAMERA = 11;

        class Drivetrain{
            public int VISION = 1;
        }
        class Shooter{
            public int CONVEYOR = 7;
        }
    }
    class Joystick1{
        class Climber{
            public int WINCH_LEFT_FRONT = 9;
            public int WINCH_LEFT_BACK = 11;
            public int WINCH_RIGHT_FRONT = 10;
            public int WINCH_RIGHT_BACK = 12;
            public int LEFT_UP = 5;
            public int LEFT_DOWN = 3;
            public int RIGHT_UP = 6;
            public int RIGHT_DOWN = 4;
        }
        class Shooter{
            public int INTAKE = 1;
            public int OUTTAKE = 2;
            public int SHOOT_0 = 7;
            public int SHOOT_1 = 8;
        }
    }
}
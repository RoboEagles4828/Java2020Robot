package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class DriveTrain{
    private TalonSRX left_0;
    private TalonSRX left_1;
    private TalonSRX right_0;
    private TalonSRX right_1;
    DriveTrain(int left_0, int left_1, int right_0, int right_1){
        this.left_0 = new TalonSRX(left_0);
        this.left_1 = new TalonSRX(left_1);
        this.right_0 = new TalonSRX(right_0);
        this.right_1 = new TalonSRX(right_1);
    }

    public void set_speeds(double left, double right){
        this.left_0.set(ControlMode.PercentOutput, left);
        this.left_1.set(ControlMode.PercentOutput, left);
        this.right_0.set(ControlMode.PercentOutput, right);
        this.right_1.set(ControlMode.PercentOutput, right);

    }
}
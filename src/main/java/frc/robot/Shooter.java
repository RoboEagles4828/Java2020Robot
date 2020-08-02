package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;

public class Shooter{
    private TalonSRX intake;
    private VictorSPX conveyor;
    private DigitalInput conveyor_prox_front;
    private DigitalInput conveyor_prox_back;
    private TalonSRX shooter_left;
    private TalonSRX shooter_right;
    private Solenoid shooter_piston_0;
    private Solenoid shooter_piston_1;
    private boolean shooter_status;

    Shooter(int intake, int conveyor, int conveyor_prox_front, int conveyor_prox_back,
            int shooter_left, int shooter_right, int shooter_piston_0, int shooter_piston_1){
            this.intake = new TalonSRX(intake);
            this.conveyor = new VictorSPX(conveyor);
            this.conveyor_prox_front = new DigitalInput(conveyor_prox_front);
            this.conveyor_prox_back = new DigitalInput(conveyor_prox_back);
            this.shooter_left = new TalonSRX(shooter_left);
            this.shooter_right = new TalonSRX(shooter_right);
            this.shooter_piston_0 = new Solenoid(shooter_piston_0);
            this.shooter_piston_1 = new Solenoid(shooter_piston_1);
    }

    public void set_intake_speed(double speed){
        intake.set(ControlMode.PercentOutput, speed);
        if(speed!=0){
            set_shooter(true);
        }
    }

    public double get_intake_speed(){
        return intake.getMotorOutputPercent();
    }
    
    public void set_conveyor(double speed){
        conveyor.set(VictorSPXControlMode.PercentOutput, speed);
    }

    public boolean get_conveyor_prox_front(){
        return conveyor_prox_front.get();
    }

    public boolean get_conveyor_prox_back(){
        return conveyor_prox_back.get();
    }

    public void set_shooter_speed(double speed){
        shooter_left.set(ControlMode.PercentOutput, speed);
        shooter_right.set(ControlMode.PercentOutput, speed);
    }

    public void set_shooter(boolean status){
        shooter_status = status;
    }

    public boolean get_shooter(){
        return shooter_status;
    }

    public void set_pistons(boolean status){
        shooter_piston_0.set(status);
        shooter_piston_1.set(status);
    }

}
package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.SampleRobot;
//import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {

	WPI_TalonSRX m_leftTalon1;
	WPI_TalonSRX m_rightTalon1;
	WPI_TalonSRX m_leftTalon2;
	WPI_TalonSRX m_rightTalon2;
	
	WPI_TalonSRX m_flyWheelL;
	WPI_TalonSRX m_flyWheelR;
	
	WPI_TalonSRX m_rollers;
	
	Joystick m_stick = new Joystick(0);
	XboxController m_xbox = new XboxController(1);
	
	public void robotInit()
	{
		m_leftTalon1 = new WPI_TalonSRX(2);
		m_leftTalon2 = new WPI_TalonSRX(4);
		m_rightTalon1 = new WPI_TalonSRX(1);
		m_rightTalon2 = new WPI_TalonSRX(3);
		
		m_flyWheelL = new WPI_TalonSRX(5);
		m_flyWheelR = new WPI_TalonSRX(6);
		
		m_rollers = new WPI_TalonSRX(8);
	}
	
	public void operatorControl()
	{
		while(isEnabled()) {
			m_leftTalon1.set(ControlMode.PercentOutput, -0.5 * m_xbox.getLeftY());
			m_leftTalon2.set(ControlMode.PercentOutput, -0.5 * m_xbox.getLeftY());
			
			m_rightTalon1.set(ControlMode.PercentOutput, m_xbox.getRightY());
			m_rightTalon2.set(ControlMode.PercentOutput, m_xbox.getRightY());
			
			if(m_xbox.getXButton()) {
				m_flyWheelL.set(ControlMode.PercentOutput, 0.75);
				m_flyWheelR.set(ControlMode.PercentOutput, -0.75);
			} else if(m_xbox.getAButton()) {
				m_flyWheelL.set(ControlMode.PercentOutput, 0.5);
				m_flyWheelR.set(ControlMode.PercentOutput, -0.5);
			} else if(m_xbox.getBButton()) {
				m_flyWheelL.set(ControlMode.PercentOutput, 0.25);
				m_flyWheelR.set(ControlMode.PercentOutput, -0.25);
			} else if(m_xbox.getBButton()) {
				m_flyWheelL.set(ControlMode.PercentOutput, 1.0);
				m_flyWheelR.set(ControlMode.PercentOutput, -1.0);
			} else {
				m_flyWheelL.set(ControlMode.PercentOutput, 0);
				m_flyWheelR.set(ControlMode.PercentOutput, 0);
			}
			
			if(m_xbox.getRawButton(8)) 
				m_rollers.set(ControlMode.PercentOutput, -0.5);
			else if(m_xbox.getRawButton(7))
				m_rollers.set(ControlMode.PercentOutput, 0.5);
			else
				m_rollers.set(ControlMode.PercentOutput, 0);
		}
	}
	
}
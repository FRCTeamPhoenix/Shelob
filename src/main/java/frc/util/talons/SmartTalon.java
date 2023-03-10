/*package frc.util.talons;

import java.util.concurrent.CancellationException;

import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.BaseMotorController;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.sensors.CANCoder;

//import edu.wpi.first.wpilibj.CAN;

public class SmartTalon extends CANCoder {
	
	private boolean m_inverted;

	private double m_maxForwardSpeed;
	private double m_maxReverseSpeed;
	
	private double m_goal;
	
	private PIDGains m_velocityGains;
	private PIDGains m_distanceGains;
	
	private int m_mode;
	
	public SmartTalon(int deviceNumber) {
		super(deviceNumber);	
		setToVelocity();
	}
	
	public SmartTalon(int deviceNumber, boolean inverted, int initialMode)
	{
		super(deviceNumber);
		m_inverted = inverted;
		m_mode = initialMode;
		
		m_velocityGains = new PIDGains(0,0,0,0,0,0);
		m_distanceGains = new PIDGains(0,0,0,0,0,0);
		
		if(initialMode == 0)
			setToVelocity();
		else if(initialMode == 1)
			setToDistance();
		else if(initialMode == 2)
			setToVelocity();
	}
	
	public SmartTalon(int deviceNumber, FeedbackDevice device, boolean inverted) {
		super(deviceNumber);
		
		m_maxForwardSpeed = 1.0;
		m_maxReverseSpeed = 1.0;
		m_inverted = inverted;
		
		m_velocityGains = new PIDGains(0,0,0,0,0,0);
		m_distanceGains = new PIDGains(0,0,0,0,0,0);
		
		setToVelocity();
	}
	
	/*public void setToVelocity()
	{
		setP(m_velocityGains.getP());
		setI(m_velocityGains.getI());
		setD(m_velocityGains.getD());
		setIZone(m_velocityGains.getIzone());
		setF(m_velocityGains.getFf());
		setVoltageRampRate(m_velocityGains.getRr());
	}

	public void setToDistance()
	{
		setP(m_distanceGains.getP());
		setI(m_distanceGains.getI());
		setD(m_distanceGains.getD());
		setIZone(m_distanceGains.getIzone());
		setF(m_distanceGains.getFf());
		setVoltageRampRate(m_distanceGains.getRr());
	}
	
	public void goAt(double speed)
	{
		speed = (speed > 1) ? 1 : speed;
		speed = (speed < -1) ? -1 : speed;
		
		speed = (speed > 0) ? speed * m_maxForwardSpeed : speed * m_maxReverseSpeed;
		
		if(!(m_mode == TalonControlMode.Speed.getValue())) {
			setToVelocity();
			changeControlMode(TalonControlMode.Speed);
			m_mode = TalonControlMode.Speed.getValue();
		}
		
		configMaxOutputVoltage(12);
		
		if(!m_inverted)
			setSetpoint(speed);
		else
			setSetpoint(-speed);
	}
	
	public void goVoltage(double speed)
	{
		if(!(m_mode == TalonControlMode.PercentVbus.getValue())) {
			changeControlMode(TalonControlMode.PercentVbus);
			m_mode = TalonControlMode.PercentVbus.getValue();
		}
		
		configMaxOutputVoltage(12);
		
		if(m_inverted)
			set(-speed);
		else
			set(speed);
	}
	
	public void goDistance(double distance, double speed)
	{
		speed = (speed > 1) ? 1 : speed;
		speed = (speed < -1) ? -1 : speed;
		
		double setPoint = getPosition() + distance;
		
		if(!(m_mode == TalonControlMode.Position.getValue())) {
			setToDistance();
			changeControlMode(TalonControlMode.Position);
			m_mode = TalonControlMode.Position.getValue();
		}
			
		
		configMaxOutputVoltage(12 * speed);
		
		if(!m_inverted)
			setSetpoint(setPoint);
		else
			setSetpoint(-setPoint);
	}
	
	
	
	public double getM_maxForwardSpeed() {
		return m_maxForwardSpeed;
	}

	public void setM_maxForwardSpeed(double m_maxFowardSpeed) {
		this.m_maxForwardSpeed = m_maxFowardSpeed;
	}

	public double getM_maxReverseSpeed() {
		return m_maxReverseSpeed;
	}

	public void setM_maxReverseSpeed(double m_maxReverseSpeed) {
		this.m_maxReverseSpeed = m_maxReverseSpeed;
	}

	public double getM_goal() {
		return m_goal;
	}

	public void setM_goal(double m_goal) {
		this.m_goal = m_goal;
	}

	public boolean isM_inverted() {
		return m_inverted;
	}

	public int getM_mode() {
		return m_mode;
	}

	public void setM_mode(int m_mode) {
		this.m_mode = m_mode;
	}
	
	

}*/

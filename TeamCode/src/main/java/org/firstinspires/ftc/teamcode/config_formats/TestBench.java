package org.firstinspires.ftc.teamcode.config_formats;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by asowd on 11/16/2016.
 */

public class TestBench extends LinearOpMode{
    private DcMotor MOTOR_1 = hardwareMap.dcMotor.get("MOTOR_1");
    private Servo SERVO_1 = hardwareMap.servo.get("SERVO_1");

    private ColorSensor COLOR_1 = hardwareMap.colorSensor.get("COLOR_1");
    private GyroSensor GYRO_1= hardwareMap.gyroSensor.get("GYRO_1");
    private IrSeekerSensor IR_1 = hardwareMap.irSeekerSensor.get("IR_1");
    private OpticalDistanceSensor DIST_1 = hardwareMap.opticalDistanceSensor.get("DIST_1");
    private TouchSensor TOUCH_1 = hardwareMap.touchSensor.get("TOUCH_1");

    private int[] color_array = {0, 0, 0, 0};

    public void telemetryDisplay(){
        color_array[0] = COLOR_1.red();
        color_array[1] = COLOR_1.green();
        color_array[2] = COLOR_1.blue();
        color_array[3] = COLOR_1.alpha();

        telemetry.addData("Motor_Pos", MOTOR_1.getCurrentPosition());
        telemetry.addData("Motor_Power", MOTOR_1.getPower());
        telemetry.addData("servo",SERVO_1.getPosition());

        telemetry.addData("Color_val", COLOR_1.toString());
        telemetry.addData("Gyro_val", GYRO_1.toString());
        telemetry.addData("IR", IR_1.toString());
        telemetry.addData("Distance", DIST_1.getLightDetected());
        telemetry.addData("Touch", TOUCH_1.isPressed());
    }

    public void runOpMode() throws InterruptedException{
        waitForStart();
        while (opModeIsActive()){

            idle();
        }
    }

}


package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="TestingOp", group="Linear Opmode")

public class TestingOp extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();
    //double maxPaddle;
    //double incriment = 0.04;
    //double midPaddleLeft = 0;
    //double midPaddleRight = 0;
    DcMotor leftMotor = null;
      DcMotor rightMotor = null;
    ColorSensor rgb = null;

    //Servo leftPaddle = null;
    //Servo rightPaddle = null;


    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        leftMotor  = hardwareMap.dcMotor.get("leftMotor");
         rightMotor = hardwareMap.dcMotor.get("rightMotor");

        //leftPaddle = hardwareMap.servo.get("leftPaddle");
        //rightPaddle = hardwareMap.servo.get("rightPaddle");

         leftMotor.setDirection(DcMotor.Direction.FORWARD);
         rightMotor.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.update();

             leftMotor.setPower(-gamepad1.left_stick_y);
             rightMotor.setPower(-gamepad1.right_stick_y);

            //maxPaddle = Range.clip(incriment, -0.5, 0.5);

            //while (gamepad1.x) {
                //midPaddleLeft += incriment;
                //leftPaddle.setPosition(midPaddleLeft);


            
            //while (gamepad1.y) {
               // midPaddleLeft -= incriment;
                //leftPaddle.setPosition( midPaddleLeft);





            idle();
        }
    }
}

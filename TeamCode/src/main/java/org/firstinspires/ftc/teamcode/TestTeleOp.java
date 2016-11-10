
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name="TestTeleOp", group = "OpModes")
public class TestTeleOp extends OpMode {

    OpProperties robot = new OpProperties();

    @Override
    public void init() {

        robot.init(hardwareMap);

        telemetry.addData("Say", "Wassah Driver");
        updateTelemetry(telemetry);
    }

    @Override
    public void loop() {

        double left;
        double right;
        double middle = 0;
        double incriment = .04;

        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;

        telemetry.addData("left",  "%.2f", left);
        telemetry.addData("right", "%.2f", right);
        updateTelemetry(telemetry);
    }

    @Override
    public void stop() {
    }

}

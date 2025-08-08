package ch14_abstraction.interfaces;
/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteController의 필드에 추가하고
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUPVolumeUPButton() 메서드 정의하시고
    Main에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다
    음량을 계속 올립니다. # 1으로 푸시오
    음량을 계속 올립니다. # 2으로 푸시오
 */
public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButten channelDownButten = new ChannelDownButten();
//        ChannelUpButten channelUpButten = new ChannelUpButten();
//        TvRemoteController tvRemoteController = new TvRemoteController(powerButton,channelDownButten,channelUpButten);
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(new PowerButton(),new ChannelDownButten(),new ChannelUpButten(),new VolumeDownButton(),new VolumeUpButton());

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelupButton();
        // # 1 에 대한 Main에서의 실행 방법
        System.out.println(tvRemoteController.onUpChannelupButton1());
        // # 2 에 대한 Main에서의 실행 방법
        tvRemoteController.onUpChannelupButton2();

        System.out.println();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        System.out.println(tvRemoteController.onUPVolumeUPButton1());
        tvRemoteController.onUPVolumeUPButton2();

        System.out.println();
        AirConditionerController airConditionerController = new AirConditionerController(new PowerButton(),new TemperatureDownButton(),new TemperatureUpButton(),new ModeChangeButton());
        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressedTemperatureUpButton();
        System.out.println(airConditionerController.onUpTemperatureUpButton1());
        airConditionerController.onUpTemperatureUpButton2();
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedModeChangeButton();
    }
}

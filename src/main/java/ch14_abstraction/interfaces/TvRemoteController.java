package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;                // 접근지정자 클래스명 객체명 -> 여태까지 작성법과 다릅니다.
    private ChannelDownButten channelDownButten;
    private ChannelUpButten channelUpButten;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButten channelDownButten,
                              ChannelUpButten channelUpButten,
                              VolumeDownButton volumeDownButton,
                              VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButten = channelDownButten;
        this.channelUpButten = channelUpButten;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton(){
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton(){
        channelDownButten.onPressed();
    }

    public void onDownChannelDownButton(){
        channelDownButten.onDown();
    }

    // onPressedChannelDownButton() 메서드 / onDownChannelDownButton() 메서드를 구현하시고
    // Main에서 실행하여
    // 실행 예
    // 채널 한 칸을 올립니다.
    // 채널을 계속 올립니다.

    public void onPressedChannelupButton(){
        channelUpButten.onPressed();
    }

    // # 1
    public String onUpChannelupButton1(){
        return channelUpButten.onUp();      // onUp();의 결과값이 return "체널을 계속" + super.onUp();
    }

    // # 2
    public void onUpChannelupButton2(){
        System.out.println(channelUpButten.onUp());
    }

    public void onPressedVolumeDownButton(){
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }

    public String onUPVolumeUPButton1(){
     return volumeUpButton.onUp();
    }

    public void onUPVolumeUPButton2(){
        System.out.println(volumeUpButton.onUp());
    }





}

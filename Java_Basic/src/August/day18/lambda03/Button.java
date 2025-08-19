package August.day18.lambda03;

public class Button {
    //정적 멤버 인터페이스
    public static interface ClickListener {
        void onCLick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onCLick();
    }

    public static void main(String[] args) {
        Button buttonOk = new Button();

        buttonOk.setClickListener(
                () -> {
                    System.out.println("Button clicked!");
                }
        );


    }

}

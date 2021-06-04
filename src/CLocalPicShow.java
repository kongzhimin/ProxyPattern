public class CLocalPicShow implements IShowPic,Runnable{

    private IShowPic pic;
    private String PicName;
    @Override
    public void ShowPic(String PicName) {
        pic = new CRemoPic();
        this.PicName=PicName;
        System.out.println("准备载入图片"+PicName);
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        pic.ShowPic(PicName);
        System.out.println(PicName+"图片调用完成！");
    }
}

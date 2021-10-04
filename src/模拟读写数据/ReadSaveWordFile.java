package 模拟读写数据;

public class ReadSaveWordFile implements IReadSaveData{
    public void saveData(String data){
        System.out.println("将数据保存到word文件中");
    }
    public String getData(){
        System.out.println("从word文件中读取数据");
        return null;
    }
}

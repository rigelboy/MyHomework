package 模拟读写数据;

public class ReadSaveTextFile implements IReadSaveData{
    public void saveData(String data){
        System.out.println("将数据保存到文本文件中");
    }
    public String getData(){
        System.out.println("从文本中读出去了数据");
        return null;
    }
}

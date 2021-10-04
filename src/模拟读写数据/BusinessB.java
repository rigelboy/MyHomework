package 模拟读写数据;

public class BusinessB {
    private IReadSaveData iReadSaveData;
    public IReadSaveData getiReadSaveData(){
        return iReadSaveData;
    }
    public   BusinessB(IReadSaveData iReadSaveData){
        this.iReadSaveData = iReadSaveData;
    }
    public void saveData(String data){
        iReadSaveData.saveData(data);
    }
    public String getdata(){
       return iReadSaveData.getData();
    }
}

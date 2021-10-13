package 模拟读写数据;

public class BusinessA {
    private IReadSaveData iReadSaveData;
    private BusinessB hello;
    public IReadSaveData getiReadSaveData(){
        return iReadSaveData;
    };
    public void setiReadSaveData(IReadSaveData iReadSaveData){
        this.iReadSaveData = iReadSaveData;
    }
    public BusinessA(IReadSaveData iReadSaveData){
        this.iReadSaveData = iReadSaveData;
    }
    public void saveData(String data){
        iReadSaveData.saveData(data);
    }
    public String getData(){
        return iReadSaveData.getData();
    }

}



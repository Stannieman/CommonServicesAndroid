package stannieman.commonservices.models;

public class ServiceResult<DataType> {

    public static final int OK = 0;

    //region isSuccess

    private boolean isSuccess;

    public boolean isSuccess() {
        return isSuccess;
    }

    //endregion

    //region resultCode

    private int resultCode;

    public int getResultCode() {
        return resultCode;
    }

    //endregion

    //region data

    private DataType data;

    public DataType getData() {
        return data;
    }

    //endregion

    public ServiceResult() {
        this.isSuccess = true;
        this.resultCode = OK;
    }

    public ServiceResult(boolean isSuccess, int resultCode) {
        this.isSuccess = isSuccess;
        this.resultCode = resultCode;
    }

    public ServiceResult(DataType data) {
        this.isSuccess = true;
        this.resultCode = OK;
        this.data = data;
    }

    public ServiceResult(boolean isSuccess, int resultCode, DataType data) {
        this.isSuccess = isSuccess;
        this.resultCode = resultCode;
        this.data = data;
    }
}

package stannieman.commonservices.models;

public class ServiceResult<DataType> {

    /**
     * Result code indicating that the operation was successful.
     * This code (0) is the only reserved code is the default one.
     */
    public static final int OK = 0;

    //region isSuccess

    private boolean isSuccess;

    /**
     * Returns whether the operation completed successfully.
     * @return true if the operation completed successfully, false otherwise
     */
    public boolean isSuccess() {
        return isSuccess;
    }

    //endregion

    //region resultCode

    private int resultCode;

    /**
     * Returns the result code of the operation.
     * @return the result code of the operation
     */
    public int getResultCode() {
        return resultCode;
    }

    //endregion

    //region data

    private DataType data;

    /**
     * Returns the actual return data of the operation.
     * @return the return data of the operation or null if there is nothing to return
     */
    public DataType getData() {
        return data;
    }

    //endregion

    /**
     * Default constructor.
     * Initializes the result as successful with the default result code.
     */
    public ServiceResult() {
        this.isSuccess = true;
        this.resultCode = OK;
    }

    /**
     * Constructor to set the isSuccess state and result code.
     * The data left null.
     * @param isSuccess whether the operation completed successfully
     * @param resultCode result code of the operation
     */
    public ServiceResult(boolean isSuccess, int resultCode) {
        this.isSuccess = isSuccess;
        this.resultCode = resultCode;
    }

    /**
     * Constructor that sets the return data.
     * The result is initialized as successful with the default result code.
     * @param data return data of the operation
     */
    public ServiceResult(DataType data) {
        this.isSuccess = true;
        this.resultCode = OK;
        this.data = data;
    }

    /**
     * Constructor that sets the return data, isSuccess state and result code.
     * @param isSuccess whether the operation
     * @param resultCode result code of the operation
     * @param data return data of the operation
     */
    public ServiceResult(boolean isSuccess, int resultCode, DataType data) {
        this.isSuccess = isSuccess;
        this.resultCode = resultCode;
        this.data = data;
    }
}

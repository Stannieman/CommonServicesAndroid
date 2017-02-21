package stannieman.commonservices.models;

/**
 * Class representing the result of some action.
 * @param <DataType> the type of the result data
 * @param <ResultCodeType> the type of the result code
 */
public final class ServiceResult<DataType, ResultCodeType> implements IHasSuccessState, IHasResultCode<ResultCodeType>, IHasDataAndSuccessState<DataType> {

    //region isSuccess

    private boolean isSuccess;

    /**
     * Returns whether the operation completed successfully.
     * @return true if the result code is GeneralResultCodes.OK, false otherwise
     */
    public boolean isSuccess() {
        return isSuccess || resultCode == GeneralResultCodes.OK;
    }

    //endregion

    //region resultCode

    private ResultCodeType resultCode;

    /**
     * Returns the result code.
     * @return the result code
     */
    public ResultCodeType getResultCode() {
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
     * Initializes the result as successful without result code.
     * The data is left null.
     */
    public ServiceResult() {
        isSuccess = true;
    }

    /**
     * Initializes the result with the given result code.
     * The data is left null.
     * @param resultCode the result code
     */
    public ServiceResult(ResultCodeType resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * Initializes the result with the given data and result code.
     * @param data the data
     * @param resultCode the result code
     */
    public ServiceResult(DataType data, ResultCodeType resultCode) {
        this.data = data;
        this.resultCode = resultCode;
    }
}

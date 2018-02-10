package stannieman.commonservices.models;

/**
 * Class representing the result of some action.
 * @param <ResultCodeType> the type of the result code
 */
public class ServiceResult<ResultCodeType> implements IHasSuccessState, IHasResultCode<ResultCodeType> {

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

    /**
     * Default constructor.
     * Initializes the result as successful without result code.
     */
    public ServiceResult() {
        isSuccess = true;
    }

    /**
     * Initializes the result with the given result code.
     * @param resultCode the result code
     */
    public ServiceResult(ResultCodeType resultCode) {
        this.resultCode = resultCode;
    }
}
package stannieman.commonservices.models;

/**
 * Class representing the result of some action that is expected to return something.
 * @param <DataType> the type of the result data
 * @param <ResultCodeType> the type of the result code
 */
public final class DataServiceResult<DataType, ResultCodeType> extends ServiceResult<ResultCodeType> implements IHasDataAndSuccessState<DataType> {

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
    public DataServiceResult() {
        super();
    }

    /**
     * Initializes the result with the given result code.
     * The data is left null.
     * @param resultCode the result code
     */
    public DataServiceResult(ResultCodeType resultCode) {
        super(resultCode);
    }

    /**
     * Initializes the result with the given data and result code.
     * @param data the data
     * @param resultCode the result code
     */
    public DataServiceResult(DataType data, ResultCodeType resultCode) {
        super(resultCode);
        this.data = data;
    }
}
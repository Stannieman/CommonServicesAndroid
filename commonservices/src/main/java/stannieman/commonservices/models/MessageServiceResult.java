package stannieman.commonservices.models;

/**
 * Class representing the result of some action.
 * @param <T> the type of the result data
 */
public final class MessageServiceResult<T> implements IHasSuccessState, IHasDataAndSuccessState<T> {

    //region isSuccess

    private final boolean isSuccess;

    /**
     * Returns whether the operation completed successfully.
     * @return true if the operation was successful, false otherwise
     */
    public boolean isSuccess() {
        return isSuccess;
    }

    //endregion

    //region message

    private String message;

    /**
     * Returns the result message.
     * @return the result message
     */
    public String getMessage() {
        return message;
    }

    //endregion

    //region data

    private T data;

    /**
     * Returns the actual return data of the operation.
     * @return the return data of the operation or null if there is nothing to return
     */
    public T getData() {
        return data;
    }

    //endregion

    /**
     * Constructor accepting the return data of the operation.
     * The result is considered successful.
     * @param data the return data of the operation
     */
    public MessageServiceResult(T data) {
        this.data = data;
        this.isSuccess = true;
    }

    /**
     * Constructor accepting the success state and result message.
     * The data is left null.
     * @param isSuccess whether the operation was successful
     * @param message the result message
     */
    public MessageServiceResult(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }

    /**
     * Constructor accepting the data, success state and result message.
     * @param data the return data of the operation
     * @param isSuccess whether the operation was successful
     * @param message the result message
     */
    public MessageServiceResult(T data, boolean isSuccess, String message) {
        this.data = data;
        this.isSuccess = isSuccess;
        this.message = message;
    }
}

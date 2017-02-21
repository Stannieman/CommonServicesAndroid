package stannieman.commonservices.models;

/**
 * Interface defining a service result that has data and a success state.
 */
public interface IHasDataAndSuccessState<DataType> extends IHasSuccessState {
    /**
     * Returns the actual return data of the operation.
     * @return the return data of the operation or null if there is nothing to return
     */
    DataType getData();
}

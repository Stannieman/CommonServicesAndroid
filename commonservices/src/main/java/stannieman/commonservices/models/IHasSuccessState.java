package stannieman.commonservices.models;

/**
 * Interface defining a service result that has a success state.
 */
public interface IHasSuccessState {
    /**
     * Returns whether the operation completed successfully.
     * @return true if the the operation was successful, false otherwise
     */
    boolean isSuccess();
}

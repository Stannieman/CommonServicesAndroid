package stannieman.commonservices.models;

/**
 * Interface defining a class that has a result code.
 */
public interface IHasResultCode<ResultCodeType> {
    /**
     * Returns the result code.
     * @return the result code
     */
    ResultCodeType getResultCode();
}

package stannieman.commonservices.resultCodeTranslators;

import stannieman.commonservices.models.IHasDataAndSuccessState;
import stannieman.commonservices.models.IHasSuccessState;
import stannieman.commonservices.models.ServiceResult;

/**
 * A translator to convert a result code to a string.
 * This is typically used to translate the result code of an operation
 * to a user friendly message.
 */
public abstract class ServiceResultCodeTranslatorBase extends ResultCodeTranslatorBase implements IServiceResultCodeTranslator {

    /**
     * Constructor accepting a default string.
     * The default string is used of no string can be found for the
     * given result code.
     * @param defaultString default string
     */
    protected ServiceResultCodeTranslatorBase(String defaultString) {
        super(defaultString);
    }

    /**
     * Converts the result code of the given instance to a string.
     * @param serviceResult instance to take the result code from
     * @return the string for the given result code
     */
    @Override
    public String getErrorMessage(ServiceResult serviceResult) {
        return getErrorMessage((Object)serviceResult);
    }

    /**
     * Converts the result code of the given instance to a string.
     * If the instance does not implement IHasResultCode the default
     * string is returned.
     * @param hasSuccessState instance to take the result code from
     * @return the string for the given result code
     */
    @Override
    public String getErrorMessage(IHasSuccessState hasSuccessState) {
        return getErrorMessage((Object)hasSuccessState);
    }

    /**
     * Converts the result code of the given instance to a string.
     * If the instance does not implement IHasResultCode the default
     * string is returned.
     * @param hasDataAndSuccessState instance to take the result code from
     * @return the string for the given result code
     */
    @Override
    public String getErrorMessage(IHasDataAndSuccessState hasDataAndSuccessState) {
        return getErrorMessage((Object)hasDataAndSuccessState);
    }
}

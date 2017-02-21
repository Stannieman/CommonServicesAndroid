package stannieman.commonservices.resultCodeTranslators;

import stannieman.commonservices.models.IHasResultCode;

/**
 * Defines a translator to convert a result code to a string.
 * This is typically used to translate the result code of an operation
 * to a user friendly message.
 */
public interface IResultCodeTranslator {

    /**
     * Converts the result code of the given instance to a string.
     * @param hasResultCode instance to take the result code from
     * @return the string for the given result code
     */
    String getErrorMessage(IHasResultCode hasResultCode);
}

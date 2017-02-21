package stannieman.commonservices.resultCodeTranslators;

import stannieman.commonservices.models.IHasDataAndSuccessState;
import stannieman.commonservices.models.IHasSuccessState;
import stannieman.commonservices.models.ServiceResult;

/**
 * Defines a translator to convert a result code to a string.
 * This is typically used to translate the result code of an operation
 * to a user friendly message.
 */
public interface IServiceResultCodeTranslator extends IResultCodeTranslator {
    String getErrorMessage(ServiceResult serviceResult);
    String getErrorMessage(IHasSuccessState serviceResult);
    String getErrorMessage(IHasDataAndSuccessState serviceResult);
}

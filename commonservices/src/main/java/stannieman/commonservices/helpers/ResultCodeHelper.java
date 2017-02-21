package stannieman.commonservices.helpers;

import stannieman.commonservices.models.IHasResultCode;

/**
 * Class to give info about the result code of a ServiceResult.
 */
public abstract class ResultCodeHelper {

    /**
     * Returns whether an object implements IHasResultCode and has a result code of the given type.
     * @param object object to check
     * @param resultCodeType Class instance of the result code type to check for
     * @param <ResultCodeType> result code type to check for
     * @return whether the give object has a result code of the given type
     */
    public static <ResultCodeType> boolean HasResultCodeOfType(Object object, Class<ResultCodeType> resultCodeType) {
        return object instanceof IHasResultCode && resultCodeType.isInstance(((IHasResultCode)object).getResultCode());
    }

    /**
     * Returns the result code of an object casted to the given type.
     * If the given type does not match or the object doesn't implement IHasResultCode null is returned.
     * @param object object to get result code for
     * @param resultCodeType Class instance of the result code type to check for
     * @param <ResultCodeType> type of the result code
     * @return the result code casted to the given type or null if types don't match
     */
    @SuppressWarnings("unchecked")
    public static <ResultCodeType> ResultCodeType GetResultCodeOrNull(Object object, Class<ResultCodeType> resultCodeType) {
        if (object instanceof IHasResultCode) {
            Object resultCode = ((IHasResultCode)object).getResultCode();
            if (resultCodeType.isInstance(resultCode)) {
                return (ResultCodeType)resultCode;
            }

            return null;
        }

        return null;
    }

    /**
     * Returns the result code of an object casted to the given type.
     * If the given type does not match or the object doesn't implement IHasResultCode an exception is thrown.
     * @param object object to get result code for
     * @param resultCodeType Class instance of the result code type to check for
     * @param <ResultCodeType> type of the result code
     * @return the result code casted to the given type
     */
    @SuppressWarnings("unchecked")
    public static <ResultCodeType> ResultCodeType GetResultCode(Object object, Class<ResultCodeType> resultCodeType) {
        if (object instanceof IHasResultCode) {
            Object resultCode = ((IHasResultCode)object).getResultCode();
            if (resultCodeType.isInstance(resultCode)) {
                return (ResultCodeType)resultCode;
            }

            return null;
        }

        return null;
    }
}

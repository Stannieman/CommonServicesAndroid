package stannieman.commonservices.resultCodeTranslators;

import java.util.Map;

import stannieman.commonservices.models.IHasResultCode;

/**
 * A translator to convert a result code to a string.
 * This is typically used to translate the result code of an operation
 * to a user friendly message.
 */
public abstract class ResultCodeTranslatorBase implements IResultCodeTranslator {
    private Map<Object, String> map  = null;
    private final String defaultString;

    /**
     * Constructor accepting a default string.
     * The default string is used of no string can be found for the
     * given result code.
     * @param defaultString default string
     */
    protected ResultCodeTranslatorBase(String defaultString) {
        this.defaultString = defaultString;
    }

    /**
     * Converts the result code of the given instance to a string.
     * @param hasResultCode instance to take the result code from
     * @return the string for the given result code
     */
    @Override
    public String getErrorMessage(IHasResultCode hasResultCode) {
        return getErrorMessage((Object)hasResultCode);
    }

    String getErrorMessage(Object object) {
        if (object instanceof IHasResultCode) {
            Object resultCode = ((IHasResultCode)object).getResultCode();

            if (map == null) {
                map = getMap();
            }

            if (map.containsKey(resultCode)) {
                return map.get(resultCode);
            }

            return defaultString;
        }

        return defaultString;
    }

    /**
     * Implementations of translators must implement this method.
     * It must return a map with result codes as keys and the strings
     * to translate them to as values.
     * @return map with result codes and strings
     */
    protected abstract Map<Object, String> getMap();
}

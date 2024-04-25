
public class mixed {
}


public class array {
}


public class int {
}


public class bool {
}


public class void {
}


public class null {
}


public class object {
}


public class resource {
}


interface Iterator {
}


interface Countable {
}


class Exception {
}


class Kount_Ris_ArraySettings {
    protected array $settings;

    public void __construct(final array $settings) {
        // TODO Auto-generated return
        return null;
    }

    public int getMerchantId() {
        // TODO Auto-generated return
        return null;
    }

    public String getRisUrl() {
        // TODO Auto-generated return
        return null;
    }

    public String getX509CertPath() {
        // TODO Auto-generated return
        return null;
    }

    public String getX509KeyPath() {
        // TODO Auto-generated return
        return null;
    }

    public String getX509Passphrase() {
        // TODO Auto-generated return
        return null;
    }

    public int getConnectionTimeout() {
        // TODO Auto-generated return
        return null;
    }

    public String getApiKey() {
        // TODO Auto-generated return
        return null;
    }

}


interface Kount_Ris_Settings {
    int getMerchantId();

    String getRisUrl();

    String getX509CertPath();

    String getX509KeyPath();

    String getX509Passphrase();

    int getConnectionTimeout();

    String getApiKey();

}


class Kount_Util_Khash {
    public static String hashPaymentToken(final String $token) {
        // TODO Auto-generated return
        return null;
    }

    public static String hashGiftCard(final int $merchantId, final String $cardNumber) {
        // TODO Auto-generated return
        return null;
    }

    public static String hash(final String $data, final int $len) {
        // TODO Auto-generated return
        return null;
    }

}


class Kount_Ris_IllegalArgumentException extends Exception {
}


class Kount_Ris_Exception extends Exception {
}


class Kount_Ris_ValidationException extends Exception {
}


class Kount_Ris_Data_KcEvent {
    protected String $decision;

    protected String $expression;

    protected String $code;

    public void __construct(final String $decision, final String $expression, final String $code) {
        // TODO Auto-generated return
        return null;
    }

    public String getDecision() {
        // TODO Auto-generated return
        return null;
    }

    public String getExpression() {
        // TODO Auto-generated return
        return null;
    }

    public String getCode() {
        // TODO Auto-generated return
        return null;
    }

}


class Kount_SimpleLogger_File {
    public static String TIME_FORMAT = 'Y-m-d\TH:i:sP';

    protected array $logLevels = array('FATAL'=>5,'ERROR'=>4,'WARN'=>3,'INFO'=>2,'DEBUG'=>1,);

    protected String $name;

    protected String $logFilePath;

    protected String $logLevel;

    public void __construct(final String $name) {
        // TODO Auto-generated return
        return null;
    }

    public void debug(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    public void info(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    public void warn(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    public void error(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    public void fatal(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    protected void processMessage(final String $message, final String $level, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    protected String formatMessage(final String $message, final String $level, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    protected void log(final String $message) {
        // TODO Auto-generated return
        return null;
    }

    protected boolean isLoggable(final String $level) {
        // TODO Auto-generated return
        return false;
    }

}


class Kount_Log_Binding_NopLogger {
    public void __construct(final String $name) {
        // TODO Auto-generated return
        return null;
    }

    public void debug(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    public void info(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    public void warn(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    public void error(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    public void fatal(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

}


interface Kount_Log_Binding_Logger {
    void debug(final String $message, final Exception $exception);

    void info(final String $message, final Exception $exception);

    void warn(final String $message, final Exception $exception);

    void error(final String $message, final Exception $exception);

    void fatal(final String $message, final Exception $exception);

}


class Kount_Log_Factory_LogFactory {
    public static String NOP_LOGGER = 'NOP';

    public static String SIMPLE_LOGGER = 'SIMPLE';

    protected static Kount_Log_Factory_LoggerFactory $loggerFactory = null;

    public static Kount_Log_Factory_LoggerFactory getLoggerFactory() {
        // TODO Auto-generated return
        return null;
    }

    public static void setLoggerFactory(final Kount_Log_Factory_LoggerFactory $factory) {
        // TODO Auto-generated return
        return null;
    }

}


interface Kount_Log_Factory_LoggerFactory {
    static Kount_Log_Factory_LoggerFactory getLogger(final String $name) {
        // TODO Auto-generated return
        return null;
    }

}


import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("ec19dc91-13d5-454c-9b93-eeba903ea68b")
public class mixed {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("71ca3830-0010-499a-9c7b-eb3475de043a")
public class array {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("0cc01231-4b35-4565-acc7-e4a80e74da7d")
public class int {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("cbe5acac-7ed8-4128-b386-de0badffc0d4")
public class bool {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("725f2f9f-c4f4-4876-bb97-da64338f0b00")
public class void {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("05aca7cf-800b-4a2d-a86a-ec288921273e")
public class null {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("cdf9d6a3-bd83-4f3f-8372-472dc96567e7")
public class object {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("3d8c1fb0-8e1e-470e-b57d-738064a26faf")
public class resource {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("141931dd-df14-488a-88ed-7e04791cd15f")
interface Iterator {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ef974850-36cd-48dd-9b80-cd51653df3a6")
interface Countable {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8511e9cf-64b6-47a5-ae27-3353bbf5a7f9")
class Exception {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4bf7d217-d2a4-4f4e-9556-1a3196986c5f")
class Kount_Ris_ArraySettings {
    @objid ("4c42ba73-bd64-4d1d-a84a-4c21edf151f3")
    protected array $settings;

    @objid ("296c7afb-034b-4dcb-937e-77f7801e7405")
    public void __construct(final array $settings) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("c765b48f-08ec-4db7-8640-48e69a86b27e")
    public int getMerchantId() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("1c75df01-9da7-4b23-9e9b-2cd5a11a3264")
    public String getRisUrl() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("e1ba3fb4-b8f0-44fc-85c8-5c598ac7b0d3")
    public String getX509CertPath() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("7e97e99a-ddaa-4337-a5da-b9bb9d58305a")
    public String getX509KeyPath() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("bec331e1-bc7b-4c13-b361-75afdd274c48")
    public String getX509Passphrase() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("01d2abd3-8fce-460c-834a-f5a1f432d04a")
    public int getConnectionTimeout() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("7f2f466a-73eb-453d-9919-343524e33775")
    public String getApiKey() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c3b53d4e-e5c3-430d-a4ba-47997373b003")
interface Kount_Ris_Settings {
    @objid ("64de0f48-8040-4058-b4da-0cecfa9052d1")
    int getMerchantId();

    @objid ("d3c137ac-41ff-41a2-9932-347cdf30cd10")
    String getRisUrl();

    @objid ("d178fd2f-060e-4941-a395-17e7269d79f3")
    String getX509CertPath();

    @objid ("6ae26f81-4f65-42ea-a6ff-38d7fd54c246")
    String getX509KeyPath();

    @objid ("a1d780bf-7601-411e-84ca-9b85c5a97b66")
    String getX509Passphrase();

    @objid ("28572214-3b72-498f-8198-7c6ad11763c1")
    int getConnectionTimeout();

    @objid ("bb8ed1db-95ee-4e72-a57c-37d4785e613a")
    String getApiKey();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("52003177-b2fe-4538-8193-92804eb8af1f")
class Kount_Util_Khash {
    @objid ("ce3c4f2f-0ab0-436e-8554-a3f9093b331d")
    public static String hashPaymentToken(final String $token) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("35ffbdb9-cbe6-4216-85cb-54077a35bd7a")
    public static String hashGiftCard(final int $merchantId, final String $cardNumber) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("3fe77ae8-cb1e-40d7-bc2e-9910d5b240a7")
    public static String hash(final String $data, final int $len) {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("320732bb-9e90-46b4-af2a-8fad914514b9")
class Kount_Ris_IllegalArgumentException extends Exception {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1c003e65-48ed-47c2-b0ac-4be6c553bdde")
class Kount_Ris_Exception extends Exception {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6ceacf46-3998-4aa0-86fc-55cfaadf3918")
class Kount_Ris_ValidationException extends Exception {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3bf49837-5d53-45bc-92b0-a59577dfbd81")
class Kount_Ris_Data_KcEvent {
    @objid ("b7555fb3-15b4-4e7f-9f79-4077ad52102a")
    protected String $decision;

    @objid ("261e604c-36f7-48d6-aa9b-0e4ab1d5ac59")
    protected String $expression;

    @objid ("e3599764-e620-400b-a8e8-d5c5bb760c9c")
    protected String $code;

    @objid ("51677af8-5fce-4437-b463-acf9f746c4ee")
    public void __construct(final String $decision, final String $expression, final String $code) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("1983e4be-c2a8-48fb-807e-ad9f2e46f384")
    public String getDecision() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("73ed3ca6-1e4c-41fb-8f58-d4df5c1c7565")
    public String getExpression() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("f1bb5e76-ee11-4a18-9b01-e64432bae7c4")
    public String getCode() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("11240ee5-19d4-4f33-ba02-67b19af99f0a")
class Kount_SimpleLogger_File {
    @objid ("c82a92f9-71ef-4e36-a6fa-8223dcb54723")
    public static String TIME_FORMAT = 'Y-m-d\TH:i:sP';

    @objid ("cfa8e57c-eaba-441a-96a7-ce5b38d9c2e9")
    protected array $logLevels = array('FATAL'=>5,'ERROR'=>4,'WARN'=>3,'INFO'=>2,'DEBUG'=>1,);

    @objid ("1678d81b-f4db-4f5b-b956-ff7ec8e4bf83")
    protected String $name;

    @objid ("b0391daa-2bb1-460b-ba12-e08b712f91f6")
    protected String $logFilePath;

    @objid ("9d7d5961-b1e7-468a-8fee-b493853faada")
    protected String $logLevel;

    @objid ("6eac966f-d0d0-4a87-a991-604d39a5ea18")
    public void __construct(final String $name) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("cbbb276f-36d9-4634-8f38-1228796f9194")
    public void debug(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("4285415f-de6d-4f7c-8187-6f1b9bceca1a")
    public void info(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("fd832e58-2ce5-450d-9120-5c59f99f320b")
    public void warn(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("9d63c687-3f56-47ab-9d6f-e97578132d0f")
    public void error(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("1ec6456c-699f-49c8-ad30-3f40b4c9e271")
    public void fatal(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("abf101b7-293a-4ba3-b636-29c1be36d360")
    protected void processMessage(final String $message, final String $level, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("5c0eb39b-fdbd-482e-9e0e-b4efd1146cbd")
    protected String formatMessage(final String $message, final String $level, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("548b65b8-16b5-4a4f-bbd2-73ca2579b078")
    protected void log(final String $message) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("28b507da-de9d-40b7-bd70-fc30ee5afe1f")
    protected boolean isLoggable(final String $level) {
        // TODO Auto-generated return
        return false;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fb681881-175d-44ae-9e33-5cc989775ff9")
class Kount_Log_Binding_NopLogger {
    @objid ("cfb1d741-ec6b-4277-b6bc-9ea3a4f16b30")
    public void __construct(final String $name) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("319c6571-0e85-49b3-835d-077c6fcb1166")
    public void debug(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("4b8afa51-377a-4b35-aa2f-5315ce5b3dd0")
    public void info(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("d8b59c0e-6947-45d7-994a-df75b5ff6e7e")
    public void warn(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("835096ea-dea3-4d9a-923c-d8e82156eae4")
    public void error(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("900baf79-9e26-4024-97fc-ca5ac6a151db")
    public void fatal(final String $message, final Exception $exception) {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a86748f0-3540-4fba-876d-383e6205a5f2")
interface Kount_Log_Binding_Logger {
    @objid ("79ac2a75-59a4-4c15-a5f3-d758538108f5")
    void debug(final String $message, final Exception $exception);

    @objid ("4d2f2942-f46b-47a7-b58f-f7ad322b14ec")
    void info(final String $message, final Exception $exception);

    @objid ("5dbf1606-d05b-4b12-b2c4-fd4db820b4b2")
    void warn(final String $message, final Exception $exception);

    @objid ("45c623ea-0cdc-433b-a8c7-477186f6bc06")
    void error(final String $message, final Exception $exception);

    @objid ("1996fff0-4018-45c2-8fc2-d30eca94df98")
    void fatal(final String $message, final Exception $exception);

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d5e2b0b3-1f10-4b84-a622-a257f75cc544")
class Kount_Log_Factory_LogFactory {
    @objid ("cdc03900-7c6f-4fc3-a2a4-bf17816f407a")
    public static String NOP_LOGGER = 'NOP';

    @objid ("14ca3911-5224-4a0b-a18a-6d971018724d")
    public static String SIMPLE_LOGGER = 'SIMPLE';

    @objid ("0e78b399-b688-4044-b6dc-bc17581d6302")
    protected static Kount_Log_Factory_LoggerFactory $loggerFactory = null;

    @objid ("3237ee8b-c10c-4eae-b97c-4bbdbbcfa6ea")
    public static Kount_Log_Factory_LoggerFactory getLoggerFactory() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("90cdc8f2-ff86-4295-93a0-095250af70e8")
    public static void setLoggerFactory(final Kount_Log_Factory_LoggerFactory $factory) {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d94df819-2134-430d-b2ad-eb5e7b37cbe2")
interface Kount_Log_Factory_LoggerFactory {
    @objid ("e5352663-997e-40c1-92dd-2c48ea10a37c")
    static Kount_Log_Factory_LoggerFactory getLogger(final String $name) {
        // TODO Auto-generated return
        return null;
    }

}


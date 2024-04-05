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

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

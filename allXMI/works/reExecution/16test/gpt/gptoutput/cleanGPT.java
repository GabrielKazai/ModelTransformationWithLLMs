public interface IMaxClientsControl {
}

public interface IAvgResponseTimeMonitor {
}

public interface IBaseProvidedInterface {
}

public interface IBaseRequiredInterface {
}

public class BaseClass implements IBaseProvidedInterface {
}

public class MaxClientsControl extends BaseClass implements IMaxClientsControl {
}

public class WebServer {
    private IAvgResponseTimeMonitor monitorablePort;
    private IMaxClientsControl controllablePort;
    private IBaseRequiredInterface classTypedPort;
}
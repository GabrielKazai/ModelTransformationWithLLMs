public class XSDataInputFIT2D {
    public Object beamCentreInPixelsX;
    public Object beamCentreInPixelsY;
    public Object bufferSizeX;
    public Object bufferSizeY;
    public Object darkCurrentImageFile;
    public Object flatFieldImageFile;
    public Object inputFile;
    public Object outputFileType;
    public Object pixelSizeX;
    public Object pixelSizeY;
    public Object spatialDistortionFile;
    public Object wavelength;
}

public class XSDataInputFIT2DCake extends XSDataInputFIT2D {
    public Object angleOfTilt;
    public Object endAzimuth;
    public Object innerRadius;
    public Object outerRadius;
    public Object sampleToDetectorDistance;
    public Object startAzimuth;
    public Object tiltRotation;
}

public class XSDataResultFIT2DCake {
    public Object resultFile;
}
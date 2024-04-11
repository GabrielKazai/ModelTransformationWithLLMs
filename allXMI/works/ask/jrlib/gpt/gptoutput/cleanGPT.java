public interface Changeable {
    void addChangeListener(ChangeListener listener);

    void removeChangeListener(ChangeListener listener);
}

public interface CalculationData extends Changeable {
    void recalculate();

    void detach();
}

public interface Triangle extends CalculationData {
    int getAccidentCount();

    int getDevelopmentCount();

    int getDevelopmentCount(int accident);

    double getValue(int accident, int development);

    double[][] toArray();
}

public interface ModifiedTriangle extends Triangle {
    Triangle getSourceTriangle();
}

public interface FactorTriangle extends Triangle {
    Triangle getSourceTriangle();
}

public interface ModifiedFactorTriangle extends FactorTriangle {
    FactorTriangle getSourceFactors();
}

public interface LinkRatioSE extends CalculationData {
    CalculationData getSourceLRScales();

    int getDevelopmentCount();

    double getValue(int development);

    double[][] toArray();
}

public interface LinkRatioSESelection extends LinkRatioSE, MethodSelection<LinkRatioSE, SelectableMethod<LinkRatioSE>> {
}

public interface LinkRatioSEFunction extends SelectableMethod<LinkRatioSE> {
    void fit(LinkRatioSE ses);

    double getValue(int development);
}

public interface LinkRatioFunction extends SelectableMethod<LinkRatio> {
    void fit(LinkRatio lr);

    double getValue(int development);
}

public interface LinkRatioSmoothingSelection extends MethodSelection<LinkRatio, LinkRatioSmoothing> {
}

public interface LinkRatioSmoothing extends SelectableMethod<LinkRatio> {
    LinkRatio getSourceLinkRatios();

    void setDevelopmentCount(int developments);
}

public interface LinkRatio extends CalculationData {
    FactorTriangle getSourceFactors();

    int getDevelopmentCount();

    double getValue(int development);

    double[][] toArray();

    double getfWeight(int accident, int development);

    double getMackAlpha(int development);
}

public interface LinkRatioSelection extends LinkRatio, MethodSelection<LinkRatio, LinkRatioMethod> {
}

public interface LinkRatioMethod extends SelectableMethod<LinkRatio> {
    void fit(FactorTriangle factors);

    double getValue(int development);

    double getWeight(int accident, int development);

    double getMackAlpha();
}

public interface LinkRatioScaleEstimator extends SelectableMethod<LinkRatioScale> {
    void fit(LinkRatioScale scales);

    double getValue(int development);
}

public interface LinkRatioScaleSelection extends MethodSelection<LinkRatioScale, LinkRatioScaleEstimator> {
}

public interface LinkRatioScale extends CalculationData {
    LinkRatio getSourceLinkRatios();

    int getDevelopmentCount();

    double getValue(int development);

    double[][] toArray();
}

public interface MethodSelection<T, M extends SelectableMethod<T>> {
    M getDefaultMethod();

    void setDefaultMethod(M method);

    void setMethod(M method, int index);

    void setMethods(Map<Integer, M> methods);

    M getMethod(int index);

    void fit(T source);
}

public interface SelectableMethod<T> {
    void fit(T source);

    double getValue(int index);
}

public interface ChangeListener extends EventListener {
    void stateChanged(ChangeEvent e);
}

public class ChangeEvent {
}
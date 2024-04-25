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

    double[] toArray();
}

public interface LinkRatioSESelection extends LinkRatioSE, MethodSelection<LinkRatioSE, LinkRatioSEFunction> {
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

public interface EventListener {
}

public interface ChangeListener extends EventListener {
    void stateChanged(ChangeEvent e);
}

public class ChangeEvent {
}

public interface Map<K, V> {
    int size();

    boolean isEmpty();

    boolean containsKey(K key);

    boolean containsValue(V value);

    V get(K key);

    V put(K key, V value);

    V remove(K key);

    void putAll(Map<K, V> m);

    void clear();

    Set<K> keySet();

    Collection<V> values();

    Set<Map.Entry<K, V>> entrySet();

    boolean equals(Object o);

    int hashCode();
}

public interface Set<E> {
}

public interface Collection<E> {
}

public interface Entry<K, V> {
    K getKey();

    V getValue();

    V setValue(V value);

    boolean equals(Object o);

    int hashCode();
}

public class Object {
}
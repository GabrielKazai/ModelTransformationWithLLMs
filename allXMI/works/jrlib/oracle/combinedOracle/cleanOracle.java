
public interface Changeable {
    void addChangeListener(final ChangeListener listener);

    void removeChangeListener(final ChangeListener listener);

}

public interface CalculationData extends Changeable {
    void recalculate();

    void detach();

}

public interface Triangle extends CalculationData {
    int getAccidentCount();

    int getDevelopmentCount();

    int getDevelopmentCount(final int accident);

    double getValue(final int accident, final int development);

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
    LinkRatioScale getSourceLRScales();

    int getDevelopmentCount();

    double getValue(final int development);

    double[] toArray();

}

public interface LinkRatioSESelection extends LinkRatioSE,MethodSelection<T,M extends SelectableMethod<T>>
{
    }

    public interface LinkRatioSEFunction extends SelectableMethod<T> {
        void fit(final LinkRatioSE ses);

        double getValue(final int development);

    }

    public interface LinkRatioFunction extends SelectableMethod<T> {
        void fit(final LinkRatio lr);

        double getValue(final int development);

    }

    public interface LinkRatioSmoothingSelection extends MethodSelection<T,M extends SelectableMethod<T>>,LinkRatioSmoothing
    {
        }

        public interface LinkRatioSmoothing extends LinkRatio {
            LinkRatio getSourceLinkRatios();

            void setDevelopmentCount(final int developments);

        }

        public interface LinkRatio extends CalculationData {
            FactorTriangle getSourceFactors();

            int getDevelopmentCount();

            double getValue(final int development);

            double[] toArray();

            double getfWeight(final int accident, final int development);

            double getMackAlpha(final int development);

        }

        public interface LinkRatioSelection extends LinkRatio,MethodSelection<T,M extends SelectableMethod<T>>
        {
            }

            public interface LinkRatioMethod extends SelectableMethod<T> {
                void fit(final FactorTriangle factors);

                double getValue(final int development);

                double getWeight(final int accident, final int development);

                double getMackAlpha();

            }

            public interface LinkRatioScaleEstimator extends SelectableMethod<T> {
                void fit(final LinkRatioScale scales);

                double getValue(final int development);

            }

            public interface LinkRatioScaleSelection
                    extends LinkRatioScale,MethodSelection<T,M extends SelectableMethod<T>>
            {
                }

                public interface LinkRatioScale extends CalculationData {
                    LinkRatio getSourceLinkRatios();

                    int getDevelopmentCount();

                    double getValue(final int development);

                    double[] toArray();

                }

                public interface ChangeListener extends EventListener {
                    void stateChanged(ChangeEvent e);

                }

                class ChangeEvent {
                }

                public interface EventListener {
                }

                public interface Map {
                    int size();

                    boolean isEmpty();

                    boolean containsKey(Object key);

                    boolean containsValue(Object value);

                    V get(Object key);

                    V put(K key, V value);

                    V remove(Object key);

    void putAll(Map<? extends K m, ? extends V> Map m);

                    void clear();

                    Set<K> keySet();

                    Collection<V> values();

                    Set<Map.Entry<K, V>> entrySet();

                    default boolean equals(Object o) {
                        // Automatically generated method. Please delete this comment before entering
                        // specific code.
                        if (this == obj)
                            return true;
                        if (this.getClass() != obj.getClass())
                            return false;
                        return true;
                    }

                    default int hashCode() {
                        // Automatically generated method. Please delete this comment before entering
                        // specific code.
                        int result = super.hashCode();
                        return result;
                    }

                    interface Entry {
                        K getKey();

                        V getValue();

                        V setValue(V value);

                        boolean equals(Object o);

                        int hashCode();

                    }

                }

                interface Set {
                }

                interface Collection {
                }

                class Object {
                }

                public class K {
                }

                public class M {
                }

                public class T {
                }

                public class V {
                }

                public class double[]

                {
                }

                public class double[][]
                {
                }

                public class int
                {
                }

                public class void
                {
}

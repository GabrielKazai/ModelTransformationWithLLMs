import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("65342d0a-9e4a-4a44-aca4-36cf7998fa69")
public interface Changeable {
    @objid ("e4e43d06-3147-430b-a1a4-5a9522f6c677")
    void addChangeListener(final ChangeListener listener);

    @objid ("d73f3569-7e3f-4a2f-8746-a31601b1d850")
    void removeChangeListener(final ChangeListener listener);

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("de12f097-0874-4f97-88a4-af2cd17d97b3")
public interface CalculationData extends Changeable {
    @objid ("d64e91a9-d1b8-49db-af9d-63c2b64d6e0f")
    void recalculate();

    @objid ("a62ceb01-aa7a-476a-a88a-503116c452ee")
    void detach();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("889711d8-169f-4e1c-afaf-97484756cc94")
public interface Triangle extends CalculationData {
    @objid ("c786f478-4c84-417d-b92f-b43725d871ef")
    int getAccidentCount();

    @objid ("15859aa9-4bfb-4d83-9adf-4285bdf20c43")
    int getDevelopmentCount();

    @objid ("d40043a3-cddb-481b-b99b-cc1a6161fc9e")
    int getDevelopmentCount(final int accident);

    @objid ("d8711a58-0f3e-4119-990d-30728b4eba86")
    double getValue(final int accident, final int development);

    @objid ("45be1fda-e52c-4cb8-b1f6-55ea0c4d3930")
    double[][] toArray();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("419e3961-71bf-4826-99e6-60b345ef1b21")
public interface ModifiedTriangle extends Triangle {
    @objid ("6ea89ef6-e93e-4c41-9269-209673590120")
    Triangle getSourceTriangle();

}

import Triangle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("aba214ae-9726-43fb-99ee-215969e2a749")
public interface FactorTriangle extends Triangle {
    @objid ("26fd496c-60e4-4510-a074-f486a83f9914")
    Triangle getSourceTriangle();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b477df6f-c5e7-41b1-8150-366038ca49c0")
public interface ModifiedFactorTriangle extends FactorTriangle {
    @objid ("6149dcdd-9ec8-4570-ac55-5565e38c7073")
    FactorTriangle getSourceFactors();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9c7744f2-fe9a-4abf-a89f-2040a67914b3")
public interface LinkRatioSE extends CalculationData {
    @objid ("5d5eb84d-0d2d-4748-b0e7-4aa85e681fe3")
    LinkRatioScale getSourceLRScales();

    @objid ("6fc2845f-e699-4a79-92a0-6d63dab4af3c")
    int getDevelopmentCount();

    @objid ("d190c8b6-8d31-4b99-a5b2-10f80613365c")
    double getValue(final int development);

    @objid ("2e18a6f0-8870-43ff-aa21-397d864b21ba")
    double[] toArray();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ddc44d53-97c3-4526-b053-649519cc5c06")
public interface LinkRatioSESelection extends LinkRatioSE, MethodSelection<T, M extends SelectableMethod<T>> {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c75241ec-ce3e-4997-89de-caad678a9b7b")
public interface LinkRatioSEFunction extends SelectableMethod<T> {
    @objid ("e0e0de7b-678c-41dd-9081-982acbb28260")
    void fit(final LinkRatioSE ses);

    @objid ("b834a697-2cd9-46a9-a431-bbd9e6472cfd")
    double getValue(final int development);

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9381d7c6-1851-43eb-91c9-9c1ca847fa46")
public interface LinkRatioFunction extends SelectableMethod<T> {
    @objid ("59ef0632-3727-4bde-b192-99b9d7362870")
    void fit(final LinkRatio lr);

    @objid ("6f51ee11-9db7-4ef5-9879-18cce080b879")
    double getValue(final int development);

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("755aba52-f532-485f-886f-aeed74c12dca")
public interface LinkRatioSmoothingSelection extends MethodSelection<T, M extends SelectableMethod<T>>, LinkRatioSmoothing {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("24e52e7a-f52f-4b4c-9e21-7a1ccf11ea08")
public interface LinkRatioSmoothing extends LinkRatio {
    @objid ("1bbb0439-06c3-4899-816b-a6be1a0567b5")
    LinkRatio getSourceLinkRatios();

    @objid ("cac549e7-0243-499b-b683-89769f426b64")
    void setDevelopmentCount(final int developments);

}

import FactorTriangle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("756375cc-0787-46f1-8b2f-7de803e2842a")
public interface LinkRatio extends CalculationData {
    @objid ("051358cb-f40d-4859-be61-be3b3f2770a2")
    FactorTriangle getSourceFactors();

    @objid ("b5117ddf-853c-4596-ab00-6932760d75eb")
    int getDevelopmentCount();

    @objid ("99c26556-5743-442c-b7de-fb69b202d007")
    double getValue(final int development);

    @objid ("99f08e8a-cd9a-429a-9286-7487e422a574")
    double[] toArray();

    @objid ("03338b6b-c1ed-4380-bdaf-baa541e95639")
    double getfWeight(final int accident, final int development);

    @objid ("3d2c69b8-f3c3-4203-8e78-00098a2bf26d")
    double getMackAlpha(final int development);

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("09965769-9ce7-4f5b-b4b5-00e297764134")
public interface LinkRatioSelection extends LinkRatio, MethodSelection<T, M extends SelectableMethod<T>> {
}

import FactorTriangle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4df313ee-17ab-49b8-9008-02d04d7a440a")
public interface LinkRatioMethod extends SelectableMethod<T> {
    @objid ("d7de9910-9adb-4200-9e1b-95f5b1302faf")
    void fit(final FactorTriangle factors);

    @objid ("e620102f-93a6-4ad2-90f2-79e444eaa984")
    double getValue(final int development);

    @objid ("3fe909f9-a04b-44f8-a913-3f49e1cc4e4a")
    double getWeight(final int accident, final int development);

    @objid ("03802e7a-59fd-4607-b3f4-5f993f7da497")
    double getMackAlpha();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("117221bb-99df-46a8-ab6b-9c627f5aa7e3")
public interface LinkRatioScaleEstimator extends SelectableMethod<T> {
    @objid ("40fcfb39-fbc1-406e-a97d-0ebf74ce2c54")
    void fit(final LinkRatioScale scales);

    @objid ("d8e095a1-7cca-43ec-a090-8bf8cef5fc78")
    double getValue(final int development);

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b1350cda-85a8-4cab-87a8-6aa95158f5b4")
public interface LinkRatioScaleSelection extends LinkRatioScale, MethodSelection<T, M extends SelectableMethod<T>> {
}

import LinkRatio;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("07cb5ca0-3695-4fc6-a3df-c8b686ab73dd")
public interface LinkRatioScale extends CalculationData {
    @objid ("52a67d1e-db93-4d05-9e2e-10bfcbffb357")
    LinkRatio getSourceLinkRatios();

    @objid ("93d60511-acbe-4add-9295-bba7d4b7b324")
    int getDevelopmentCount();

    @objid ("b4943f54-6ae9-4683-9f31-d3737ee7d08b")
    double getValue(final int development);

    @objid ("2d275f33-b5cb-4536-be3d-0f605f83e4cf")
    double[] toArray();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("994e6bb9-f74e-4e04-a0c8-38a62193dfc6")
public interface ChangeListener extends EventListener {
    @objid ("303bdda2-ee47-4040-8290-d30f55fcdfbc")
    void stateChanged(ChangeEvent e);

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f57dcbe0-96c8-4807-8aa3-ce6b00732984")
class ChangeEvent {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("19de3916-29d8-4e2d-a394-dc4c6c3c8710")
public interface EventListener {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e8f6a938-9d85-432c-8387-fe1517456554")
public interface Map {
    @objid ("84acfadf-7e48-47ae-86d5-17fe8c34d492")
    int size();

    @objid ("5c0d1fcc-9434-40e9-be23-bc6e9c4c5905")
    boolean isEmpty();

    @objid ("7824ac7e-db2b-4fb4-b46e-36a877cf6980")
    boolean containsKey(Object key);

    @objid ("840d2439-3216-46bf-b691-3131bdf5b2ec")
    boolean containsValue(Object value);

    @objid ("707426a2-a840-4930-9ffd-85424e6db081")
    V get(Object key);

    @objid ("f8996ad0-cf8a-477b-811d-eeec0a736727")
    V put(K key, V value);

    @objid ("66c84721-f55e-42b8-ad62-f8f09ecd7062")
    V remove(Object key);

    @objid ("f0fc5328-69a9-4cab-8e71-16bfeea08b02")
    void putAll(Map<? extends K m, ? extends V> Map m);

    @objid ("dad19956-fa7a-427a-bcf1-b575d323b5a3")
    void clear();

    @objid ("b38a52a4-8d53-45f3-9703-689d0c52831a")
    Set<K> keySet();

    @objid ("efc16ae7-0ac0-419b-8d58-7062e51c783f")
    Collection<V> values();

    @objid ("09c0c055-e8b3-4578-8791-a4a5395871c4")
    Set<Map.Entry<K, V>> entrySet();

    @objid ("a5f76b58-bffc-4d3d-8d32-8800e09844a6")
    default boolean equals(Object o) {
        // Automatically generated method. Please delete this comment before entering specific code.
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        return true;
    }

    @objid ("82757bd3-db1e-4255-a57e-09d364b01cf3")
    default int hashCode() {
        // Automatically generated method. Please delete this comment before entering specific code.
        int result = super.hashCode();
        return result;
    }

    @objid ("d5357194-e375-4d52-9cec-a4e6e7dcb9b4")
    interface Entry {
        @objid ("02eba0b9-2f14-476f-aa93-4f9a2e3f2791")
        K getKey();

        @objid ("a5ff429e-06bc-4c5c-8c92-8b11c416c233")
        V getValue();

        @objid ("ff5d63ab-dd8d-4dfe-af36-c815311ea610")
        V setValue(V value);

        @objid ("69930dc8-0287-4cc9-b63c-82ad734e5b23")
        boolean equals(Object o);

        @objid ("9f1904c3-e3dc-405b-916c-a5d8114a7563")
        int hashCode();

    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a4519075-fff1-4a9e-9c30-fc25f43ddaac")
interface Set {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("110be2be-127d-4d76-9caf-64505eea2ecb")
interface Collection {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("85eecf9b-20dc-47b7-a0ad-96ff36f9da32")
class Object {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("534155b7-53c6-49c9-a568-1908e8f88ff6")
public class K {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("77a6c26c-4221-4aa6-ad63-d34ec9ee2181")
public class M {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("223de106-1061-4a90-b50f-4aed35ad8eb0")
public class T {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("5f78514c-29f3-4102-8c17-0e4bf9791089")
public class V {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("1610215f-583b-49d5-9a58-6f0d42dcf80a")
public class double[] {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("1f46260d-49f9-44c1-8274-44e43442ac65")
public class double[][] {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("fa3b1f24-8394-411e-aac5-57426f631d38")
public class int {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("df93380d-a310-4650-9225-2355488c4863")
public class void {
}


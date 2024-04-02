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

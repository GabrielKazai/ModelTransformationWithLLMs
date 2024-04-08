public interface Iterator {
}

public interface Countable {
}

public class Exception {
}

public class ORM {
    public static final int ERROR_SAVE = 1;
    public static final int ERROR_VALIDACION = 2;
    public Object $datos;typescriptCopy codepublic

    ORM(String $tabla) {
    }

    public Object get_tabla() {
        return null;
    }

    private Object check_tabla_existe() {
        return null;
    }

    public Object set_tabla(String $tabla) {
        return null;
    }

    public Object load_campos() {
        return null;
    }

    public Object get_campo_fk_values(Object $campo) {
        return null;
    }

    public Object get_campos(boolean $simple) {
        return null;
    }

    public Object get(Object $campo) {
        return null;
    }

    public Object set(Object $campo, Object $valor) {
        return null;
    }

    public Object load(Object $condiciones) {
        return null;
    }

    public Object get_fields() {
        return null;
    }

    public Object set_fields(Object $r) {
        return null;
    }

    private Object get_empty_fields() {
        return null;
    }

    protected Object setup_fields() {
        return null;
    }

    public Object get_campo_id() {
        return null;
    }

    public Object get_metodo_serializacion() {
        return null;
    }

    public Object set_metodo_serializacion(Object $val) {
        return null;
    }

    public Object set_campo_id(Object $str) {
        return null;
    }

    protected Object parse_fields(Object $r) {
        return null;
    }
}

public class ABM extends ORM {
    public ABM(String $tabla) {
        super($tabla);
    }typescriptCopy codepublic

    Object add_mensaje(Object $msg) {
        return null;
    }

    public Object get_mensajes() {
        return null;
    }

    public Object get_pagina_actual() {
        return null;
    }

    public Object get_items_por_pagina() {
        return null;
    }

    public Object set_pagina_actual(Object $val) {
        return null;
    }

    public Object set_items_por_pagina(Object $val) {
        return null;
    }

    public Object save() {
        return null;
    }

    public Object baja(Object $id, boolean $logica, Object $data) {
        return null;
    }

    public Object reactivar(Object $id, Object $data) {
        return null;
    }public Object set_force_insert(Object $val) {    return null;}public Object set_campo_fecha_vigencia(Object $val) {    return nullMessage ChatGPT…ChatGPT can make mistakes. Consider checking important information.?
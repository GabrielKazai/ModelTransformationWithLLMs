
public class mixed {
}


public class array {
}


public class int {
}


public class bool {
}


public class void {
}


public class null {
}


public class object {
}


public class resource {
}


class Exception {
}


class ORM {
    public static int ERROR_SAVE = 1;

    public static int ERROR_VALIDACION = 2;

    public mixed $datos;

    public void __construct(final String $tabla) {
        // TODO Auto-generated return
        return null;
    }

    public void get_tabla() {
        // TODO Auto-generated return
        return null;
    }

    private void check_tabla_existe() {
        // TODO Auto-generated return
        return null;
    }

    public void set_tabla(final String $tabla) {
        // TODO Auto-generated return
        return null;
    }

    public void load_campos() {
        // TODO Auto-generated return
        return null;
    }

    public void get_campo_fk_values(final mixed $campo) {
        // TODO Auto-generated return
        return null;
    }

    public void get_campos(final bool $simple) {
        // TODO Auto-generated return
        return null;
    }

    public void get(final mixed $campo) {
        // TODO Auto-generated return
        return null;
    }

    public void set(final mixed $campo, final mixed $valor) {
        // TODO Auto-generated return
        return null;
    }

    public void load(final mixed $condiciones) {
        // TODO Auto-generated return
        return null;
    }

    public void get_fields() {
        // TODO Auto-generated return
        return null;
    }

    public void set_fields(final mixed $r) {
        // TODO Auto-generated return
        return null;
    }

    private void get_empty_fields() {
        // TODO Auto-generated return
        return null;
    }

    protected void setup_fields() {
        // TODO Auto-generated return
        return null;
    }

    public void get_campo_id() {
        // TODO Auto-generated return
        return null;
    }

    public void get_metodo_serializacion() {
        // TODO Auto-generated return
        return null;
    }

    public void set_metodo_serializacion(final mixed $val) {
        // TODO Auto-generated return
        return null;
    }

    public void set_campo_id(final mixed $str) {
        // TODO Auto-generated return
        return null;
    }

    protected void parse_fields(final mixed $r) {
        // TODO Auto-generated return
        return null;
    }

}


class ABM extends ORM {
    public void __construct(final mixed $tabla) {
        // TODO Auto-generated return
        return null;
    }

    public void add_mensaje(final mixed $msg) {
        // TODO Auto-generated return
        return null;
    }

    public void get_mensajes() {
        // TODO Auto-generated return
        return null;
    }

    public void get_pagina_actual() {
        // TODO Auto-generated return
        return null;
    }

    public void get_items_por_pagina() {
        // TODO Auto-generated return
        return null;
    }

    public void set_pagina_actual(final mixed $val) {
        // TODO Auto-generated return
        return null;
    }

    public void set_items_por_pagina(final mixed $val) {
        // TODO Auto-generated return
        return null;
    }

    public void save() {
        // TODO Auto-generated return
        return null;
    }

    public void baja(final mixed $id, final bool $logica, final mixed $data) {
        // TODO Auto-generated return
        return null;
    }

    public void reactivar(final mixed $id, final mixed $data) {
        // TODO Auto-generated return
        return null;
    }

    public void set_force_insert(final mixed $val) {
        // TODO Auto-generated return
        return null;
    }

    public void set_campo_fecha_vigencia(final mixed $val) {
        // TODO Auto-generated return
        return null;
    }

    public void get_campo_fecha_vigencia() {
        // TODO Auto-generated return
        return null;
    }

    public void tiene_valor_en_campo_id() {
        // TODO Auto-generated return
        return null;
    }

    public void is_new_item() {
        // TODO Auto-generated return
        return null;
    }

    public void tiene_fecha_vigencia() {
        // TODO Auto-generated return
        return null;
    }

    public void requiere_nueva_vigencia() {
        // TODO Auto-generated return
        return null;
    }

    public void validate() {
        // TODO Auto-generated return
        return null;
    }

    public void get_rotulos_from_field_names(final mixed $fns) {
        // TODO Auto-generated return
        return null;
    }

    public void load_fields_from_array(final mixed $arr) {
        // TODO Auto-generated return
        return null;
    }

    public void set_form_buttons(final mixed $arr) {
        // TODO Auto-generated return
        return null;
    }

    public void get_form_buttons() {
        // TODO Auto-generated return
        return null;
    }

    public void add_form_button(final mixed $button, final bool $ultimo) {
        // TODO Auto-generated return
        return null;
    }

    public void set_request_data(final mixed $data) {
        // TODO Auto-generated return
        return null;
    }

    public void get_request_data() {
        // TODO Auto-generated return
        return null;
    }

    public void render_form(final mixed $data) {
        // TODO Auto-generated return
        return null;
    }

    public void render_form_html(final mixed $data) {
        // TODO Auto-generated return
        return null;
    }

    public void render_form_json() {
        // TODO Auto-generated return
        return null;
    }

    public void add_code_to_form(final mixed $str, final bool $arriba) {
        // TODO Auto-generated return
        return null;
    }

    public void set_form_columnas(final int $int) {
        // TODO Auto-generated return
        return null;
    }

    public void set_form_titulo(final mixed $str) {
        // TODO Auto-generated return
        return null;
    }

    public void analizar_operacion(final mixed $data) {
        // TODO Auto-generated return
        return null;
    }

    public void set_operacion(final mixed $op) {
        // TODO Auto-generated return
        return null;
    }

    public void get_operacion() {
        // TODO Auto-generated return
        return null;
    }

    public void search(final mixed $criterios, final mixed $campos, final mixed $campo_id, final mixed $paginado) {
        // TODO Auto-generated return
        return null;
    }

}


class ClassGetter {
    public static void get_all(final mixed $tabla) {
        // TODO Auto-generated return
        return null;
    }

    public static void get(final mixed $tabla, final mixed $criterios) {
        // TODO Auto-generated return
        return null;
    }

}


class Model extends ORM {
    public void __construct(final mixed $tabla) {
        // TODO Auto-generated return
        return null;
    }

    public void load(final int $id) {
        // TODO Auto-generated return
        return null;
    }

    public void get_data() {
        // TODO Auto-generated return
        return null;
    }

    public void search(final mixed $criterios) {
        // TODO Auto-generated return
        return null;
    }

    public void to_json() {
        // TODO Auto-generated return
        return null;
    }

}

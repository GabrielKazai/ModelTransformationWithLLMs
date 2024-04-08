public class Iterator {
}

public class Countable {
}

class Exception {
}

class ORM {
    public static final int ERROR_SAVE = 1;
    public static final int ERROR_VALIDACION = 2;
    public mixed $datos;

    public void __construct(String $tabla) {
    }

    public void get_tabla() {
    }

    private void check_tabla_existe() {
    }

    public void set_tabla(String $tabla) {
    }

    public void load_campos() {
    }

    public void get_campo_fk_values(mixed $campo) {
    }

    public void get_campos(bool $simple) {
    }

    public void get(mixed $campo) {
    }

    public void set(mixed $campo, mixed $valor) {
    }

    public void load(mixed $condiciones) {
    }

    public void get_fields() {
    }

    public void set_fields(mixed $r) {
    }

    private void get_empty_fields() {
    }

    protected void setup_fields() {
    }

    public void get_campo_id() {
    }

    public void get_metodo_serializacion() {
    }

    public void set_metodo_serializacion(mixed $val) {
    }

    public void set_campo_id(mixed $str) {
    }

    protected void parse_fields(mixed $r) {
    }
}

class ABM extends ORM {
    public void __construct(mixed $tabla) {
    }

    public void add_mensaje(mixed $msg) {
    }

    public void get_mensajes() {
    }

    public void get_pagina_actual() {
    }

    public void get_items_por_pagina() {
    }

    public void set_pagina_actual(mixed $val) {
    }

    public void set_items_por_pagina(mixed $val) {
    }

    public void save() {
    }

    public void baja(mixed $id, bool $logica, mixed $data) {
    }

    public void reactivar(mixed $id, mixed $data) {
    }

    public void set_force_insert(mixed $val) {
    }

    public void set_campo_fecha_vigencia(mixed $val) {
    }

    public void get_campo_fecha_vigencia() {
    }

    public void tiene_valor_en_campo_id() {
    }

    public void is_new_item() {
    }

    public void tiene_fecha_vigencia() {
    }

    public void requiere_nueva_vigencia() {
    }

    public void validate() {
    }

    public void get_rotulos_from_field_names(mixed $fns) {
    }

    public void load_fields_from_array(mixed $arr) {
    }

    public void set_form_buttons(mixed $arr) {
    }

    public void get_form_buttons() {
    }

    public void add_form_button(mixed $button, bool $ultimo) {
    }

    public void set_request_data(mixed $data) {
    }

    public void get_request_data() {
    }

    public void render_form(mixed $data) {
    }

    public void render_form_html(mixed $data) {
    }

    public void render_form_json() {
    }

    public void add_code_to_form(mixed $str, bool $arriba) {
    }

    public void set_form_columnas(int $int) {
    }

    public void set_form_titulo(mixed $str) {
    }

    public void analizar_operacion(mixed $data) {
    }

    public void set_operacion(mixed $op) {
    }

    public void get_operacion() {
    }

    public void search(mixed $criterios, mixed $campos, mixed $campo_id, mixed $paginado) {
    }
}

class ClassGetter {
    public static void get_all(mixed $tabla) {
    }

    public static void get(mixed $tabla, mixed $criterios) {
    }
}

class Model extends ORM {
    public void __construct(mixed $tabla) {
    }

    public void load(int $id) {
    }

    public void get_data() {
    }

    public void search(mixed $criterios) {
    }

    public void to_json() {
    }
}
/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables;


import ${package}.database.or.pg_catalog.PgCatalog;
import ${package}.database.or.pg_catalog.tables.records.JsonEachTextRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonEachText extends TableImpl<JsonEachTextRecord> {

    private static final long serialVersionUID = 2090304806;

    /**
     * The reference instance of <code>pg_catalog.json_each_text</code>
     */
    public static final JsonEachText JSON_EACH_TEXT = new JsonEachText();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonEachTextRecord> getRecordType() {
        return JsonEachTextRecord.class;
    }

    /**
     * The column <code>pg_catalog.json_each_text.key</code>.
     */
    public final TableField<JsonEachTextRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.json_each_text.value</code>.
     */
    public final TableField<JsonEachTextRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.json_each_text</code> table reference
     */
    public JsonEachText() {
        this(DSL.name("json_each_text"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.json_each_text</code> table reference
     */
    public JsonEachText(String alias) {
        this(DSL.name(alias), JSON_EACH_TEXT);
    }

    /**
     * Create an aliased <code>pg_catalog.json_each_text</code> table reference
     */
    public JsonEachText(Name alias) {
        this(alias, JSON_EACH_TEXT);
    }

    private JsonEachText(Name alias, Table<JsonEachTextRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JsonEachText(Name alias, Table<JsonEachTextRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonEachText as(String alias) {
        return new JsonEachText(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonEachText as(Name alias) {
        return new JsonEachText(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonEachText rename(String name) {
        return new JsonEachText(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonEachText rename(Name name) {
        return new JsonEachText(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonEachText call(Object fromJson) {
        return new JsonEachText(DSL.name(getName()), null, new Field[] { 
              DSL.val(fromJson, org.jooq.impl.SQLDataType.OTHER)
        });
    }

    /**
     * Call this table-valued function
     */
    public JsonEachText call(Field<Object> fromJson) {
        return new JsonEachText(DSL.name(getName()), null, new Field[] { 
              fromJson
        });
    }
}
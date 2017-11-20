/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables.records;


import ${package}.database.or.pg_catalog.tables.JsonEach;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class JsonEachRecord extends TableRecordImpl<JsonEachRecord> implements Record2<String, Object> {

    private static final long serialVersionUID = 83560299;

    /**
     * Setter for <code>pg_catalog.json_each.key</code>.
     */
    public void setKey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.json_each.key</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.json_each.value</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setValue(Object value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.json_each.value</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getValue() {
        return (Object) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Object> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Object> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return JsonEach.JSON_EACH.KEY;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field2() {
        return JsonEach.JSON_EACH.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonEachRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public JsonEachRecord value2(Object value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonEachRecord values(String value1, Object value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonEachRecord
     */
    public JsonEachRecord() {
        super(JsonEach.JSON_EACH);
    }

    /**
     * Create a detached, initialised JsonEachRecord
     */
    public JsonEachRecord(String key, Object value) {
        super(JsonEach.JSON_EACH);

        set(0, key);
        set(1, value);
    }
}

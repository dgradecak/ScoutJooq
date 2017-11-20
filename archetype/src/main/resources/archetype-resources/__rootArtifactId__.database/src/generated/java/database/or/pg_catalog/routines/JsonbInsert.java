/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.routines;


import ${package}.database.or.pg_catalog.PgCatalog;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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

/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
 */
@java.lang.Deprecated
public class JsonbInsert extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 160803898;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> JSONB_IN = createParameter("jsonb_in", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_insert.path</code>.
     */
    public static final Parameter<String[]> PATH = createParameter("path", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> REPLACEMENT = createParameter("replacement", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_insert.insert_after</code>.
     */
    public static final Parameter<Boolean> INSERT_AFTER = createParameter("insert_after", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonbInsert() {
        super("jsonb_insert", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(JSONB_IN);
        addInParameter(PATH);
        addInParameter(REPLACEMENT);
        addInParameter(INSERT_AFTER);
    }

    /**
     * Set the <code>jsonb_in</code> parameter IN value to the routine
     */
    public void setJsonbIn(Object value) {
        setValue(JSONB_IN, value);
    }

    /**
     * Set the <code>jsonb_in</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setJsonbIn(Field<Object> field) {
        setField(JSONB_IN, field);
    }

    /**
     * Set the <code>path</code> parameter IN value to the routine
     */
    public void setPath(String... value) {
        setValue(PATH, value);
    }

    /**
     * Set the <code>path</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPath(Field<String[]> field) {
        setField(PATH, field);
    }

    /**
     * Set the <code>replacement</code> parameter IN value to the routine
     */
    public void setReplacement(Object value) {
        setValue(REPLACEMENT, value);
    }

    /**
     * Set the <code>replacement</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setReplacement(Field<Object> field) {
        setField(REPLACEMENT, field);
    }

    /**
     * Set the <code>insert_after</code> parameter IN value to the routine
     */
    public void setInsertAfter(Boolean value) {
        setValue(INSERT_AFTER, value);
    }

    /**
     * Set the <code>insert_after</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInsertAfter(Field<Boolean> field) {
        setField(INSERT_AFTER, field);
    }
}
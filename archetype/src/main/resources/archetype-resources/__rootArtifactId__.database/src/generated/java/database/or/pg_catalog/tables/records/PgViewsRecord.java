/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables.records;


import ${package}.database.or.pg_catalog.tables.PgViews;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PgViewsRecord extends TableRecordImpl<PgViewsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = -894013849;

    /**
     * Setter for <code>pg_catalog.pg_views.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_views.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_views.viewname</code>.
     */
    public void setViewname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_views.viewname</code>.
     */
    public String getViewname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_views.viewowner</code>.
     */
    public void setViewowner(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_views.viewowner</code>.
     */
    public String getViewowner() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_views.definition</code>.
     */
    public void setDefinition(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_views.definition</code>.
     */
    public String getDefinition() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgViews.PG_VIEWS.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgViews.PG_VIEWS.VIEWNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgViews.PG_VIEWS.VIEWOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgViews.PG_VIEWS.DEFINITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getViewname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getViewowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getViewname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getViewowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgViewsRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgViewsRecord value2(String value) {
        setViewname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgViewsRecord value3(String value) {
        setViewowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgViewsRecord value4(String value) {
        setDefinition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgViewsRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgViewsRecord
     */
    public PgViewsRecord() {
        super(PgViews.PG_VIEWS);
    }

    /**
     * Create a detached, initialised PgViewsRecord
     */
    public PgViewsRecord(String schemaname, String viewname, String viewowner, String definition) {
        super(PgViews.PG_VIEWS);

        set(0, schemaname);
        set(1, viewname);
        set(2, viewowner);
        set(3, definition);
    }
}

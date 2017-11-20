/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables.records;


import com.acme.application.database.or.pg_catalog.tables.PgAttrdef;

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
public class PgAttrdefRecord extends TableRecordImpl<PgAttrdefRecord> implements Record4<Long, Short, Object, String> {

    private static final long serialVersionUID = -36426351;

    /**
     * Setter for <code>pg_catalog.pg_attrdef.adrelid</code>.
     */
    public void setAdrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attrdef.adrelid</code>.
     */
    public Long getAdrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_attrdef.adnum</code>.
     */
    public void setAdnum(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attrdef.adnum</code>.
     */
    public Short getAdnum() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_attrdef.adbin</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setAdbin(Object value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attrdef.adbin</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getAdbin() {
        return (Object) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_attrdef.adsrc</code>.
     */
    public void setAdsrc(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attrdef.adsrc</code>.
     */
    public String getAdsrc() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Short, Object, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Short, Object, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgAttrdef.PG_ATTRDEF.ADRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return PgAttrdef.PG_ATTRDEF.ADNUM;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field3() {
        return PgAttrdef.PG_ATTRDEF.ADBIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgAttrdef.PG_ATTRDEF.ADSRC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getAdrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getAdnum();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component3() {
        return getAdbin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAdsrc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getAdrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getAdnum();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value3() {
        return getAdbin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAdsrc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttrdefRecord value1(Long value) {
        setAdrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttrdefRecord value2(Short value) {
        setAdnum(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public PgAttrdefRecord value3(Object value) {
        setAdbin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttrdefRecord value4(String value) {
        setAdsrc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttrdefRecord values(Long value1, Short value2, Object value3, String value4) {
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
     * Create a detached PgAttrdefRecord
     */
    public PgAttrdefRecord() {
        super(PgAttrdef.PG_ATTRDEF);
    }

    /**
     * Create a detached, initialised PgAttrdefRecord
     */
    public PgAttrdefRecord(Long adrelid, Short adnum, Object adbin, String adsrc) {
        super(PgAttrdef.PG_ATTRDEF);

        set(0, adrelid);
        set(1, adnum);
        set(2, adbin);
        set(3, adsrc);
    }
}
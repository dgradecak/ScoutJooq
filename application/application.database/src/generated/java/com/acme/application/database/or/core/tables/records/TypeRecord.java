/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.core.tables.records;


import com.acme.application.database.or.core.tables.Type;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TypeRecord extends UpdatableRecordImpl<TypeRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -1168021544;

    /**
     * Setter for <code>core.TYPE.ID</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>core.TYPE.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>core.TYPE.CODE_TYPE</code>.
     */
    public void setCodeType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>core.TYPE.CODE_TYPE</code>.
     */
    public String getCodeType() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Type.TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Type.TYPE.CODE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCodeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCodeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeRecord value2(String value) {
        setCodeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TypeRecord
     */
    public TypeRecord() {
        super(Type.TYPE);
    }

    /**
     * Create a detached, initialised TypeRecord
     */
    public TypeRecord(String id, String codeType) {
        super(Type.TYPE);

        set(0, id);
        set(1, codeType);
    }
}

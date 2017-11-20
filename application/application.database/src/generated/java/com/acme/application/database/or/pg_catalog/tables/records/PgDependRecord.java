/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables.records;


import com.acme.application.database.or.pg_catalog.tables.PgDepend;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class PgDependRecord extends TableRecordImpl<PgDependRecord> implements Record7<Long, Long, Integer, Long, Long, Integer, String> {

    private static final long serialVersionUID = -1235299746;

    /**
     * Setter for <code>pg_catalog.pg_depend.classid</code>.
     */
    public void setClassid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.classid</code>.
     */
    public Long getClassid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.objid</code>.
     */
    public void setObjid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.objid</code>.
     */
    public Long getObjid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.objsubid</code>.
     */
    public void setObjsubid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.objsubid</code>.
     */
    public Integer getObjsubid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.refclassid</code>.
     */
    public void setRefclassid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.refclassid</code>.
     */
    public Long getRefclassid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.refobjid</code>.
     */
    public void setRefobjid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.refobjid</code>.
     */
    public Long getRefobjid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.refobjsubid</code>.
     */
    public void setRefobjsubid(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.refobjsubid</code>.
     */
    public Integer getRefobjsubid() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.deptype</code>.
     */
    public void setDeptype(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.deptype</code>.
     */
    public String getDeptype() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Integer, Long, Long, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Integer, Long, Long, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgDepend.PG_DEPEND.CLASSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgDepend.PG_DEPEND.OBJID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PgDepend.PG_DEPEND.OBJSUBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgDepend.PG_DEPEND.REFCLASSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PgDepend.PG_DEPEND.REFOBJID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return PgDepend.PG_DEPEND.REFOBJSUBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PgDepend.PG_DEPEND.DEPTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getClassid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getObjid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getObjsubid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getRefclassid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getRefobjid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getRefobjsubid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDeptype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getClassid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getObjid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getObjsubid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getRefclassid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getRefobjid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRefobjsubid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDeptype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDependRecord value1(Long value) {
        setClassid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDependRecord value2(Long value) {
        setObjid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDependRecord value3(Integer value) {
        setObjsubid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDependRecord value4(Long value) {
        setRefclassid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDependRecord value5(Long value) {
        setRefobjid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDependRecord value6(Integer value) {
        setRefobjsubid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDependRecord value7(String value) {
        setDeptype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDependRecord values(Long value1, Long value2, Integer value3, Long value4, Long value5, Integer value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgDependRecord
     */
    public PgDependRecord() {
        super(PgDepend.PG_DEPEND);
    }

    /**
     * Create a detached, initialised PgDependRecord
     */
    public PgDependRecord(Long classid, Long objid, Integer objsubid, Long refclassid, Long refobjid, Integer refobjsubid, String deptype) {
        super(PgDepend.PG_DEPEND);

        set(0, classid);
        set(1, objid);
        set(2, objsubid);
        set(3, refclassid);
        set(4, refobjid);
        set(5, refobjsubid);
        set(6, deptype);
    }
}

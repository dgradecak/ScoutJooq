/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables.records;


import ${package}.database.or.pg_catalog.tables.PgCast;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class PgCastRecord extends TableRecordImpl<PgCastRecord> implements Record5<Long, Long, Long, String, String> {

    private static final long serialVersionUID = 1612829629;

    /**
     * Setter for <code>pg_catalog.pg_cast.castsource</code>.
     */
    public void setCastsource(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castsource</code>.
     */
    public Long getCastsource() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.casttarget</code>.
     */
    public void setCasttarget(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.casttarget</code>.
     */
    public Long getCasttarget() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castfunc</code>.
     */
    public void setCastfunc(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castfunc</code>.
     */
    public Long getCastfunc() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castcontext</code>.
     */
    public void setCastcontext(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castcontext</code>.
     */
    public String getCastcontext() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castmethod</code>.
     */
    public void setCastmethod(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castmethod</code>.
     */
    public String getCastmethod() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgCast.PG_CAST.CASTSOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgCast.PG_CAST.CASTTARGET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgCast.PG_CAST.CASTFUNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgCast.PG_CAST.CASTCONTEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgCast.PG_CAST.CASTMETHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getCastsource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCasttarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getCastfunc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCastcontext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCastmethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getCastsource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCasttarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getCastfunc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCastcontext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCastmethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCastRecord value1(Long value) {
        setCastsource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCastRecord value2(Long value) {
        setCasttarget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCastRecord value3(Long value) {
        setCastfunc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCastRecord value4(String value) {
        setCastcontext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCastRecord value5(String value) {
        setCastmethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCastRecord values(Long value1, Long value2, Long value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgCastRecord
     */
    public PgCastRecord() {
        super(PgCast.PG_CAST);
    }

    /**
     * Create a detached, initialised PgCastRecord
     */
    public PgCastRecord(Long castsource, Long casttarget, Long castfunc, String castcontext, String castmethod) {
        super(PgCast.PG_CAST);

        set(0, castsource);
        set(1, casttarget);
        set(2, castfunc);
        set(3, castcontext);
        set(4, castmethod);
    }
}

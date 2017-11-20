/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables.records;


import ${package}.database.or.pg_catalog.tables.PgConversion;

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
public class PgConversionRecord extends TableRecordImpl<PgConversionRecord> implements Record7<String, Long, Long, Integer, Integer, String, Boolean> {

    private static final long serialVersionUID = -460735748;

    /**
     * Setter for <code>pg_catalog.pg_conversion.conname</code>.
     */
    public void setConname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conname</code>.
     */
    public String getConname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.connamespace</code>.
     */
    public void setConnamespace(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.connamespace</code>.
     */
    public Long getConnamespace() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conowner</code>.
     */
    public void setConowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conowner</code>.
     */
    public Long getConowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conforencoding</code>.
     */
    public void setConforencoding(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conforencoding</code>.
     */
    public Integer getConforencoding() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.contoencoding</code>.
     */
    public void setContoencoding(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.contoencoding</code>.
     */
    public Integer getContoencoding() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conproc</code>.
     */
    public void setConproc(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conproc</code>.
     */
    public String getConproc() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.condefault</code>.
     */
    public void setCondefault(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.condefault</code>.
     */
    public Boolean getCondefault() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, Long, Integer, Integer, String, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, Long, Integer, Integer, String, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgConversion.PG_CONVERSION.CONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgConversion.PG_CONVERSION.CONNAMESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgConversion.PG_CONVERSION.CONOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PgConversion.PG_CONVERSION.CONFORENCODING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return PgConversion.PG_CONVERSION.CONTOENCODING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgConversion.PG_CONVERSION.CONPROC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return PgConversion.PG_CONVERSION.CONDEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getConname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getConnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getConowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getConforencoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getContoencoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getConproc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getCondefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getConname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getConnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getConowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getConforencoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getContoencoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getConproc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getCondefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgConversionRecord value1(String value) {
        setConname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgConversionRecord value2(Long value) {
        setConnamespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgConversionRecord value3(Long value) {
        setConowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgConversionRecord value4(Integer value) {
        setConforencoding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgConversionRecord value5(Integer value) {
        setContoencoding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgConversionRecord value6(String value) {
        setConproc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgConversionRecord value7(Boolean value) {
        setCondefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgConversionRecord values(String value1, Long value2, Long value3, Integer value4, Integer value5, String value6, Boolean value7) {
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
     * Create a detached PgConversionRecord
     */
    public PgConversionRecord() {
        super(PgConversion.PG_CONVERSION);
    }

    /**
     * Create a detached, initialised PgConversionRecord
     */
    public PgConversionRecord(String conname, Long connamespace, Long conowner, Integer conforencoding, Integer contoencoding, String conproc, Boolean condefault) {
        super(PgConversion.PG_CONVERSION);

        set(0, conname);
        set(1, connamespace);
        set(2, conowner);
        set(3, conforencoding);
        set(4, contoencoding);
        set(5, conproc);
        set(6, condefault);
    }
}

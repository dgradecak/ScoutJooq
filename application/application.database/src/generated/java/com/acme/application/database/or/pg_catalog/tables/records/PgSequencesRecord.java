/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables.records;


import com.acme.application.database.or.pg_catalog.tables.PgSequences;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class PgSequencesRecord extends TableRecordImpl<PgSequencesRecord> implements Record11<String, String, String, Object, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Boolean, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -100593537;

    /**
     * Setter for <code>pg_catalog.pg_sequences.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.sequencename</code>.
     */
    public void setSequencename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.sequencename</code>.
     */
    public String getSequencename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.sequenceowner</code>.
     */
    public void setSequenceowner(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.sequenceowner</code>.
     */
    public String getSequenceowner() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.data_type</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setDataType(Object value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.data_type</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getDataType() {
        return (Object) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.start_value</code>.
     */
    public void setStartValue(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.start_value</code>.
     */
    public BigDecimal getStartValue() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.min_value</code>.
     */
    public void setMinValue(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.min_value</code>.
     */
    public BigDecimal getMinValue() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.max_value</code>.
     */
    public void setMaxValue(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.max_value</code>.
     */
    public BigDecimal getMaxValue() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.increment_by</code>.
     */
    public void setIncrementBy(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.increment_by</code>.
     */
    public BigDecimal getIncrementBy() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.cycle</code>.
     */
    public void setCycle(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.cycle</code>.
     */
    public Boolean getCycle() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.cache_size</code>.
     */
    public void setCacheSize(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.cache_size</code>.
     */
    public BigDecimal getCacheSize() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.last_value</code>.
     */
    public void setLastValue(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.last_value</code>.
     */
    public BigDecimal getLastValue() {
        return (BigDecimal) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Object, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Boolean, BigDecimal, BigDecimal> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Object, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Boolean, BigDecimal, BigDecimal> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgSequences.PG_SEQUENCES.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgSequences.PG_SEQUENCES.SEQUENCENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgSequences.PG_SEQUENCES.SEQUENCEOWNER;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field4() {
        return PgSequences.PG_SEQUENCES.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return PgSequences.PG_SEQUENCES.START_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return PgSequences.PG_SEQUENCES.MIN_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return PgSequences.PG_SEQUENCES.MAX_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return PgSequences.PG_SEQUENCES.INCREMENT_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return PgSequences.PG_SEQUENCES.CYCLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return PgSequences.PG_SEQUENCES.CACHE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return PgSequences.PG_SEQUENCES.LAST_VALUE;
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
        return getSequencename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSequenceowner();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component4() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getStartValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getMinValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getMaxValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getIncrementBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getCycle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getCacheSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getLastValue();
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
        return getSequencename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSequenceowner();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value4() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getStartValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getMinValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getMaxValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getIncrementBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getCycle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getCacheSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getLastValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value2(String value) {
        setSequencename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value3(String value) {
        setSequenceowner(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public PgSequencesRecord value4(Object value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value5(BigDecimal value) {
        setStartValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value6(BigDecimal value) {
        setMinValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value7(BigDecimal value) {
        setMaxValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value8(BigDecimal value) {
        setIncrementBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value9(Boolean value) {
        setCycle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value10(BigDecimal value) {
        setCacheSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord value11(BigDecimal value) {
        setLastValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequencesRecord values(String value1, String value2, String value3, Object value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, Boolean value9, BigDecimal value10, BigDecimal value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgSequencesRecord
     */
    public PgSequencesRecord() {
        super(PgSequences.PG_SEQUENCES);
    }

    /**
     * Create a detached, initialised PgSequencesRecord
     */
    public PgSequencesRecord(String schemaname, String sequencename, String sequenceowner, Object dataType, BigDecimal startValue, BigDecimal minValue, BigDecimal maxValue, BigDecimal incrementBy, Boolean cycle, BigDecimal cacheSize, BigDecimal lastValue) {
        super(PgSequences.PG_SEQUENCES);

        set(0, schemaname);
        set(1, sequencename);
        set(2, sequenceowner);
        set(3, dataType);
        set(4, startValue);
        set(5, minValue);
        set(6, maxValue);
        set(7, incrementBy);
        set(8, cycle);
        set(9, cacheSize);
        set(10, lastValue);
    }
}

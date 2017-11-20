/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.information_schema.tables.records;


import com.acme.application.database.or.information_schema.tables.Sequences;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class SequencesRecord extends TableRecordImpl<SequencesRecord> implements Record12<String, String, String, String, Integer, Integer, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 1574898090;

    /**
     * Setter for <code>information_schema.sequences.sequence_catalog</code>.
     */
    public void setSequenceCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.sequences.sequence_catalog</code>.
     */
    public String getSequenceCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.sequences.sequence_schema</code>.
     */
    public void setSequenceSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.sequences.sequence_schema</code>.
     */
    public String getSequenceSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.sequences.sequence_name</code>.
     */
    public void setSequenceName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.sequences.sequence_name</code>.
     */
    public String getSequenceName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.sequences.data_type</code>.
     */
    public void setDataType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.sequences.data_type</code>.
     */
    public String getDataType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.sequences.numeric_precision</code>.
     */
    public void setNumericPrecision(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.sequences.numeric_precision</code>.
     */
    public Integer getNumericPrecision() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>information_schema.sequences.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.sequences.numeric_precision_radix</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>information_schema.sequences.numeric_scale</code>.
     */
    public void setNumericScale(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.sequences.numeric_scale</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>information_schema.sequences.start_value</code>.
     */
    public void setStartValue(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.sequences.start_value</code>.
     */
    public String getStartValue() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.sequences.minimum_value</code>.
     */
    public void setMinimumValue(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.sequences.minimum_value</code>.
     */
    public String getMinimumValue() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.sequences.maximum_value</code>.
     */
    public void setMaximumValue(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.sequences.maximum_value</code>.
     */
    public String getMaximumValue() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.sequences.increment</code>.
     */
    public void setIncrement(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.sequences.increment</code>.
     */
    public String getIncrement() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.sequences.cycle_option</code>.
     */
    public void setCycleOption(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.sequences.cycle_option</code>.
     */
    public String getCycleOption() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, String, Integer, Integer, Integer, String, String, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, String, Integer, Integer, Integer, String, String, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Sequences.SEQUENCES.SEQUENCE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Sequences.SEQUENCES.SEQUENCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Sequences.SEQUENCES.SEQUENCE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Sequences.SEQUENCES.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Sequences.SEQUENCES.NUMERIC_PRECISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Sequences.SEQUENCES.NUMERIC_PRECISION_RADIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Sequences.SEQUENCES.NUMERIC_SCALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Sequences.SEQUENCES.START_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Sequences.SEQUENCES.MINIMUM_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Sequences.SEQUENCES.MAXIMUM_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Sequences.SEQUENCES.INCREMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Sequences.SEQUENCES.CYCLE_OPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSequenceCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSequenceSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSequenceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getNumericPrecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getNumericPrecisionRadix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getNumericScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getStartValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getMinimumValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getMaximumValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getIncrement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCycleOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSequenceCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSequenceSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSequenceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getNumericPrecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getNumericPrecisionRadix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getNumericScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getStartValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMinimumValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getMaximumValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getIncrement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCycleOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value1(String value) {
        setSequenceCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value2(String value) {
        setSequenceSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value3(String value) {
        setSequenceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value4(String value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value5(Integer value) {
        setNumericPrecision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value6(Integer value) {
        setNumericPrecisionRadix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value7(Integer value) {
        setNumericScale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value8(String value) {
        setStartValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value9(String value) {
        setMinimumValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value10(String value) {
        setMaximumValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value11(String value) {
        setIncrement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord value12(String value) {
        setCycleOption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SequencesRecord values(String value1, String value2, String value3, String value4, Integer value5, Integer value6, Integer value7, String value8, String value9, String value10, String value11, String value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SequencesRecord
     */
    public SequencesRecord() {
        super(Sequences.SEQUENCES);
    }

    /**
     * Create a detached, initialised SequencesRecord
     */
    public SequencesRecord(String sequenceCatalog, String sequenceSchema, String sequenceName, String dataType, Integer numericPrecision, Integer numericPrecisionRadix, Integer numericScale, String startValue, String minimumValue, String maximumValue, String increment, String cycleOption) {
        super(Sequences.SEQUENCES);

        set(0, sequenceCatalog);
        set(1, sequenceSchema);
        set(2, sequenceName);
        set(3, dataType);
        set(4, numericPrecision);
        set(5, numericPrecisionRadix);
        set(6, numericScale);
        set(7, startValue);
        set(8, minimumValue);
        set(9, maximumValue);
        set(10, increment);
        set(11, cycleOption);
    }
}

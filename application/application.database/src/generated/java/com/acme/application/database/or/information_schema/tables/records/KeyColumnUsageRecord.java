/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.information_schema.tables.records;


import com.acme.application.database.or.information_schema.tables.KeyColumnUsage;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class KeyColumnUsageRecord extends TableRecordImpl<KeyColumnUsageRecord> implements Record9<String, String, String, String, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = 1720619551;

    /**
     * Setter for <code>information_schema.key_column_usage.constraint_catalog</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.key_column_usage.constraint_catalog</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.key_column_usage.constraint_schema</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.key_column_usage.constraint_schema</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.key_column_usage.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.key_column_usage.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.key_column_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.key_column_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.key_column_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.key_column_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.key_column_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.key_column_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.key_column_usage.column_name</code>.
     */
    public void setColumnName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.key_column_usage.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.key_column_usage.ordinal_position</code>.
     */
    public void setOrdinalPosition(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.key_column_usage.ordinal_position</code>.
     */
    public Integer getOrdinalPosition() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>information_schema.key_column_usage.position_in_unique_constraint</code>.
     */
    public void setPositionInUniqueConstraint(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.key_column_usage.position_in_unique_constraint</code>.
     */
    public Integer getPositionInUniqueConstraint() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, String, String, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, String, String, Integer, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.ORDINAL_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getOrdinalPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getPositionInUniqueConstraint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getOrdinalPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getPositionInUniqueConstraint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value4(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value5(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value6(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value7(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value8(Integer value) {
        setOrdinalPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value9(Integer value) {
        setPositionInUniqueConstraint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Integer value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KeyColumnUsageRecord
     */
    public KeyColumnUsageRecord() {
        super(KeyColumnUsage.KEY_COLUMN_USAGE);
    }

    /**
     * Create a detached, initialised KeyColumnUsageRecord
     */
    public KeyColumnUsageRecord(String constraintCatalog, String constraintSchema, String constraintName, String tableCatalog, String tableSchema, String tableName, String columnName, Integer ordinalPosition, Integer positionInUniqueConstraint) {
        super(KeyColumnUsage.KEY_COLUMN_USAGE);

        set(0, constraintCatalog);
        set(1, constraintSchema);
        set(2, constraintName);
        set(3, tableCatalog);
        set(4, tableSchema);
        set(5, tableName);
        set(6, columnName);
        set(7, ordinalPosition);
        set(8, positionInUniqueConstraint);
    }
}

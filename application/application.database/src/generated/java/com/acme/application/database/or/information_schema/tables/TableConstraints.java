/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.information_schema.tables;


import com.acme.application.database.or.information_schema.InformationSchema;
import com.acme.application.database.or.information_schema.tables.records.TableConstraintsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TableConstraints extends TableImpl<TableConstraintsRecord> {

    private static final long serialVersionUID = 1108062068;

    /**
     * The reference instance of <code>information_schema.table_constraints</code>
     */
    public static final TableConstraints TABLE_CONSTRAINTS = new TableConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TableConstraintsRecord> getRecordType() {
        return TableConstraintsRecord.class;
    }

    /**
     * The column <code>information_schema.table_constraints.constraint_catalog</code>.
     */
    public final TableField<TableConstraintsRecord, String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.constraint_schema</code>.
     */
    public final TableField<TableConstraintsRecord, String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.constraint_name</code>.
     */
    public final TableField<TableConstraintsRecord, String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.table_catalog</code>.
     */
    public final TableField<TableConstraintsRecord, String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.table_schema</code>.
     */
    public final TableField<TableConstraintsRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.table_name</code>.
     */
    public final TableField<TableConstraintsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.constraint_type</code>.
     */
    public final TableField<TableConstraintsRecord, String> CONSTRAINT_TYPE = createField("constraint_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.is_deferrable</code>.
     */
    public final TableField<TableConstraintsRecord, String> IS_DEFERRABLE = createField("is_deferrable", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.table_constraints.initially_deferred</code>.
     */
    public final TableField<TableConstraintsRecord, String> INITIALLY_DEFERRED = createField("initially_deferred", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>information_schema.table_constraints</code> table reference
     */
    public TableConstraints() {
        this(DSL.name("table_constraints"), null);
    }

    /**
     * Create an aliased <code>information_schema.table_constraints</code> table reference
     */
    public TableConstraints(String alias) {
        this(DSL.name(alias), TABLE_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>information_schema.table_constraints</code> table reference
     */
    public TableConstraints(Name alias) {
        this(alias, TABLE_CONSTRAINTS);
    }

    private TableConstraints(Name alias, Table<TableConstraintsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TableConstraints(Name alias, Table<TableConstraintsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraints as(String alias) {
        return new TableConstraints(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraints as(Name alias) {
        return new TableConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(String name) {
        return new TableConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(Name name) {
        return new TableConstraints(name, null);
    }
}

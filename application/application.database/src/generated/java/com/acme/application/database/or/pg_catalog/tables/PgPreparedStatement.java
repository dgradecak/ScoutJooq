/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables;


import com.acme.application.database.or.pg_catalog.PgCatalog;
import com.acme.application.database.or.pg_catalog.tables.records.PgPreparedStatementRecord;

import java.time.OffsetDateTime;

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
public class PgPreparedStatement extends TableImpl<PgPreparedStatementRecord> {

    private static final long serialVersionUID = -303008761;

    /**
     * The reference instance of <code>pg_catalog.pg_prepared_statement</code>
     */
    public static final PgPreparedStatement PG_PREPARED_STATEMENT = new PgPreparedStatement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPreparedStatementRecord> getRecordType() {
        return PgPreparedStatementRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_prepared_statement.name</code>.
     */
    public final TableField<PgPreparedStatementRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statement.statement</code>.
     */
    public final TableField<PgPreparedStatementRecord, String> STATEMENT = createField("statement", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statement.prepare_time</code>.
     */
    public final TableField<PgPreparedStatementRecord, OffsetDateTime> PREPARE_TIME = createField("prepare_time", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statement.parameter_types</code>.
     */
    public final TableField<PgPreparedStatementRecord, Object[]> PARAMETER_TYPES = createField("parameter_types", org.jooq.impl.DefaultDataType.getDefaultDataType("regtype").getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statement.from_sql</code>.
     */
    public final TableField<PgPreparedStatementRecord, Boolean> FROM_SQL = createField("from_sql", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>pg_catalog.pg_prepared_statement</code> table reference
     */
    public PgPreparedStatement() {
        this(DSL.name("pg_prepared_statement"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_statement</code> table reference
     */
    public PgPreparedStatement(String alias) {
        this(DSL.name(alias), PG_PREPARED_STATEMENT);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_statement</code> table reference
     */
    public PgPreparedStatement(Name alias) {
        this(alias, PG_PREPARED_STATEMENT);
    }

    private PgPreparedStatement(Name alias, Table<PgPreparedStatementRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgPreparedStatement(Name alias, Table<PgPreparedStatementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedStatement as(String alias) {
        return new PgPreparedStatement(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedStatement as(Name alias) {
        return new PgPreparedStatement(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedStatement rename(String name) {
        return new PgPreparedStatement(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedStatement rename(Name name) {
        return new PgPreparedStatement(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgPreparedStatement call() {
        return new PgPreparedStatement(DSL.name(getName()), null, new Field[] { 
        });
    }
}

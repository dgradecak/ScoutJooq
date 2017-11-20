/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables;


import com.acme.application.database.generator.converter.LongConverter;
import com.acme.application.database.or.pg_catalog.PgCatalog;
import com.acme.application.database.or.pg_catalog.tables.records.PgStatXactUserFunctionsRecord;

import java.math.BigDecimal;

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
public class PgStatXactUserFunctions extends TableImpl<PgStatXactUserFunctionsRecord> {

    private static final long serialVersionUID = -1467837983;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_xact_user_functions</code>
     */
    public static final PgStatXactUserFunctions PG_STAT_XACT_USER_FUNCTIONS = new PgStatXactUserFunctions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatXactUserFunctionsRecord> getRecordType() {
        return PgStatXactUserFunctionsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.funcid</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Long> FUNCID = createField("funcid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.schemaname</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.funcname</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, String> FUNCNAME = createField("funcname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.calls</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, BigDecimal> CALLS = createField("calls", org.jooq.impl.SQLDataType.BIGINT, this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.total_time</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Double> TOTAL_TIME = createField("total_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_user_functions.self_time</code>.
     */
    public final TableField<PgStatXactUserFunctionsRecord, Double> SELF_TIME = createField("self_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_xact_user_functions</code> table reference
     */
    public PgStatXactUserFunctions() {
        this(DSL.name("pg_stat_xact_user_functions"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_functions</code> table reference
     */
    public PgStatXactUserFunctions(String alias) {
        this(DSL.name(alias), PG_STAT_XACT_USER_FUNCTIONS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_user_functions</code> table reference
     */
    public PgStatXactUserFunctions(Name alias) {
        this(alias, PG_STAT_XACT_USER_FUNCTIONS);
    }

    private PgStatXactUserFunctions(Name alias, Table<PgStatXactUserFunctionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatXactUserFunctions(Name alias, Table<PgStatXactUserFunctionsRecord> aliased, Field<?>[] parameters) {
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
    public PgStatXactUserFunctions as(String alias) {
        return new PgStatXactUserFunctions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatXactUserFunctions as(Name alias) {
        return new PgStatXactUserFunctions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactUserFunctions rename(String name) {
        return new PgStatXactUserFunctions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactUserFunctions rename(Name name) {
        return new PgStatXactUserFunctions(name, null);
    }
}

/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables;


import ${package}.database.or.pg_catalog.PgCatalog;
import ${package}.database.or.pg_catalog.tables.records.PgPreparedXactRecord;

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
public class PgPreparedXact extends TableImpl<PgPreparedXactRecord> {

    private static final long serialVersionUID = 993042254;

    /**
     * The reference instance of <code>pg_catalog.pg_prepared_xact</code>
     */
    public static final PgPreparedXact PG_PREPARED_XACT = new PgPreparedXact();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPreparedXactRecord> getRecordType() {
        return PgPreparedXactRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_prepared_xact.transaction</code>.
     */
    public final TableField<PgPreparedXactRecord, Long> TRANSACTION = createField("transaction", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xact.gid</code>.
     */
    public final TableField<PgPreparedXactRecord, String> GID = createField("gid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xact.prepared</code>.
     */
    public final TableField<PgPreparedXactRecord, OffsetDateTime> PREPARED = createField("prepared", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xact.ownerid</code>.
     */
    public final TableField<PgPreparedXactRecord, Long> OWNERID = createField("ownerid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xact.dbid</code>.
     */
    public final TableField<PgPreparedXactRecord, Long> DBID = createField("dbid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_prepared_xact</code> table reference
     */
    public PgPreparedXact() {
        this(DSL.name("pg_prepared_xact"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_xact</code> table reference
     */
    public PgPreparedXact(String alias) {
        this(DSL.name(alias), PG_PREPARED_XACT);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_xact</code> table reference
     */
    public PgPreparedXact(Name alias) {
        this(alias, PG_PREPARED_XACT);
    }

    private PgPreparedXact(Name alias, Table<PgPreparedXactRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgPreparedXact(Name alias, Table<PgPreparedXactRecord> aliased, Field<?>[] parameters) {
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
    public PgPreparedXact as(String alias) {
        return new PgPreparedXact(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXact as(Name alias) {
        return new PgPreparedXact(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXact rename(String name) {
        return new PgPreparedXact(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXact rename(Name name) {
        return new PgPreparedXact(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgPreparedXact call() {
        return new PgPreparedXact(DSL.name(getName()), null, new Field[] { 
        });
    }
}

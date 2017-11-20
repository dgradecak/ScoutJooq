/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables;


import ${package}.database.or.pg_catalog.PgCatalog;
import ${package}.database.or.pg_catalog.tables.records.PgLocksRecord;

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
public class PgLocks extends TableImpl<PgLocksRecord> {

    private static final long serialVersionUID = 1105359013;

    /**
     * The reference instance of <code>pg_catalog.pg_locks</code>
     */
    public static final PgLocks PG_LOCKS = new PgLocks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLocksRecord> getRecordType() {
        return PgLocksRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_locks.locktype</code>.
     */
    public final TableField<PgLocksRecord, String> LOCKTYPE = createField("locktype", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.database</code>.
     */
    public final TableField<PgLocksRecord, Long> DATABASE = createField("database", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.relation</code>.
     */
    public final TableField<PgLocksRecord, Long> RELATION = createField("relation", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.page</code>.
     */
    public final TableField<PgLocksRecord, Integer> PAGE = createField("page", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.tuple</code>.
     */
    public final TableField<PgLocksRecord, Short> TUPLE = createField("tuple", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.virtualxid</code>.
     */
    public final TableField<PgLocksRecord, String> VIRTUALXID = createField("virtualxid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.transactionid</code>.
     */
    public final TableField<PgLocksRecord, Long> TRANSACTIONID = createField("transactionid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.classid</code>.
     */
    public final TableField<PgLocksRecord, Long> CLASSID = createField("classid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.objid</code>.
     */
    public final TableField<PgLocksRecord, Long> OBJID = createField("objid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.objsubid</code>.
     */
    public final TableField<PgLocksRecord, Short> OBJSUBID = createField("objsubid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.virtualtransaction</code>.
     */
    public final TableField<PgLocksRecord, String> VIRTUALTRANSACTION = createField("virtualtransaction", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.pid</code>.
     */
    public final TableField<PgLocksRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.mode</code>.
     */
    public final TableField<PgLocksRecord, String> MODE = createField("mode", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.granted</code>.
     */
    public final TableField<PgLocksRecord, Boolean> GRANTED = createField("granted", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_locks.fastpath</code>.
     */
    public final TableField<PgLocksRecord, Boolean> FASTPATH = createField("fastpath", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>pg_catalog.pg_locks</code> table reference
     */
    public PgLocks() {
        this(DSL.name("pg_locks"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_locks</code> table reference
     */
    public PgLocks(String alias) {
        this(DSL.name(alias), PG_LOCKS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_locks</code> table reference
     */
    public PgLocks(Name alias) {
        this(alias, PG_LOCKS);
    }

    private PgLocks(Name alias, Table<PgLocksRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgLocks(Name alias, Table<PgLocksRecord> aliased, Field<?>[] parameters) {
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
    public PgLocks as(String alias) {
        return new PgLocks(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLocks as(Name alias) {
        return new PgLocks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLocks rename(String name) {
        return new PgLocks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLocks rename(Name name) {
        return new PgLocks(name, null);
    }
}

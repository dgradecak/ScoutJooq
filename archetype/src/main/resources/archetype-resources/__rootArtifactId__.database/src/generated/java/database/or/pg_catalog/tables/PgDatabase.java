/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables;


import ${package}.database.or.pg_catalog.Indexes;
import ${package}.database.or.pg_catalog.PgCatalog;
import ${package}.database.or.pg_catalog.tables.records.PgDatabaseRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
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
public class PgDatabase extends TableImpl<PgDatabaseRecord> {

    private static final long serialVersionUID = 307771936;

    /**
     * The reference instance of <code>pg_catalog.pg_database</code>
     */
    public static final PgDatabase PG_DATABASE = new PgDatabase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgDatabaseRecord> getRecordType() {
        return PgDatabaseRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_database.datname</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATNAME = createField("datname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datdba</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATDBA = createField("datdba", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.encoding</code>.
     */
    public final TableField<PgDatabaseRecord, Integer> ENCODING = createField("encoding", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datcollate</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATCOLLATE = createField("datcollate", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datctype</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATCTYPE = createField("datctype", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datistemplate</code>.
     */
    public final TableField<PgDatabaseRecord, Boolean> DATISTEMPLATE = createField("datistemplate", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datallowconn</code>.
     */
    public final TableField<PgDatabaseRecord, Boolean> DATALLOWCONN = createField("datallowconn", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    public final TableField<PgDatabaseRecord, Integer> DATCONNLIMIT = createField("datconnlimit", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datlastsysoid</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATLASTSYSOID = createField("datlastsysoid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATFROZENXID = createField("datfrozenxid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datminmxid</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATMINMXID = createField("datminmxid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.dattablespace</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATTABLESPACE = createField("dattablespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datacl</code>.
     */
    public final TableField<PgDatabaseRecord, String[]> DATACL = createField("datacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_database</code> table reference
     */
    public PgDatabase() {
        this(DSL.name("pg_database"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_database</code> table reference
     */
    public PgDatabase(String alias) {
        this(DSL.name(alias), PG_DATABASE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_database</code> table reference
     */
    public PgDatabase(Name alias) {
        this(alias, PG_DATABASE);
    }

    private PgDatabase(Name alias, Table<PgDatabaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgDatabase(Name alias, Table<PgDatabaseRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_DATABASE_DATNAME_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabase as(String alias) {
        return new PgDatabase(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDatabase as(Name alias) {
        return new PgDatabase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDatabase rename(String name) {
        return new PgDatabase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDatabase rename(Name name) {
        return new PgDatabase(name, null);
    }
}

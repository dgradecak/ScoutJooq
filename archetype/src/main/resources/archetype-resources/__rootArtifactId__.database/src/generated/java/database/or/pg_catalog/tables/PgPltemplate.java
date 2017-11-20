/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables;


import ${package}.database.or.pg_catalog.Indexes;
import ${package}.database.or.pg_catalog.PgCatalog;
import ${package}.database.or.pg_catalog.tables.records.PgPltemplateRecord;

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
public class PgPltemplate extends TableImpl<PgPltemplateRecord> {

    private static final long serialVersionUID = -1817683801;

    /**
     * The reference instance of <code>pg_catalog.pg_pltemplate</code>
     */
    public static final PgPltemplate PG_PLTEMPLATE = new PgPltemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPltemplateRecord> getRecordType() {
        return PgPltemplateRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_pltemplate.tmplname</code>.
     */
    public final TableField<PgPltemplateRecord, String> TMPLNAME = createField("tmplname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_pltemplate.tmpltrusted</code>.
     */
    public final TableField<PgPltemplateRecord, Boolean> TMPLTRUSTED = createField("tmpltrusted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_pltemplate.tmpldbacreate</code>.
     */
    public final TableField<PgPltemplateRecord, Boolean> TMPLDBACREATE = createField("tmpldbacreate", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_pltemplate.tmplhandler</code>.
     */
    public final TableField<PgPltemplateRecord, String> TMPLHANDLER = createField("tmplhandler", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_pltemplate.tmplinline</code>.
     */
    public final TableField<PgPltemplateRecord, String> TMPLINLINE = createField("tmplinline", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_pltemplate.tmplvalidator</code>.
     */
    public final TableField<PgPltemplateRecord, String> TMPLVALIDATOR = createField("tmplvalidator", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_pltemplate.tmpllibrary</code>.
     */
    public final TableField<PgPltemplateRecord, String> TMPLLIBRARY = createField("tmpllibrary", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_pltemplate.tmplacl</code>.
     */
    public final TableField<PgPltemplateRecord, String[]> TMPLACL = createField("tmplacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_pltemplate</code> table reference
     */
    public PgPltemplate() {
        this(DSL.name("pg_pltemplate"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_pltemplate</code> table reference
     */
    public PgPltemplate(String alias) {
        this(DSL.name(alias), PG_PLTEMPLATE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_pltemplate</code> table reference
     */
    public PgPltemplate(Name alias) {
        this(alias, PG_PLTEMPLATE);
    }

    private PgPltemplate(Name alias, Table<PgPltemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPltemplate(Name alias, Table<PgPltemplateRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PG_PLTEMPLATE_NAME_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplate as(String alias) {
        return new PgPltemplate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplate as(Name alias) {
        return new PgPltemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPltemplate rename(String name) {
        return new PgPltemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPltemplate rename(Name name) {
        return new PgPltemplate(name, null);
    }
}
